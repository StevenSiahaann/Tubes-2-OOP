package Card.Spell;
class swap extends   spell{ //perm
    private int duration;
    /**
     * Constructor for swap cards.
     *
     * @param ID ID for new swap card object
     * @param Nama Name for new swap card object
     * @param Desc Description for new swap card object
     * @param imagepath Relative path to image of swap card
     * @param mana Mana needed to use swap card
     * @param duration Duration of swap card
     */
    public swap(String ID,String Nama,String Desc,String imagepath,int mana,int duration){
        super(ID, Nama, Desc, imagepath, mana, "swap", false);
        this.duration=duration;
    }

    /**
     * This method returns the duration of the swap card.
     *
     * @return The duration of the swap card
     */
    public int getDuration(){
        return this.duration;
    }
}
