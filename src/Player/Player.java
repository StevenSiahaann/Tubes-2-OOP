package Player;
import Card.Karakter.Karakter;
import java.util.*;

public class Player {
    static private double id=1;
    private String nama;
    private double hp;
    private double mana_remains;
    /* private Deck deck;
     private HandCard hand_card;
     private List<Card> field_card*/
    public Player(){
        this.nama = "Player " + id;
        id++;
        this.hp = 80;
        this.mana_remains=1;
        // this.deck = new Deck();
        // this.hand_card = new HandCard();
        // this.field_card = new ArrayList<Card>();
    }
    public Player(String nama,double hp,double mana_remains){ // (Deck deck, HandCard hand_card)
        this.nama = nama;
        this.hp=hp;
        this.mana_remains = mana_remains;
        // this.deck = deck;
        // this.hand_card = hand_card
        id++;
    }
    public String getNama(){
        return this.nama;
    }
    public double getHp(){
        return this.hp;
    }
    public double getMana_remains(){
        return this.mana_remains;
    }
    /*
    public Deck getDeck(){
        return this.Deck;
    }
    public HandCard getHand_card(){
        return this.hand_card;
    }
     */
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setHp(double hp){
        this.hp = hp;
    }
    public void setMana_remains(double mana_remains){
        this.mana_remains = mana_remains;
    }
    public void DirectAttack(Player Target,Karakter attacker){
        if(Target.getHp() < attacker.getAtt()){
            System.out.println(Target.getNama() + " telah terkalahkan\n");
        }
        else{
            double hp_remain = Target.getHp()-attacker.getAtt();
            Target.setHp(hp_remain);
        }
    }
}
