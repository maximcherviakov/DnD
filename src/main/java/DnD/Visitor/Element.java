package DnD.Visitor;

import java.util.TreeMap;

public interface Element {
    TreeMap accept(Visitor visitor);
}
