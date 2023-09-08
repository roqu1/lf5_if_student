package discount;

public class DiscountCalc {
    public int calc(int amount) {
        if (amount > 1000) {
            amount -= (int) (amount * 0.1);
        }
        return amount;
    }
}
