package DnD;

import DnD.Character.Character;
import DnD.Races.ClassFactory;

public class Demo {
    public static void main(String[] args) {
        Character character1 = new Character("Viarmo", ClassFactory.getClass("Bard"));
        character1.printSheet();
        Character character2 = new Character("Barber", ClassFactory.getClass("Barbarian"));
        character2.printSheet();
    }
}
