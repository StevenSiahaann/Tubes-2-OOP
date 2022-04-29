package Card.Karakter;

import Card.Kartu;

public class Karakter extends Kartu{
    private double attack;
    private double health;
    private double mana;
    private double attackup;
    private double healthup;
    public Karakter(String ID,String Nama,String Desc,String imagepath,double attack,double health,int mana,double attackup,double healthup,String Type){
        super(ID, Nama, Desc, imagepath,"Karakter");
        this.Type=Type;
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
        System.out.println(this.mana);
        System.out.println(this.attack);
        System.out.println(this.health);
        System.out.println(this.attackup);
        System.out.println(this.healthup);
    }

    /**
     * This method returns the attack value of a character.
     *
     * @return The attack value of a character.
     */
    public double getAtt(){
        return this.attack;
    }

    /**
     * This method returns the HP of a character.
     *
     * @return The HP of a character.
     */
    public double getHealth(){
        return this.health;
    }

    /**
     * This method returns the required mana of a character.
     *
     * @return The required mana of a character.
     */
    public double getMana(){
        return this.mana;
    }

    /**
     * This method returns the attack upgrade of a character.
     *
     * @return The attack upgrade of a character.
     */
    public double getAttUp(){
        return this.attack;
    }

    /**
     * This method returns the HP upgrade of a character.
     *
     * @return The HP upgrade of a character.
     */
    public double getHealthUp(){
        return this.health;
    }

    /**
     * This method sets the attack value of a character.
     *
     * @param att The attack value to be set in a character.
     */
    public void setAtt(double att){
        this.attack=att;
    }

    /**
     * This method sets the HP value of a character.
     *
     * @param health The HP value to be set in a character.
     */
    public void setHealth(double health){
        this.health=health;
    }

    /**
     * This method sets the mana value of a character.
     *
     * @param mana The mana value to be set in a character.
     */
    public void setMana(double mana){
        this.mana=mana;
    }

    /**
     * This method sets the attack upgrade of a character.
     *
     * @param attUp The attack upgrade to be set in a character.
     */
    public void setAttUp(double attUp){
        this.attackup=attUp;
    }

    /**
     * This method sets the HP upgrade of a character.
     *
     * @param healthUp The HP upgrade to be set in a character.
     */
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


