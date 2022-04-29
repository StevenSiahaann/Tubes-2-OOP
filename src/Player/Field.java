package Player;

import java.util.*;
import Card.Kartu;

class Field {
    public int fieldCardTotal;
    private List<Kartu> field;
    private List<Kartu> spellField;

    public Field() {
        this.field = new ArrayList<Kartu>();
        this.fieldCardTotal = 0;
    }
    public void removeFieldCard(Kartu card){
        this.field.remove(card);
        this.fieldCardTotal--;
    }

    public Kartu getFieldCard(int n){
        Kartu card = this.field.get(n);
        return card;
    }

    public Kartu getSpellFieldCard(int n){
        Kartu card = this.spellField.get(n);
        return card;
    }

    public void addFieldCard(Kartu card){
        this.field.add(card);
        this.fieldCardTotal++;
    }

    public void addSpellFieldCard(Kartu card){
        this.spellField.add(card);
    }

    public boolean isFieldFull(){
        if(this.fieldCardTotal == 5){
            return true;
        }
        return false;
    }
}