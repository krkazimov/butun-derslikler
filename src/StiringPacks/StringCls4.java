package StiringPacks;

import java.util.Scanner;

public class StringCls4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("birinci sozu daxil edin");
        String soz = scanner.nextLine();
        System.out.println("ikinci sozu daxil edin");
        String soz1 = scanner.nextLine();

        char son = soz.charAt(soz.length() - 1);
        char evvel = soz1.charAt(0);

        System.out.println(son);
        System.out.println(evvel);
        boolean netice = false;
        if (son== evvel){
            netice = true;
        }
    }
}
