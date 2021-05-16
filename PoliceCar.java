
import java.util.ArrayList;

/**
 * Class PoliceCar extends Class Room. This class was created to address the
 * specifics of the police car, new features and functionality intended solely
 * for the car
 *
 * @Author Matheus Gouvêa and Daniel Douglas
 * @version 2021.04.05
 */
public class PoliceCar extends Room {

    public PoliceCar(String description) {
        super(description);
    }

    public ArrayList easterEggWin(ArrayList<String> items, ArrayList<LightItem> backpack) {

        ArrayList<String> auxItens = new ArrayList<>();

        for (Item item : backpack) {
            auxItens.add(item.getName());

        }

        for (String itemName : auxItens) {
            if (items.contains(itemName)) {
                items.remove(itemName);
            }
        }

        return items;

    }
}
