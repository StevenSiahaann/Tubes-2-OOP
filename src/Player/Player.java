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

    /**
     * Default class constructor for Player.
     */
    public Player(){
        this.nama = "Player " + id;
        id++;
        this.hp = 80;
        this.mana_remains=1;
        // this.deck = new Deck();
        // this.hand_card = new HandCard();
        // this.field_card = new ArrayList<Card>();
    }

    /**
     * Class constructor for Player with arguments.
     *
     * @param nama The name for the new player
     * @param hp The starting HP for the new player
     * @param mana_remains The starting mana for the new player
     */
    public Player(String nama,double hp,double mana_remains){ // (Deck deck, HandCard hand_card)
        this.nama = nama;
        this.hp=hp;
        this.mana_remains = mana_remains;
        // this.deck = deck;
        // this.hand_card = hand_card
        id++;
    }

    /**
     * This method returns the name of a player.
     *
     * @return The name of a player.
     */
    public String getNama(){
        return this.nama;
    }

    /**
     * This method returns the HP of a player.
     *
     * @return The HP of a player.
     */
    public double getHp(){
        return this.hp;
    }

    /**
     * This method returns the remaining mana of a player.
     *
     * @return The remaining mana of a player.
     */
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

    /**
     * This method sets the name of a player.
     *
     * @param nama The new name that will be set on a player.
     */
    public void setNama(String nama){
        this.nama = nama;
    }

    /**
     * This method sets the HP of a player.
     *
     * @param hp New HP that will be set on a player.
     */
    public void setHp(double hp){
        this.hp = hp;
    }

    /**
     * This method sets the remaining mana of a player.
     *
     * @param mana_remains The remaining mana to set on a player
     */
    public void setMana_remains(double mana_remains){
        this.mana_remains = mana_remains;
    }

    /**
     * This method sends an attack from an attacking character to a target player.
     * This attack will directly reduce the HP of the target player.
     *
     * @param Target Player that is targeted by the attack
     * @param attacker The attacking character
     */
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
