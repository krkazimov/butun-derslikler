package ArrayPacks;

import java.util.Arrays;

public class ArraysCls8 {
    public static void main(String[] args) {

        int [] ededler = new int[5];

        ededler[0] = 34;
        ededler[1] = 27;
        ededler[2] = 25;
        ededler[3] = 23;
        ededler[4] = 21;

        Arrays.sort(ededler);

        int min = ededler[0];
        int max = ededler[ededler.length-1];

        System.out.println("minimum eded : " + min);
        System.out.println("maxsimum eded : " + max);
    }
}
