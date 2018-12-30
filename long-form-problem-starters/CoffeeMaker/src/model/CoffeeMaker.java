package model;

import exceptions.*;

/**
 * A coffee maker used to train baristas.
 * <p>
 * Class invariant: cups remaining >= 0, time since last brew >= 0
 */

public class CoffeeMaker {

    public static final double BEANS_MIN = 2.40;
    public static final double BEANS_MAX = 2.60;
    public static final double WATER_MIN = 14.75;
    public static final int TIME_SINCE_LAST_BREW_MAX = 60;

    public CoffeeMaker() {
        // TODO: complete the implementation of this method
    }

    // getters
    public int getTimeSinceLastBrew() {
        // TODO: complete the implementation of this method
        return 0;
    }

    public int getCupsRemaining() {
        // TODO: complete the implementation of this method
        return 0;
    }

    // EFFECTS: return true if there are coffee cups remaining
    public boolean areCupsRemaining() {
        // TODO: complete the implementation of this method
        return false;
    }

    //REQUIRES: a non-negative integer
    //EFFECTS: sets time since last brew
    public void setTimeSinceLastBrew(int time) {
        // TODO: complete the implementation of this method
    }

    //EFFECTS: sets cups remaining to full (20 cups) and time since last brew to 0
    //         throws appropriate exceptions if beans are not between BEANS_MIN and BEANS_MAX cups or water <= WATER_MIN cups
    public void brew(double beans, double water) throws NotEnoughBeansException, TooManyBeansException, WaterException {
        if (beans < BEANS_MIN) {
            throw new NotEnoughBeansException(beans);
        }
        if (beans > BEANS_MAX) {
            throw new TooManyBeansException(beans);
        }
        if (water <= WATER_MIN) {
            throw new WaterException(water);
        }

        // TODO: complete the implementation of this method
    }

    //MODIFIES: this
    //EFFECTS: subtracts one cup from cups remaining
    //         throws appropriate exceptions if no cups remaining or time since last brew >= TIME_SINCE_LAST_BREW_MAX days
    public void pourCoffee() throws NoCupsRemainingException, StaleCoffeeException {
        if (!areCupsRemaining()) {
            throw new NoCupsRemainingException();
        }
        if (getTimeSinceLastBrew() >= TIME_SINCE_LAST_BREW_MAX) {
            throw new StaleCoffeeException(getTimeSinceLastBrew());
        }

        // TODO: complete the implementation of this method
    }


}
