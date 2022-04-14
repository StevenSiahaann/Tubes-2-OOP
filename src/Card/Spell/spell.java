package Card.Spell;
import Card.Kartu;

class spell extends Kartu{
    private String jenis="Spell";
    private double mana;
    private String Type;
    public spell(String ID,String Nama,String Desc,String imagepath,double mana){
        super(ID, Nama, Desc, imagepath);
        this.mana=mana;
    }
    //getter
    public double getMana(){
        return this.mana;
    }
    public String getType(){
        return this.Type;
    }
    public String getJenis(){
        return this.jenis;
    }
    //setter
    public void setMana(double mana){
        this.mana=mana;
    }
}