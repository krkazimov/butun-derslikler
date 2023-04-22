package tekrarders;

import java.util.Scanner;

public class Tekrarders3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("a-ni daxil edin");
        int a = scanner.nextInt();
        System.out.println("b-ni daxil edin");
        int b = scanner.nextInt();

        int cut = 0;
        int tek = 0;

        for (int i =a;i<=b;i++){
            if (i%2==0 && i !=0){
                cut++;
            }else  {
                tek++;
            }

        }
        System.out.println("cut = " +cut);
        System.out.println("tek = " +tek);

        }

    }

