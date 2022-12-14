import java.util.LinkedList;
import java.util.List;

public class CareTaker {
    private List<Character.Memento> mementoList = new LinkedList<Character.Memento>();

    public void add(Character.Memento memento) {
        mementoList.add(memento);
    }

    public Character.Memento get(int index) {
        return mementoList.get(index);
    }
}
