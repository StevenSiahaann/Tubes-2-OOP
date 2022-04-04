class spell extends Kartu{
    int mana;
    int durasi;
    String sifat;

    public spell(){
        this.mana=0;
        this.durasi=0;
        this.sifat="";
    }
    public spell(int mana,int durasi,String sifat){
        this.mana=mana;
        this.durasi=durasi;
        this.sifat=sifat;
    }
    //getter
    int getMana(){
        return this.mana;
    }
    int getDurasi(){
        return this.durasi;
    }
    String getSifat(){
        return this.sifat;
    }
    //setter
    void setMana(int mana){
        this.mana=mana;
    }
    void setDurasi(int durasi){
        this.durasi=durasi;
    }
}
