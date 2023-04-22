package ifswitchpack;

import java.util.Scanner;

public class ifclassders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int a = scanner.nextInt();
        System.out.println();
        int b = scanner.nextInt();

        int c = 0;

        if (a>b){
            c = a+b;
        } else if (a<b) {
            c = a-b;
        }else{
            c = a*b;
        }
        System.out.println(c);
    }
}
