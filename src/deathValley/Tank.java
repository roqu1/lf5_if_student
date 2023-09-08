package deathValley;

public class Tank {
    public boolean enoughGas(int capacity, int gasDisplay, double consumption) {
        double range = ((double) gasDisplay / 100) * capacity * consumption;
        return range >= 200;
    }
}
