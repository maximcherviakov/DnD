package DnD.Visitor;

import DnD.Character.Character;
import DnD.Character.Stats;
import DnD.Races.CharacterRace;

public class DataElementVisitor implements Visitor {
    @Override
    public void visit(Character character) {
        System.out.println(character);
    }

    @Override
    public void visit(Stats stats) {
        System.out.println(stats);
    }

    @Override
    public void visit(CharacterRace race) {
        System.out.println(race);
    }
}
