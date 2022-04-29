package Card.Spell;
import Card.Kartu;

class spell extends Kartu{
    private double mana;
    private String Type;
    private boolean isPerm;
    public spell(String ID,String Nama,String Desc,String imagepath,double mana,String Type, boolean isPerm){
        super(ID, Nama, Desc, imagepath,"Spell");
        this.mana=mana;
        this.type="";
        this.isPerm = isPerm;
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
