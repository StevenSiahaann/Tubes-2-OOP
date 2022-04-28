package Battle;
import Player;
import Deck;
import Field;

public class Battle {
    private Deck deck;
    private int turn;

    public Battle() {
        // empty constructor, no attribute
    }

    /**
     * This method returns the turn number of the battle.
     *
     * @return The turn number of the battle.
     */
    public int getTurn() {
        return this.turn;
    }

    /**
     * This method sets the turn number of the battle.
     *
     * @param turn Integer representing the turn number to be set.
     */
    public void setTurn(int turn) {
        this.turn = turn;
    }

    /**
     * This method increments the turn number of the battle.
     */
    public void nextTurn() {
        this.turn++;
    }

    /**
     * This method represents the draw phase.
     * <p>
     * In this phase, player draws 3 cards from deck.
     * The player picks a card to put on hand, and then
     * returns the rest of the cards to the deck in random order.
     * If player has more than 5 cards in hand as a result,
     * prompt player to dump a card. Also reset player's mana.
     *
     * @param
     * @return
     */
    public void phaseDraw(Player player) {
        List<Kartu> choice;
        Hand playerHand = player.getHand();

        for (int counter = 0; counter < 3; counter++) {
            choice.add(deck.getDeckCard());
        }
        // prompt player to pick a card, and then...
        playerHand.addHandCard(choice.remove(0)); // player picks card
        for (int counter = 0; counter < choice.size(); counter++) {
            deck.addDeckCard(choice.remove(0));
        }
        deck.shuffleDeck();
        if (playerHand.gethandCardTotal() > 5) {
            // prompt player to pick a card, and then...
            playerHand.removeHandCard();
        }
        player.setMana_remains(Math.min(10, getTurn()));
    }

    /**
     * This method represents the planning phase.
     * <p>
     * In this phase, player may place 0 or more character
     * cards. Player may also place 0 or more spell cards,
     * and then choose character to cast the spell on. Player
     * may also dump 0 or more cards from hand, or remove
     * a character from the board. Player may also choose to
     * use 0 or more mana to boost character exp on board.
     *
     * @param
     * @return
     */
    public void phasePlanning() {
        /* This will depend on the Field class.
         * Prompt what the player wants to do.
         * If player wants to deploy a card, check if:
         * there are empty spaces in the field (character), or
         * there are characters in the field (spell).
         * If there are available slots, prompt the player...
         * ...where to place the card, and put the card there.
         * Player may also remove cards on hand, or chars on board.
         * Game will proceed when player confirms.
         */
    }

    /**
     * This method represents the attack phase.
     * <p>
     * In this phase, player may choose an attacker already
     * deployed on the board to attack other player's character,
     * or the player itself if no character is deployed on
     * the other player's board.
     *
     * @param
     * @return
     */
    public void phaseAttack() {

    }

    /**
     * Denotes the end of phase.
     *
     * @param
     * @return
     */
    public void phaseEnd() {

    }
}
