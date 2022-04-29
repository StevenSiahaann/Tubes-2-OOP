package Card.Spell;
import Player.Player;

class HealPlayer extends spell{//perm
    private String targetId;
    public HealPlayer(String ID,String Nama,String Desc,String imagepath,int mana,String targetId){
        super(ID, Nama, Desc, imagepath, mana,"PERM");
        this.targetId=targetId;
    }
    public String getTargetID(){
        return this.targetId;
    }

    public void use(Player p){
        p.setHp(p.getHp()+5);
    }
}

