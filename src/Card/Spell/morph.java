package Card.Spell;
class morph extends spell{//perm
    private String targetId;
    public morph(String ID,String Nama,String Desc,String imagepath,int mana,String targetId){
        super(ID, Nama, Desc, imagepath, mana, "Morph", true);
        this.targetId=targetId;
    }
    public String getTargetID(){
        return this.targetId;
    }
}
