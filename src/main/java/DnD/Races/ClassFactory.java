package DnD.Races;

import DnD.Races.Classes.*;

public class ClassFactory {
    public static CharacterClass getClass(String type) {
        if (type.equalsIgnoreCase("Bard")) {
            return new Bard();
        } else if (type.equalsIgnoreCase("Barbarian")) {
            return new Barbarian();
        }

        return null;
    }
}
