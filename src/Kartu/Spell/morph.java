class morph extends spell{//perm
    private String Type="PERM";
    private String targetId;
    public morph(String ID,String Nama,String Desc,String imagepath,int mana,String targetId){
        super(ID, Nama, Desc, imagepath, mana);
        this.targetId=targetId;
    }
    //getter
    public String getType(){
        return this.Type;
    }
    public String getTargetID(){
        return this.targetId;
    }
}
