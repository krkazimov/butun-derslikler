package StiringPacks;

import java.util.Scanner;

public class StringTask1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ad soyadinizi daxil edin");
        String adsoyad = scanner.nextLine();
        String soyad = "";

        String[] massiv = adsoyad.split(" ");
        soyad = massiv[1];
        System.out.println(soyad);
    }
}
