package RandomPack;

import java.util.Random;

public class TekrarRandom {

    public static void main(String[] args) {

        String[] adlar = new String[5];
        adlar[0] = "Farid";
        adlar[1] = "Elxan";
        adlar[2] = "Zeyneb";
        adlar[3] = "Esraf";
        adlar[4] = "Sahin";


        Random rd = new Random();
        int index1 = 0;
        int index2 = 0;

        while (index1 == index2){

            index1 = rd.nextInt(adlar.length);
            index2 = rd.nextInt(adlar.length);
        }

        String ad1 = adlar[index1];
        String ad2 = adlar[index2];

        System.out.println(ad1 + " - " + ad2);
    }
}
