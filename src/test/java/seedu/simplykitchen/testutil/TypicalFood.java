package seedu.simplykitchen.testutil;

import static seedu.simplykitchen.logic.commands.CommandTestUtil.VALID_ADDRESS_AMY;
import static seedu.simplykitchen.logic.commands.CommandTestUtil.VALID_ADDRESS_BOB;
import static seedu.simplykitchen.logic.commands.CommandTestUtil.VALID_EXPIRYDATE_AMY;
import static seedu.simplykitchen.logic.commands.CommandTestUtil.VALID_EXPIRYDATE_BOB;
import static seedu.simplykitchen.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.simplykitchen.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.simplykitchen.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.simplykitchen.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.simplykitchen.logic.commands.CommandTestUtil.VALID_TAG_FRIEND;
import static seedu.simplykitchen.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.simplykitchen.model.FoodInventory;
import seedu.simplykitchen.model.food.Food;

/**
 * A utility class containing a list of {@code Food} objects to be used in tests.
 */
public class TypicalFood {

    public static final Food ALICE = new FoodBuilder().withName("Alice Pauline")
            .withAddress("123, Jurong West Ave 6, #08-111").withExpiryDate("1-1-2021")
            .withPhone("94351253")
            .withTags("friends").build();
    public static final Food BENSON = new FoodBuilder().withName("Benson Meier")
            .withAddress("311, Clementi Ave 2, #02-25")
            .withExpiryDate("31-1-2021").withPhone("98765432")
            .withTags("owesMoney", "friends").build();
    public static final Food CARL = new FoodBuilder().withName("Carl Kurz").withPhone("95352563")
            .withExpiryDate("1-1-2020").withAddress("wall street").build();
    public static final Food DANIEL = new FoodBuilder().withName("Daniel Meier").withPhone("87652533")
            .withExpiryDate("1-12-2020").withAddress("10th street").withTags("friends").build();
    public static final Food ELLE = new FoodBuilder().withName("Elle Meyer").withPhone("9482224")
            .withExpiryDate("31-1-2020").withAddress("michegan ave").build();
    public static final Food FIONA = new FoodBuilder().withName("Fiona Kunz").withPhone("9482427")
            .withExpiryDate("31-12-2020").withAddress("little tokyo").build();
    public static final Food GEORGE = new FoodBuilder().withName("George Best").withPhone("9482442")
            .withExpiryDate("1-10-2020").withAddress("4th street").build();

    // Manually added
    public static final Food HOON = new FoodBuilder().withName("Hoon Meier").withPhone("8482424")
            .withExpiryDate("12-12-2020").withAddress("little india").build();
    public static final Food IDA = new FoodBuilder().withName("Ida Mueller").withPhone("8482131")
            .withExpiryDate("12-12-2021").withAddress("chicago ave").build();

    // Manually added - Food's details found in {@code CommandTestUtil}
    public static final Food AMY = new FoodBuilder().withName(VALID_NAME_AMY).withPhone(VALID_PHONE_AMY)
            .withExpiryDate(VALID_EXPIRYDATE_AMY).withAddress(VALID_ADDRESS_AMY).withTags(VALID_TAG_FRIEND).build();
    public static final Food BOB = new FoodBuilder().withName(VALID_NAME_BOB).withPhone(VALID_PHONE_BOB)
            .withExpiryDate(VALID_EXPIRYDATE_BOB).withAddress(VALID_ADDRESS_BOB)
            .withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND).build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalFood() {} // prevents instantiation

    /**
     * Returns a {@code FoodInventory} with all the typical foods.
     */
    public static FoodInventory getTypicalFoodInventory() {
        FoodInventory ab = new FoodInventory();
        for (Food food : getTypicalFood()) {
            ab.addFood(food);
        }
        return ab;
    }

    public static List<Food> getTypicalFood() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}