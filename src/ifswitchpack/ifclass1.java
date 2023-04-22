package ifswitchpack;

import java.util.Scanner;
import java.util.concurrent.ScheduledFuture;

public class ifclass1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci ededi daxil edin");
        int a = scanner.nextInt();
        System.out.println("Ikinci ededi daxil edin");
        int b = scanner.nextInt();

        int c = 0;
        if (a>b){
            c = a+b;
        } else if (a<b) {
            c = a-b;
            
        } else {
            c = a*b;
        }
        System.out.println(c);
    }
}
