package ArrayPacks;

import java.util.Arrays;

public class ArraysCls6 {
    public static void main(String[] args) {
        String[] names = new String[6];

        names[0] = "Farid";
        names[1] = "Elxan";
        names[2] = "Elsen";
        names[3] = "Tahir";
        names[4] = "Amil";
        names[5] = "Qara";

        Arrays.sort(names);

        for (String a : names) {
            System.out.println(a);
        }
    }
}
