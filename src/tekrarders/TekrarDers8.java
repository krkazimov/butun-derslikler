package tekrarders;

import java.util.Arrays;
import java.util.Scanner;

public class TekrarDers8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] arr = new int[10];

        for (int i = 1;i < arr.length;i++){

            System.out.println("Input elementi: ");
            arr[1] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("Input number: ");
        int number = scanner.nextInt();

        boolean bool = false;
        int count = 0;

        for (int j = 1; j < arr.length; j++){

            if (arr[j] == number){
                count++;
                bool = true;
            }
        }
        System.out.println(bool);
        System.out.println("Count: " + count);

    }
}
