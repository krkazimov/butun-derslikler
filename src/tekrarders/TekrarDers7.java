package tekrarders;

import java.util.Scanner;

public class TekrarDers7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a-ni daxil ed");
        int a = scanner.nextInt();
        System.out.println("b-ni daxil ed");
        int b = scanner.nextInt();
        int kub = a;
        for (int i = 1; i<b;i++){
            a = a * kub;
        }
        System.out.println(a);
    }
}
