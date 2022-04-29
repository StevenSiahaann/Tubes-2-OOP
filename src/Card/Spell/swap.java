package Card.Spell;
class swap extends   spell{ //perm
    private int duration;
    public swap(String ID,String Nama,String Desc,String imagepath,int mana,int duration){
        super(ID, Nama, Desc, imagepath, mana, "swap", false);
        this.duration=duration;
    }
    public int getDuration(){
        return this.duration;
    }
}
