package tekrarders;

import java.util.Arrays;
import java.util.Scanner;

public class TekrarDers9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] arr = new int[10];
        int [] arr1 = new int[arr.length];

        for (int i = 1;i < arr.length;i++){

            System.out.println("Input elementi: ");
            arr[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("Input number: ");
        int number = scanner.nextInt();

        boolean bool = false;
        int count = 0;
        int k = 0;

        for (int j = 0; j < arr.length; j++){

            if (arr[j] == number){
                count++;
                bool = true;
                arr1[k] = j;
                k++;
            }
        }
        System.out.println(bool);
        System.out.println("Count: " + count);
        System.out.println(Arrays.toString(arr1));
    }
}
