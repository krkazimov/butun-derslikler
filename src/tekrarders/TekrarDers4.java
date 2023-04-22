package tekrarders;

import java.util.Scanner;

public class TekrarDers4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("a-ni daxil edin");
        int a = scanner.nextInt();
        System.out.println("b-ni daxil edin");
        int b = scanner.nextInt();

        int uc = 0;
        int dord = 0;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                uc++;
                dord +=i ;
            }
        }
        System.out.println("uc = " +uc);
        System.out.println("dord = " +dord);
    }
}
