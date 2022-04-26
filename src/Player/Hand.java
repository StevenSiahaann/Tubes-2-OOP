package Player;

import java.util.*;
import Card.Kartu;


public class Hand {
    public int handCardTotal;
    private List<Kartu> hand;

    public Hand() {
        this.hand = new ArrayList<Kartu>();
        this.handCardTotal = 0;
    }

    public int gethandCardTotal(){
        return this.handCardTotal;
    }

    public void sethandCardTotal(int handCardTotal){
        this.handCardTotal = handCardTotal;
    }

    public void setHand(List<Kartu> hand){ //change hand card
        this.hand = hand;
    }

    public List<Kartu> getHand(){ //return hand card
        return this.hand;
    }

    public void addHandCard(Kartu card){ // add card to hand
        this.hand.add(card);
        this.handCardTotal++;
    }

    public void removeHandCard (Kartu card){ // remove card from hand
        this.hand.remove(card);
        this.handCardTotal--;
    }

    public Kartu getCard(){ // return card
        Kartu card = this.hand.get(0);
        this.hand.removeHandCard(card);
        this.handCardTotal--;
        return card;
    }

    public List<Kartu> getHand(int n){ // return n cards
        List<Kartu> hand = new ArrayList<Kartu>();
        for(int i = 0; i < n; i++){
            hand.addHandCard(this.hand.get(i));
        }
        return hand;
    }
}
