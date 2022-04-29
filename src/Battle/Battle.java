package Battle;
import Player;
import Field;

public class Battle {
    private int turn;

    public Battle() {
        this.turn = 0;
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
     * This method displays cards in a list.
     */
    public void listCards(List<Kartu> cardList) {
        int cardListSize = cardList.size();
        for (int counter = 0; counter < cardListSize; counter++) {
            System.out.print(counter + ". ");
            String drawnCardName = drawnCard.getName();
            System.out.print(drawnCardName);
            if (drawnCard.getJenis().equals("Karakter")) {
                System.out.print(" (Karakter: ");
                Karakter drawnCardKarakter = (Karakter) drawnCard;
                String drawnCardKarType = drawnCardKarakter.getType();
                System.out.println(drawnCardKarType + ")");
                double drawnCardKarMana = drawnCardKarakter.getMana();
                double drawnCardKarAtt = drawnCardKarakter.getAtt();
                double drawnCardKarAttUp = drawnCardKarakter.getAttUp();
                double drawnCardKarHP = drawnCardKarakter.getHealth();
                double drawnCardKarHPUp = drawnCardKarakter.getHealthUp();
                System.out.println("Req. mana: " + drawnCardKarakterMana);
                System.out.println("ATK: " + drawnCardKarAtt + " (+" + drawnCardKarAttUp + ")");
                System.out.println("HP: " + drawnCardKarHP + " (+" + drawnCardKarHPUp + ")");
            }
            else if (drawnCard.getJenis().equals("Spell")) {
                System.out.print(" (Spell: ");
                Spell drawnCardSpell = (Spell) drawnCard;
                String drawnCardSpellType = drawnCardSpell.getType();
                System.out.println(drawnCardSpellType + ")");
                if (drawnCardSpellType.equals("Morph")) {
                    Morph drawnCardMorph = (Morph) drawnCardSpell;
                    // method to print out card details
                }
                else if (drawnCardSpellType.equals("Potion")) {
                    Potion drawnCardPotion = (Potion) drawnCardSpell;
                    double drawnCardPotionAtt = drawnCardPotion.getAtt();
                    double drawnCardPotionHP = drawnCardPotion.hp();
                    int drawnCardPotionDur = drawnCardPotion.duration();
                    if (drawnCardPotionAtt > 0) {
                        System.out.println("ATK: +" + drawnCardPotionAtt);
                    }
                    else {
                        System.out.println("ATK: " + drawnCardPotionAtt);
                    }
                    if (drawnCardPotionHP > 0) {
                        System.out.println("HP: +" + drawnCardPotionHP);
                    }
                    else {
                        System.out.println("HP: " + drawnCardPotionHP);
                    }
                    System.out.println("Duration: " + drawnCardPotionDur);
                }
                else if (drawnCardSpellType.equals("Level")) {
                    // Level drawnCardLevel = (Level) drawnCardSpell;
                    // method to print out card details
                }
                else if (drawnCardSpellType.equals("Swap")) {
                    Swap drawnCardSwap = (Swap) drawnCardSpell;
                    int drawnCardSwapDur = drawnCardSwap.duration();
                    System.out.println("Duration: " + drawnCardSwapDur);
                }
                double drawnCardSpellMana = drawnCardSpell.getMana()
                System.out.println("Req. mana: ", drawnCardSpellMana);
            }
            String drawnCardDesc = drawnCard.getDesc();
            System.out.println("Desc: " + drawnCardDesc);
        }
    }

    /**
     * This method displays cards in a hand.
     */
    public void listCardsInHand(Hand hand) {
        List<Kartu> ListKartuHand = hand.getHand();
        listCards(ListKartuHand);
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
