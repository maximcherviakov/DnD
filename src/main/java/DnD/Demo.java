package DnD;

import DnD.Character.Character;
import DnD.Races.Dwarf.DwarfFactory;
import DnD.Races.Human.HumanFactory;
import DnD.Visitor.DataElementVisitor;
import DnD.Visitor.Element;
import DnD.Visitor.Visitor;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws IOException {
        Visitor visitor = new DataElementVisitor();
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject = new JSONObject();
        FileWriter writer = new FileWriter("characters.json");

        Character character1 = new Character("Gimli, son of Glóin", new DwarfFactory());
        character1.addRaceBonuses();
        Character character2 = new Character("Aragorn", new HumanFactory());
        character2.addRaceBonuses();

        List<Element> list = new LinkedList<>();
        list.add(character1);
        list.add(character1.getRace());
        list.add(character1.getAttributes());

        for (Element element : list) {
            jsonObject.putAll(element.accept(visitor));
        }
        jsonArray.add(jsonObject);

        jsonObject = new JSONObject();
        list = new LinkedList<>();
        list.add(character2);
        list.add(character2.getRace());
        list.add(character2.getAttributes());

        for (Element element : list) {
            jsonObject.putAll(element.accept(visitor));
        }
        jsonArray.add(jsonObject);

        try {
            jsonArray.writeJSONString(writer);
        } finally {
            writer.close();
        }

    }
}
