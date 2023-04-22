package StiringPacks;

import java.util.Scanner;

public class StringCls3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ad soyad ata adi daxil edin");
        String adsoyad = scanner.nextLine();

        int index = adsoyad.indexOf(" ");
        int last = adsoyad.lastIndexOf(" ");

        String soyad = adsoyad.substring(index +1 , last);
        System.out.println(soyad);
    }
}
