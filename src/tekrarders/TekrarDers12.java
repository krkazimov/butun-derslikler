package tekrarders;

import java.util.Arrays;
import java.util.Scanner;

public class TekrarDers12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] ededler = new int[5];
         ededler[0] = 12;
         ededler[1] = 23;
         ededler[2] = 24;
         ededler[3] = 45;
         ededler[4] = 26;

         int cem = 0 ;

         for (int eded : ededler){
             cem = cem + eded;

         }
        System.out.println(cem);

    }
}
