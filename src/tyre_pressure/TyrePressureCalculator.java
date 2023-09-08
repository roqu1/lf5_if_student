package tyre_pressure;

public class TyrePressureCalculator {
    public boolean calc(int frontRight, int frontLeft, int behindRight, int behindLeft) {
        int differenceFront = frontRight - frontLeft;
        int differenceBehind = behindRight - behindLeft;
        return differenceFront >= -3 && differenceFront <= 3 && differenceBehind >= -3 && differenceBehind <= 3;
    }

    public boolean checkTyre(int pressure) {
        return pressure >= 35 && pressure <= 45;
    }
}
