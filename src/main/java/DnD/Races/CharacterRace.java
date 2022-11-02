package DnD.Races;

import DnD.Character.Stats;
import DnD.Visitor.Element;
import DnD.Visitor.Visitor;

public abstract class CharacterRace implements Element {
    protected String name;
    protected Stats bonuses;

    public abstract void saySomething();

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public Stats getRaceBonuses() {
        return bonuses;
    }

    public void print() {
        System.out.println("Race: " + name);
        System.out.println("Bonuses:");
        System.out.println(bonuses.toString());
    }

}
