package DnD.Character;

import DnD.Races.CharacterRace;
import DnD.Races.RaceAbstractFactory;
import DnD.Visitor.Element;
import DnD.Visitor.Visitor;

import java.util.Set;
import java.util.TreeMap;

// Originator
public class Character implements Element {
    private String name;
    private String dndclass;
    private Stats attributes;
    private CharacterRace race;

    public Character(String name, String dndclass) {
        this.name = name;
        this.dndclass = dndclass;
        this.attributes = Stats.generate();
    }

    public Character(String name, RaceAbstractFactory race) {
        this.name = name;
        this.race = race.create();
        this.attributes = Stats.generate();
    }

    public Character(String name, String dndclass, Stats attributes) {
        this.name = name;
        this.dndclass = dndclass;
        this.attributes = attributes;
    }

    public void addRaceBonuses() {
        Set<String> keys = attributes.getStats().keySet();

        for (String key : keys) {
            attributes.getStats().put(key, attributes.getStats().get(key) + race.getRaceBonuses().getStats().get(key));
        }
    }

    public String getName() {
        return name;
    }

    public String getDndclass() {
        return dndclass;
    }

    public Stats getAttributes() {
        return attributes;
    }

    public CharacterRace getRace() {
        return race;
    }

    public void talk() {
        race.saySomething();
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

    @Override
    public TreeMap accept(Visitor visitor) {
        return visitor.visit(this);
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
