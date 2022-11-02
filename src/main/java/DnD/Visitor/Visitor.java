package DnD.Visitor;

import DnD.Character.Character;
import DnD.Character.Stats;
import DnD.Races.CharacterRace;

public interface Visitor {
    void visit(Character visitor);

    void visit(Stats stats);

    void visit(CharacterRace race);
}
