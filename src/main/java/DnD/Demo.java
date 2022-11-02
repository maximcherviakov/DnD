package DnD;

import DnD.Character.Character;
import DnD.Races.Dwarf.DwarfFactory;
import DnD.Races.Human.HumanFactory;
import DnD.Visitor.DataElementVisitor;
import DnD.Visitor.Visitor;

public class Demo {
    public static void main(String[] args) {
        Visitor visitor = new DataElementVisitor();

        Character character1 = new Character("Gimli, son of Glóin", new DwarfFactory());
        character1.addRaceBonuses();
        Character character2 = new Character("Aragorn", new HumanFactory());
        character2.addRaceBonuses();

        character1.accept(visitor);
        character2.accept(visitor);
    }
}
