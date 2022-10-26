package DnD.Races;

import DnD.Character.Stats;

public abstract class CharacterRace {
    protected String name;
    protected Stats bonuses;

    public abstract void saySomething();

    public Stats getRaceBonuses() {
        return bonuses;
    }

    public void print() {
        System.out.println("Race: " + name);
        System.out.println("Bonuses:");
        System.out.println(bonuses.toString());
    }

}
