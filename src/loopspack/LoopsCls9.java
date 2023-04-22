package loopspack;

import java.util.Scanner;

public class LoopsCls9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("a-ni daxil edin");
        int a = scanner.nextInt();
        System.out.println("b-ni daxil edin");
        int b = scanner.nextInt();

        int cutcem = 0;
        int tekcem = 0;

        for (int i = a;i<=b;i++){

            if (i%2 == 0){
                cutcem = cutcem +i;
            }else {
                tekcem = tekcem + i;
            }
        }
        System.out.println(cutcem);
        System.out.println(tekcem);
    }
}
