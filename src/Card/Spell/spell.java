package Card.Spell;
import Card.Kartu;

class spell extends Kartu{
    private double mana;
    private String Type;
    public spell(String ID,String Nama,String Desc,String imagepath,double mana,String Type){
        super(ID, Nama, Desc, imagepath,"Spell");
        this.mana=mana;
        this.type="";
    }
    //getter
    public double getMana(){
        return this.mana;
    }
    public String getType(){
        return this.Type;
    }
    //setter
    public void setMana(double mana){
        this.mana=mana;
    }
}