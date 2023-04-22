package StiringPacks;

import java.util.Scanner;

public class quvvet {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ededi daxil edin");
        int eded = scanner.nextInt();
        System.out.println("quvveti daxil edin");
        int quvvet = scanner.nextInt();

        int netice = 1;

        for (int i = 1;i<=quvvet;i++){
            netice = netice * eded;
        }
        System.out.println(netice);
    }
}
