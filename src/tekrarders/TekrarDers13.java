package tekrarders;

import java.util.Arrays;
import java.util.Scanner;

public class TekrarDers13 {
    public static void main(String[] args) {

        int [] arr = {13 , 34 , 65};
        int [] arr1 = new int[3];

        int k = 0;

        for (int i = arr.length-1;i>=0;i--){

          arr1[k] = arr[i];
          k++;

           }
        System.out.println(Arrays.toString(arr1));

        }


    }
