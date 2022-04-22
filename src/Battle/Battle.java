package Battle;
import Player;
import Card;

public class Battle {
    // no attributes -- only controls the game
    public Battle() {
        // empty constructor, no attribute
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
    public void phaseDraw() {

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
