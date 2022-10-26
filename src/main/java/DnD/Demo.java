package DnD;

import DnD.Character.Character;
import DnD.Races.Dwarf.DwarfFactory;
import DnD.Races.Human.HumanFactory;

public class Demo {
    public static void main(String[] args) {
        Character character1 = new Character("Gimli, son of Glóin", new DwarfFactory());
        character1.addRaceBonuses();
        character1.talk();
        character1.printSheet();
        Character character2 = new Character("Aragorn", new HumanFactory());
        character2.addRaceBonuses();
        character2.talk();
        character2.printSheet();
    }
}
