package sort;

import java.util.Arrays;

public class Sort {
    public String sort(double size1, double size2, double size3) {
        double[] array = {size1,size2,size3};
        Arrays.sort(array);
        return array[2] + "\n" + array[1] + "\n" + array[0];


    }
}
