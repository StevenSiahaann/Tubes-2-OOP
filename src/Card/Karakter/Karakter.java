package Card.Karakter;

import Card.Kartu;

public class Karakter extends Kartu{
    private String jenis="Karakter";
    private double attack;
    private double health;
    private double mana;
    private double attackup;
    private double healthup;
    public Karakter(String ID,String Nama,String Desc,String imagepath,double attack,double health,int mana,double attackup,double healthup){
        super(ID, Nama, Desc, imagepath);
        this.attack=attack;
        this.health=health;
        this.mana=mana;
        this.attackup=attackup;
        this.healthup=healthup;
    }
    @Override //gaperlu jg gapapa sebenernya
    //mo ngetest doang
    public void display(){
        super.display();
        System.out.println(this.jenis);
        System.out.println(this.mana);
        System.out.println(this.attack);
        System.out.println(this.health);
        System.out.println(this.attackup);
        System.out.println(this.healthup);
    }

    //getter
    public double getAtt(){
        return this.attack;
    }
    public double getHealth(){
        return this.health;
    }
    public double getMana(){
        return this.mana;
    }
    public double getAttUp(){
        return this.attack;
    }
    public double getHealthUp(){
        return this.health;
    }
    public String getJenis(){
        return this.jenis;
    }
    //setter
    public void setAtt(double att){
        this.attack=att;
    }
    public void setHealth(double health){
        this.health=health;
    }
    public void setMana(double mana){
        this.mana=mana;
    }
    public void setAttUp(double attUp){
        this.attackup=attUp;
    }
    public void setHealthUp(double healthUp){
        this.healthup=healthUp;
    }
}
// //Ketika sebuah karakter menyerang karakter musuh dengan tipe yang lebih lemah, maka damage yang diterima oleh karakter musuh adalah 2 kali attack karakter tersebut.
// //Ketika sebuah karakter menyerang karakter musuh dengan tipe yang lebih kuat, maka damage yang diterima oleh karakter musuh adalah 0.5 kali attack karakter tersebut.
//      double serang(Karakter karakter1,Karakter karakter2){
//          double damage;
//          //nether overworld end siklus
//          // nether vs overworld=nether
//          //overworld vs end = overworld
//          //end vs nether=end 
//          if(karakter1.Type=="Nether" && karakter2.Type=="Overworld"){
//              damage= 0.5* karakter1.getAtt();
//          }
//          if(karakter1.Type=="Overworld" && karakter2.Type=="End"){
//              damage= 0.5* karakter1.getAtt();
//          }
//          if(karakter1.Type=="End" && karakter2.Type=="Nether"){
//              damage= 0.5* karakter1.getAtt();
//          }
//          else{
//              damage=2*karakter1.getAtt();
//          }
//          return damage;
//      }


