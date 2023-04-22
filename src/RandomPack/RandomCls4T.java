package RandomPack;

import java.util.Random;
import java.util.Scanner;

public class RandomCls4T {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("uzunlug daxil edin");
        int uzunluq = scanner.nextInt();
        String sifre = "";

        Random random = new Random();
        for (int i = 0;i<uzunluq;i++){
            int eded = random.nextInt(10);
            sifre +=eded;
        }
        System.out.println(sifre);

    }
}
