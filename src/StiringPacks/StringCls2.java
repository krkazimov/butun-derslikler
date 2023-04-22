package StiringPacks;

import java.util.Scanner;

public class StringCls2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ad soyadinii daxil edin");
        String adsoyad = scanner.nextLine();

        int index = adsoyad.indexOf(" ");

        String soyad = adsoyad.substring(index +1);
        System.out.println(soyad);
    }
}
