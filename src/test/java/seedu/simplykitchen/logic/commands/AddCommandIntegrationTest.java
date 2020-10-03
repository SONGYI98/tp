package seedu.simplykitchen.logic.commands;

import static seedu.simplykitchen.logic.commands.CommandTestUtil.assertCommandFailure;
import static seedu.simplykitchen.logic.commands.CommandTestUtil.assertCommandSuccess;
import static seedu.simplykitchen.testutil.TypicalFood.getTypicalSimplyKitchenInventory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import seedu.simplykitchen.model.Model;
import seedu.simplykitchen.model.ModelManager;
import seedu.simplykitchen.model.UserPrefs;
import seedu.simplykitchen.model.food.Food;
import seedu.simplykitchen.testutil.FoodBuilder;

/**
 * Contains integration tests (interaction with the Model) for {@code AddCommand}.
 */
public class AddCommandIntegrationTest {

    private Model model;

    @BeforeEach
    public void setUp() {
        model = new ModelManager(getTypicalSimplyKitchenInventory(), new UserPrefs());
    }

    @Test
    public void execute_newFood_success() {
        Food validFood = new FoodBuilder().build();

        Model expectedModel = new ModelManager(model.getSimplyKitchenInventory(), new UserPrefs());
        expectedModel.addFood(validFood);

        assertCommandSuccess(new AddCommand(validFood), model,
                String.format(AddCommand.MESSAGE_SUCCESS, validFood), expectedModel);
    }

    @Test
    public void execute_duplicateFood_throwsCommandException() {
        Food foodInList = model.getSimplyKitchenInventory().getFoods().get(0);
        assertCommandFailure(new AddCommand(foodInList), model, AddCommand.MESSAGE_DUPLICATE_FOOD);
    }

}
