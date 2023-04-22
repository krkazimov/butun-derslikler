package loopspack;

import java.util.Scanner;

public class LoopsCls4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("a-ni daxil edin");
        int a = scanner.nextInt();
        System.out.println("b-ni daxil edin");
        int b = scanner.nextInt();

        int cem = 0;

        for (int i = a;i<=b;i++){
            cem = cem +i;
        }
        System.out.println(cem);
    }
}
