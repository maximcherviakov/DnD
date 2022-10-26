package DnD.Races.Dwarf;

import DnD.Character.Stats;
import DnD.Races.CharacterRace;

public class Dwarf extends CharacterRace {
    public Dwarf(String name, Stats bonuses) {
        this.name = name;
        this.bonuses = bonuses;
    }

    @Override
    public void saySomething() {
        System.out.println("Tha yol Dwed");
    }
}
