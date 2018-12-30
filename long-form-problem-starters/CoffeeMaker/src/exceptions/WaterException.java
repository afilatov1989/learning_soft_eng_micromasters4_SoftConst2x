package exceptions;

public class WaterException extends Exception {

    private double cups;

    public WaterException(double cups) {
        super(cups + " cups is not enough water");
        this.cups = cups;
    }

    public double getCups() {
        return cups;
    }
}
