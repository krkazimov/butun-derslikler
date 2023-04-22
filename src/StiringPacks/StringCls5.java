package StiringPacks;

import java.util.Scanner;

public class StringCls5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("soz daxil edin");
        String soz = scanner.nextLine();

        int cem = 0;

        for (int i = 0;i<=soz.length()-1;i++){
            int kod = soz.charAt(i);

            cem += kod;

        }
        System.out.println(cem);
    }
}
