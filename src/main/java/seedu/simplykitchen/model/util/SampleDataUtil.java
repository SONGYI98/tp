package seedu.simplykitchen.model.util;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import seedu.simplykitchen.model.FoodInventory;
import seedu.simplykitchen.model.ReadOnlyFoodInventory;
import seedu.simplykitchen.model.food.Address;
import seedu.simplykitchen.model.food.Email;
import seedu.simplykitchen.model.food.Food;
import seedu.simplykitchen.model.food.Name;
import seedu.simplykitchen.model.food.Priority;
import seedu.simplykitchen.model.tag.Tag;

/**
 * Contains utility methods for populating {@code FoodInventory} with sample data.
 */
public class SampleDataUtil {
    public static Food[] getSampleFoods() {
        return new Food[] {
            new Food(new Name("Alex Yeoh"), new Priority("high"), new Email("alexyeoh@example.com"),
                new Address("Blk 30 Geylang Street 29, #06-40"),
                getTagSet("friends")),
            new Food(new Name("Bernice Yu"), new Priority("high"), new Email("berniceyu@example.com"),
                new Address("Blk 30 Lorong 3 Serangoon Gardens, #07-18"),
                getTagSet("colleagues", "friends")),
            new Food(new Name("Charlotte Oliveiro"), new Priority("high"), new Email("charlotte@example.com"),
                new Address("Blk 11 Ang Mo Kio Street 74, #11-04"),
                getTagSet("neighbours")),
            new Food(new Name("David Li"), new Priority("high"), new Email("lidavid@example.com"),
                new Address("Blk 436 Serangoon Gardens Street 26, #16-43"),
                getTagSet("family")),
            new Food(new Name("Irfan Ibrahim"), new Priority("high"), new Email("irfan@example.com"),
                new Address("Blk 47 Tampines Street 20, #17-35"),
                getTagSet("classmates")),
            new Food(new Name("Roy Balakrishnan"), new Priority("high"), new Email("royb@example.com"),
                new Address("Blk 45 Aljunied Street 85, #11-31"),
                getTagSet("colleagues"))
        };
    }

    public static ReadOnlyFoodInventory getSampleFoodInventory() {
        FoodInventory sampleFoodInventory = new FoodInventory();
        for (Food sampleFood : getSampleFoods()) {
            sampleFoodInventory.addFood(sampleFood);
        }
        return sampleFoodInventory;
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
