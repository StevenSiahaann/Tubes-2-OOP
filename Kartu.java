class Kartu {
    public String Nama;
    public String Desc;
    public String Type; //type si spell sama type si karakter
    public String jenis; // karakter atau spell
    public int row;
    public int col;
    public Kartu(){
        this.Nama="";
        this.Desc="";
        this.Type=""; //Overworld, Nether, atau End buat si karakter, spell : temp,perm
    //Tipe karakter akan mempengaruhi damage yang diberikan maupun yang diterima oleh karakter.
        this.row= 0;
        this.col= 0;
    }
    public Kartu(String Nama, String Desc ,String type, String jenis, int row,int col){
        this.Nama= Nama;
        this.Desc= Desc;
        this.Type= Type;
        this.jenis=jenis;
        this.row= row;
        this.col=col;
    }
    //getter
    public String getName(){
        return this.Nama;

    }
    public String getDesc(){
        return this.Desc;
    }
    public String getType(){
        return this.Type;
    }
    public String getJenis(){
        return this.jenis;
    }
    public int getRow(){
        return this.row;
    }
    public int getCol(){
        return this.col;
    }
    //setter 
    void setName(String Name){
        this.Nama=Name;
    }
    void setDesc(String Desc){
        this.Desc= Desc;
    }
    void setType(String Type){
        this.Type=Type;
    }
    void setRow(int row){
        this.row= row;
    }
    void setCol(int col){
        this.col=col;
    }
}
