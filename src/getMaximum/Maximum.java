package getMaximum;

import java.util.Arrays;

public class Maximum{
    public int getMaximum(int number1, int number2, int number3){
        int[] arr = {number1, number2, number3};
        Arrays.sort(arr);
        return arr[2];
    }
}

