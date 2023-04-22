package ifswitchpack;

import java.util.Scanner;

public class Switchcls {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gunu daxil edin");
        int day = scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("Bazar ertesi");
                break;
            case 2:
                System.out.println("Cersenbe");
                break;
            case 3:
                System.out.println("Cersenbe axsami");
                break;
            case 4:
                System.out.println("Cume axsami");
                break;
            case 5:
                System.out.println("Cume");
                break;
            case 6:
                System.out.println("Senbe");
                break;
            case 7:
                System.out.println("Bazar");
                break;
            default:
                System.out.println("bele gun yoxdur");
                break;
        }
    }
}
