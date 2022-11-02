package DnD.Visitor;

import DnD.Character.Character;
import DnD.Character.Stats;
import DnD.Races.CharacterRace;

import java.util.TreeMap;

public interface Visitor {
    TreeMap visit(Character visitor);

    TreeMap visit(Stats stats);

    TreeMap visit(CharacterRace race);
}
