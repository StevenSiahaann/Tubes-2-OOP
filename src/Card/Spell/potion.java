package Card.Spell;
class potion extends spell{ //temp
    private double att;
    private double hp;
    private int duration;

    /**
     * Constructor for potion cards.
     *
     * @param ID ID for new potion card object
     * @param Nama Name for new potion card object
     * @param Desc Description for new potion card object
     * @param imagepath Relative path to image of potion card
     * @param mana Mana needed to use potion card
     * @param att Attack boost/reduction from potion card
     * @param hp HP boost/reduction from potion card
     * @param duration Duration of potion card
     */
    public potion(String ID,String Nama,String Desc,String imagepath,double mana,double att,double hp,int duration){
        super(ID, Nama, Desc, imagepath, mana, "Potion", false);
        this.att=att;
        this.hp=hp;
        this.duration=duration;
    }

    /**
     * This method returns the attack boost/reduction from potion card.
     *
     * @return The attack boost/reduction from potion card
     */
    public double getAtt(){
        return this.att;
    }

    /**
     * This method returns the HP boost/reduction from a potion card.
     *
     * @return The HP boost/reduction from potion card
     */
    public double hp(){
        return this.hp;
    }

    /**
     * This method returns the duration of the potion card.
     *
     * @return The duration of potion card
     */
    public int duration(){
        return this.duration;
    }

    /**
     * This method sets the attack boost/reduction given by a potion card.
     *
     * @param att The attack boost/reduction to be set on the potion card
     */
    public void setAtt(double att){
        this.att=att;
    }

    /**
     * This method sets the HP boost/reduction given by a potion card.
     *
     * @param hp The HP boost/reduction to be set on the potion card
     */
    public void setHp(double hp){
        this.hp=hp;
    }

    /**
     * This method sets the duration on a potion card.
     *
     * @param duration The duration to be set on the potion card
     */
    public void setDuration(int duration){
        this.duration=duration;
    }
}
