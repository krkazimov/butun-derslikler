package RandomPack;

import java.util.Random;
import java.util.Scanner;

public class RandomCls5T {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Shifrenin uzunlugunu daxil edin");
        int uzunluq = scanner.nextInt();

        Random random = new Random();
        String shifre = "";
        for (int i = 0 ; i<uzunluq;i++){
            int index = random.nextInt(65);
            char a =(char)index ;
            shifre+=a;
        }
        System.out.println(shifre);
    }
}
