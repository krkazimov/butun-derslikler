package ifswitchpack;

import java.util.Scanner;

public class ifclass3 {
    public static void main(String[] args) {

        boolean status = false;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if(a>15){
            status = true;
        }
        System.out.println(status);
    }
}
