package tekrarders;

import java.util.Scanner;

public class TekrarDers16 {
    public  static int faktoriall (int a){
        int faktorial = 1;
        for (int i =1;i<=a;i++){
            faktorial = faktorial * i;
        }
        return faktorial;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eded daxil edin");
        int eded = sc.nextInt();
        int b = faktoriall(eded);
        System.out.println(b);

    }
}
