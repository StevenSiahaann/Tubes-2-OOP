public class Overworld extends Karakter {
    String Type="Overworld";

    public Overworld(String ID,String Nama,String Desc,String imagepath,double attack,double health,int mana,double attackup,double healthup){
        super(ID, Nama, Desc, imagepath, attack, health, mana, attackup, healthup);
    }
    public String getType(){
        return this.Type;
    }
}
