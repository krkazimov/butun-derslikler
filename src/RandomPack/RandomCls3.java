package RandomPack;

import java.util.Random;

public class RandomCls3 {
    public static void main(String[] args) {

        String[] adlar = new String[5];
        adlar[0] = "Farid";
        adlar[1] = "Elxan";
        adlar[2] = "Zeyneb";
        adlar[3] = "Asraf";
        adlar[4] = "Sahin";

        Random random = new Random();
        int index = random.nextInt(adlar.length);
        System.out.println("index: " +index);
        System.out.println(adlar[index]);

    }
}
