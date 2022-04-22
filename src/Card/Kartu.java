package Card;

public class Kartu {
    private String ID;
    private String Nama;
    private String Desc;
    private String imagepath;
    private String jenis;

    /**
     * Default class constructor for Kartu.
     */
    public Kartu(){
        this.ID="0";
        this.Nama="";
        this.Desc="";
        this.imagepath="";
        this.jenis="None";
    }

    /**
     * Class constructor for Kartu with arguments.
     *
     * @param ID The ID for the new card object
     * @param Nama The name for the new card object
     * @param Desc The description for the new card object
     * @param imagepath The image path for the card face
     * @param jenis The type of the card (character, spell)
     */
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

    /**
     * This method returns the image path of a card object.
     *
     * @return String denoting image path of card
     */
    public String getImagePath(){
        return this.imagepath;
    }

    /**
     * This method returns the ID of a card object.
     *
     * @return String denoting ID of card
     */
    public String getID(){
        return this.ID;
    }

    /**
     * This method returns the name of a card object.
     *
     * @return String denoting name of card
     */
    public String getName(){
        return this.Nama;

    }

    /**
     * This method returns the description of a card object.
     *
     * @return String denoting description of card
     */
    public String getDesc(){
        return this.Desc;
    }

    /**
     * This method returns the card type.
     *
     * @return String denoting the card type
     */
    public String getJenis(){
        return this.jenis;
    }
}
