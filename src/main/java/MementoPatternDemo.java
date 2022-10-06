public class MementoPatternDemo {
    public static void main(String[] args) {
        Character character = new Character("Dragon", "dragon");
        character.printSheet();

        CareTaker careTaker = new CareTaker();

        Stats tempStats = Stats.generate();
        tempStats.print();
        careTaker.add(Character.saveStateToMemento(tempStats));

        tempStats = Stats.generate();
        tempStats.print();
        careTaker.add(Character.saveStateToMemento(tempStats));

        character.getStateFromMemento(careTaker.get(0));
        character.printSheet();

        character.getStateFromMemento(careTaker.get(1));
        character.printSheet();
    }
}
