package tekrarders;

import java.util.Scanner;

public class TekrarDers6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cem = 1;
        int i = 1;

        while (i<=5){
            cem = cem *i;
            i++;
        }
        System.out.println(cem);
    }
}
