package seedu.simplykitchen.model.util;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import seedu.simplykitchen.model.ReadOnlySimplyKitchenInventory;
import seedu.simplykitchen.model.SimplyKitchenInventory;
import seedu.simplykitchen.model.food.Address;
import seedu.simplykitchen.model.food.Email;
import seedu.simplykitchen.model.food.Food;
import seedu.simplykitchen.model.food.Name;
import seedu.simplykitchen.model.food.Phone;
import seedu.simplykitchen.model.tag.Tag;

/**
 * Contains utility methods for populating {@code SimplyKitchenInventory} with sample data.
 */
public class SampleDataUtil {
    public static Food[] getSampleFoods() {
        return new Food[] {
            new Food(new Name("Alex Yeoh"), new Phone("87438807"), new Email("alexyeoh@example.com"),
                new Address("Blk 30 Geylang Street 29, #06-40"),
                getTagSet("friends")),
            new Food(new Name("Bernice Yu"), new Phone("99272758"), new Email("berniceyu@example.com"),
                new Address("Blk 30 Lorong 3 Serangoon Gardens, #07-18"),
                getTagSet("colleagues", "friends")),
            new Food(new Name("Charlotte Oliveiro"), new Phone("93210283"), new Email("charlotte@example.com"),
                new Address("Blk 11 Ang Mo Kio Street 74, #11-04"),
                getTagSet("neighbours")),
            new Food(new Name("David Li"), new Phone("91031282"), new Email("lidavid@example.com"),
                new Address("Blk 436 Serangoon Gardens Street 26, #16-43"),
                getTagSet("family")),
            new Food(new Name("Irfan Ibrahim"), new Phone("92492021"), new Email("irfan@example.com"),
                new Address("Blk 47 Tampines Street 20, #17-35"),
                getTagSet("classmates")),
            new Food(new Name("Roy Balakrishnan"), new Phone("92624417"), new Email("royb@example.com"),
                new Address("Blk 45 Aljunied Street 85, #11-31"),
                getTagSet("colleagues"))
        };
    }

    public static ReadOnlySimplyKitchenInventory getSampleSimplyKitchenInventory() {
        SimplyKitchenInventory sampleSimplyKitchenInventory = new SimplyKitchenInventory();
        for (Food sampleFood : getSampleFoods()) {
            sampleSimplyKitchenInventory.addFood(sampleFood);
        }
        return sampleSimplyKitchenInventory;
    }

    /**
     * Returns a tag set containing the list of strings given.
     */
    public static Set<Tag> getTagSet(String... strings) {
        return Arrays.stream(strings)
                .map(Tag::new)
                .collect(Collectors.toSet());
    }

}
