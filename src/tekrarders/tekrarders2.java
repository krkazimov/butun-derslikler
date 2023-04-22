package tekrarders;

import java.util.Scanner;

public class tekrarders2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("eded daxil et");
        int b = scanner.nextInt();

        if(b%3==0 || b%4==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
