package DnD.Races.Human;

import DnD.Character.Stats;
import DnD.Races.CharacterRace;

public class Human extends CharacterRace {
    public Human(String name, Stats bonuses) {
        this.name = name;
        this.bonuses = bonuses;
    }

    @Override
    public void saySomething() {
        System.out.println("I am Human");
    }
}
