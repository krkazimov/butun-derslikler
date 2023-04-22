package ifswitchpack;

import java.util.Scanner;

public class ifclass5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Istifadeci adini daxil edin");
        String user = scanner.next();
        System.out.println("Sifreni daxil edin");
        int password = scanner.nextInt();

        if(user.equals("admin")&&password == 1234){
            System.out.println("Success");
        } else if (user.equals("admin")&&password != 1234) {
            System.out.println("sifre yanlisdir");
        } else if (!user.equals("admin")&&password == 1234) {
            System.out.println("istifadeci yanlisdir");
            
        }else {
            System.out.println("istifadeci ve sifre yanlisdir");
        }
    }
}
