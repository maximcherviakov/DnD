package DnD.Character;

import java.util.HashMap;

public class Stats {
    HashMap<String, Integer> stats;

    public Stats(int strength, int dexterity, int constitution, int intellect, int wisdom, int charisma) {
        stats = new HashMap<>();

        stats.put("Strength", strength);
        stats.put("Dexterity", dexterity);
        stats.put("Constitution", constitution);
        stats.put("Intellect", intellect);
        stats.put("Wisdom", wisdom);
        stats.put("Charisma", charisma);
    }

    public static Stats generate() {
        return new Stats(Dice.rollStat(), Dice.rollStat(), Dice.rollStat(), Dice.rollStat(), Dice.rollStat(), Dice.rollStat());
    }

    public void print() {
        System.out.println("~~~~Attributes~~~~");
        System.out.println(this);
    }

    public HashMap<String, Integer> getStats() {
        return stats;
    }

    @Override
    public String toString() {
        return "\n\tStrength: " + stats.get("Strength") +
               "\n\tDexterity: " + stats.get("Dexterity") +
               "\n\tConstitution: " + stats.get("Constitution") +
               "\n\tIntellect: " + stats.get("Intellect") +
               "\n\tWisdom: " + stats.get("Wisdom") +
               "\n\tCharisma: " + stats.get("Charisma") + "\n";
    }
}
