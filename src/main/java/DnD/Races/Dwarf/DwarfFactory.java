package DnD.Races.Dwarf;

import DnD.Character.Stats;
import DnD.Races.CharacterRace;
import DnD.Races.RaceAbstractFactory;

public class DwarfFactory implements RaceAbstractFactory {
    @Override
    public CharacterRace create() {
        return new Dwarf("Dwarf", new Stats(0, 0, 2, 0, 1, 0));
    }
}
