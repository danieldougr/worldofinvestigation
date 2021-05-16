
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

/**
 * The LightItem class refers to light items that weigh up to 10 kg in the game.
 *
 * @author Matheus Gouvêa and Daniel Douglas
 * @version 2021.04.05
 */
public class LightItem extends Item {

    public LightItem(String name, String description, double weight) {
        super(name, description, weight);
        super.setWeight(RandomVariationWeight());
    }

    /**
     * Slight variation in the weight of light items at different times of execution.
     * @return the new weight updated of the item.
     */
    public final double RandomVariationWeight() {
        Random random = new Random();
        double newWeight;

        switch (random.nextInt(3)) {
            case 0:
                newWeight = super.getWeight() + super.getWeight() * random.nextDouble();
                break;

            case 1:
                newWeight = super.getWeight() - super.getWeight() * random.nextDouble();
                break;

            default:
                newWeight = super.getWeight();
        }

        BigDecimal newWeightFormatted = new BigDecimal(newWeight).setScale(3, RoundingMode.HALF_EVEN);

        return newWeightFormatted.doubleValue();
    }
}
