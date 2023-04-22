package ArrayPacks;

import java.util.Arrays;

public class ArraysCls5 {
    public static void main(String[] args) {

        int[] ededler = new int[5];

        ededler[0] = 45;
        ededler[1] = 57;
        ededler[2] = 34;
        ededler[3] = 64;
        ededler[4] = 31;

        Arrays.sort(ededler);

        for (int eded : ededler) {
            System.out.println(eded);
        }
    }
}
