package Player;

import java.util.*;
import Card.Kartu;

public class Deck {
    /*
    First of all, we need to create a deck of cards.
    We will use a list of cards.
    
    Take 3 card at the beginning of the game.
    After that, we will use the deck to draw a card.
    Each draw, take 3 card from deck and choose 1 card to put in hand.
    The other card will take back to the deck.
    
    notes:
    - Every time draw, the deck will be shuffled.
    */
    int deckCardTotal;
    private List<Kartu> deck;

    public Deck() {
        this.deck = new ArrayList<Kartu>();
        this.deckCardTotal = 0;
    }

    public int getdeckCardTotal(){
        return this.deckCardTotal;
    }

    public void setdeckCardTotal(int deckCardTotal){
        this.deckCardTotal = deckCardTotal;
    }

    public void setDeck(List<Kartu> deck){ //change a deck
        this.deck = deck;
    }

    public List<Kartu> getDeck(){ //return deck
        return this.deck;
    }
    
    public void removeDeckCard(Kartu card){ // remove card from deck
        this.deck.remove(card);
        this.deckCardTotal--;
    }

    public void shuffleDeck(){ //shuffle deck
        Collections.shuffle(this.deck);
    }

    public void addDeckCard(Kartu card){ // add card to deck
        this.deck.add(card);
        this.deckCardTotal++;
    }

    public Kartu getDeckCard(){ // return card
        Kartu card = this.deck.get(0);
        this.deck.remove(0);
        this.deckCardTotal--;
        return card;
    }

}
