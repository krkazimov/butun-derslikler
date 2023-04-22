package tekrarders;

import java.util.Scanner;

public class TekrarDers5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("a-ni daxil edin");
        int a = scanner.nextInt();
        System.out.println("b-ni daxil edin");
        int b = scanner.nextInt();

        int count = 0;
        int sum = 0;

        for (int i = a; i<=b;i++){

            if (i % 4 == 0 && i % 6 == 0){
                count++;
                sum += i;
            }
        }
        System.out.println("count = " +count);
        System.out.println("sum = " +sum);
    }
}
