package DnD.Character;

public class Stats {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intellect;
    private int wisdom;
    private int charisma;

    public Stats(int strength, int dexterity, int constitution, int intellect, int wisdom, int charisma) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public static Stats generate() {
        return new Stats(Dice.rollStat(), Dice.rollStat(), Dice.rollStat(), Dice.rollStat(), Dice.rollStat(), Dice.rollStat());
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "~~~~Attributes~~~~" +
                "\n\tStrength: " + strength +
                "\n\tDexterity: " + dexterity +
                "\n\tConstitution: " + constitution +
                "\n\tIntellect: " + intellect +
                "\n\tWisdom: " + wisdom +
                "\n\tCharisma: " + charisma + "\n";
    }
}
