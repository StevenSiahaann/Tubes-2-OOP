class swap extends   spell{ //perm
    private String Type="PERM";
    private int duration;
    public swap(String ID,String Nama,String Desc,String imagepath,int mana,int duration){
        super(ID, Nama, Desc, imagepath, mana);
        this.duration=duration;
    }
    public String getType(){
        return this.Type;
    }
    public int getDuration(){
        return this.duration;
    }
}
