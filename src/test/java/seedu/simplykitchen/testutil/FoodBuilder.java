package seedu.simplykitchen.testutil;

import java.util.HashSet;
import java.util.Set;

import seedu.simplykitchen.model.food.Address;
import seedu.simplykitchen.model.food.Email;
import seedu.simplykitchen.model.food.Food;
import seedu.simplykitchen.model.food.Name;
import seedu.simplykitchen.model.food.Phone;
import seedu.simplykitchen.model.tag.Tag;
import seedu.simplykitchen.model.util.SampleDataUtil;

/**
 * A utility class to help with building Food objects.
 */
public class FoodBuilder {

    public static final String DEFAULT_NAME = "Alice Pauline";
    public static final String DEFAULT_PHONE = "85355255";
    public static final String DEFAULT_EMAIL = "alice@gmail.com";
    public static final String DEFAULT_ADDRESS = "123, Jurong West Ave 6, #08-111";

    private Name name;
    private Phone phone;
    private Email email;
    private Address address;
    private Set<Tag> tags;

    /**
     * Creates a {@code FoodBuilder} with the default details.
     */
    public FoodBuilder() {
        name = new Name(DEFAULT_NAME);
        phone = new Phone(DEFAULT_PHONE);
        email = new Email(DEFAULT_EMAIL);
        address = new Address(DEFAULT_ADDRESS);
        tags = new HashSet<>();
    }

    /**
     * Initializes the FoodBuilder with the data of {@code foodToCopy}.
     */
    public FoodBuilder(Food foodToCopy) {
        name = foodToCopy.getName();
        phone = foodToCopy.getPhone();
        email = foodToCopy.getEmail();
        address = foodToCopy.getAddress();
        tags = new HashSet<>(foodToCopy.getTags());
    }

    /**
     * Sets the {@code Name} of the {@code Food} that we are building.
     */
    public FoodBuilder withName(String name) {
        this.name = new Name(name);
        return this;
    }

    /**
     * Parses the {@code tags} into a {@code Set<Tag>} and set it to the {@code Food} that we are building.
     */
    public FoodBuilder withTags(String ... tags) {
        this.tags = SampleDataUtil.getTagSet(tags);
        return this;
    }

    /**
     * Sets the {@code Address} of the {@code Food} that we are building.
     */
    public FoodBuilder withAddress(String address) {
        this.address = new Address(address);
        return this;
    }

    /**
     * Sets the {@code Phone} of the {@code Food} that we are building.
     */
    public FoodBuilder withPhone(String phone) {
        this.phone = new Phone(phone);
        return this;
    }

    /**
     * Sets the {@code Email} of the {@code Food} that we are building.
     */
    public FoodBuilder withEmail(String email) {
        this.email = new Email(email);
        return this;
    }

    public Food build() {
        return new Food(name, phone, email, address, tags);
    }

}
