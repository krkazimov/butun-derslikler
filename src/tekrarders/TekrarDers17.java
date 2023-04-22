package tekrarders;

import java.util.Scanner;

public class TekrarDers17 {
    public  static int a (int esas , int quvvet){
        int resault = 1;
        for (int i = 1;i<=quvvet;i++){
            resault *= esas;
        }
        return resault;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("birinci ededi daxil edin");
        int b = sc.nextInt();
        System.out.println("ikincini daxil edin");
        int c = sc.nextInt();
        int d = a(b,c);
        System.out.println(d);
    }

}
