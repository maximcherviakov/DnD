package DnD.Character;

import DnD.Races.CharacterClass;

// Originator
public class Character {
    private String name;
    private String dndclass;
    private Stats attributes;
    private CharacterClass race;

    public Character(String name, String dndclass) {
        this.name = name;
        this.dndclass = dndclass;
        this.attributes = Stats.generate();
    }

    public Character(String name, CharacterClass race) {
        this.name = name;
        this.race = race;
        this.attributes = Stats.generate();
    }

    public Character(String name, String dndclass, Stats attributes) {
        this.name = name;
        this.dndclass = dndclass;
        this.attributes = attributes;
    }

    public void printSheet() {
        System.out.println("Character" +
                "\nName: " + name);
        race.print();
        attributes.print();
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", dndclass='" + dndclass + '\'' +
                ", attributes=" + attributes +
                '}';
    }

    public static Memento saveStateToMemento(Stats state) {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        this.attributes = memento.getState();
    }

    public void setAttributes(Stats attributes) {
        this.attributes = attributes;
    }

    // Memento
    public static class Memento {
        private final Stats state;

        private Memento(Stats state) {
            this.state = state;
        }

        private Stats getState() {
            return state;
        }
    }
}
