package exceptions;

public class StaleCoffeeException extends Exception {

    private int timeSinceLastBrew; // in days

    public StaleCoffeeException(int timeSinceLastBrew) {
        super(timeSinceLastBrew + " days since last brew is too many. Coffee is stale!!");
        this.timeSinceLastBrew = timeSinceLastBrew;
    }

    public int getTimeSinceLastBrew() {
        return timeSinceLastBrew;
    }
}
