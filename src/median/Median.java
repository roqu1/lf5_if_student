package median;

public class Median {

    public int getMedian(int a, int b, int c) {
    int max = Math.max(a, Math.max(b, c));
    int min = Math.min(a, Math.min(b, c));
        if (a != max && a != min) {
            return a;
        } else if (b != max && b != min) {
            return b;
        } else {
            return c;
        }
    }
}
