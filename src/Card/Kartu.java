package Card;

public class Kartu {
    private String ID;
    private String Nama;
    private String Desc;
    private String imagepath;
    private String jenis;

    public Kartu(){
        this.ID="0";
        this.Nama="";
        this.Desc="";
        this.imagepath="";
        this.jenis="None";
    }
    public Kartu(String ID,String Nama, String Desc , String imagepath, String jenis){
        this.ID=ID;
        this.Nama= Nama;
        this.Desc= Desc;
        this.imagepath=imagepath;
        this.jenis=jenis;
    }
    //buat ngetest doang
    public void display(){
        System.out.println(this.ID);
        System.out.println(this.Nama);
        System.out.println(this.Desc);
        System.out.println(this.imagepath);
    }
    //getter
    public String getImagePath(){
        return this.imagepath;
    }
    public String getID(){
        return this.ID;
    }
    public String getName(){
        return this.Nama;

    }
    public String getDesc(){
        return this.Desc;
    }
    public String getJenis(){
        return this.jenis;
    }
}
