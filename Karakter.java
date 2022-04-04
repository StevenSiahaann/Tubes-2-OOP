class Karakter extends Kartu{
    double attack;
    double health;

    public Karakter(){
        this.attack=0;
        this.health=0;
    }
    public Karakter(double attack, double health){
        this.attack=attack;
        this.health=health;
    }
    //getter
    public double getAtt(){
        return this.attack;
    }
    public double getHealth(){
        return this.health;
    }
    //setter
    void setAtt(double att){
        this.attack=att;
    }
    void setHealth(double health){
        this.health=health;
    }
//Ketika sebuah karakter menyerang karakter musuh dengan tipe yang lebih lemah, maka damage yang diterima oleh karakter musuh adalah 2 kali attack karakter tersebut.
//Ketika sebuah karakter menyerang karakter musuh dengan tipe yang lebih kuat, maka damage yang diterima oleh karakter musuh adalah 0.5 kali attack karakter tersebut.

    double serang(Karakter karakter1,Karakter karakter2){
        double damage;
        //nether overworld end siklus
        // nether vs overworld=nether
        //overworld vs end = overworld
        //end vs nether=end 
        if(karakter1.Type=="Nether" && karakter2.Type=="Overworld"){
            damage= 0.5* karakter1.getAtt();
        }
        if(karakter1.Type=="Overworld" && karakter2.Type=="End"){
            damage= 0.5* karakter1.getAtt();
        }
        if(karakter1.Type=="End" && karakter2.Type=="Nether"){
            damage= 0.5* karakter1.getAtt();
        }
        else{
            damage=2*karakter1.getAtt();
        }
        return damage;
    }
}

