package tekrarders;

import java.util.Scanner;

public class TekrarDers14 {
    public static boolean a(int b){
        if (b%3==0&&b%4==0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eded daxil edin");
        int netice = sc.nextInt();

        boolean cavab = a(netice);
        System.out.println(cavab);
    }
}
