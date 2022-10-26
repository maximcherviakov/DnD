package DnD.Races.Human;

import DnD.Character.Stats;
import DnD.Races.CharacterRace;
import DnD.Races.RaceAbstractFactory;

public class HumanFactory implements RaceAbstractFactory {
    @Override
    public CharacterRace create() {
        return new Human("Human", new Stats(1, 1, 1, 1, 1, 1));
    }
}
