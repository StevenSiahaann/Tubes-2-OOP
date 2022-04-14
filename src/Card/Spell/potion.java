package Card.Spell;
class potion extends spell{ //temp
    private String Type="TEMP";
    private double att;
    private double hp;
    private int duration;

    public potion(String ID,String Nama,String Desc,String imagepath,double mana,double att,double hp,int duration){
        super(ID, Nama, Desc, imagepath, mana);
        this.att=att;
        this.hp=hp;
        this.duration=duration;
    }
    //getter
    public String getType(){
        return this.Type;
    }
    public double getAtt(){
        return this.att;
    }
    public double hp(){
        return this.hp;
    }
    public int duration(){
        return this.duration;
    }
    //settter
    public void setAtt(double att){
        this.att=att;
    }
    public void setHp(double hp){
        this.hp=hp;
    }
    public void setDuration(int duration){
        this.duration=duration;
    }
}
