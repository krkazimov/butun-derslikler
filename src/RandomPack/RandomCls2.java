package RandomPack;

import java.util.Random;
import java.util.Scanner;

public class RandomCls2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("eded daxil edin");
        int eded = scanner.nextInt();
        Random random = new Random();
        int reded = random.nextInt(4);

        if (eded == reded){
            System.out.println("Tebrikler! 100 AZN qazandiniz: " + eded + " " + reded);
        }else {
            System.out.println("Teessuf! bextinizi birdaha sinayin: " + eded + " " + reded);
        }
    }
}
