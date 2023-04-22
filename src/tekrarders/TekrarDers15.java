package tekrarders;

import java.util.Scanner;

public class TekrarDers15 {

    public static String a(int bal){
        if (bal>91&&bal<=100){
            return "A";
        } else if (bal>81&&bal<91){
            return "B";
        } else if (bal>71&&bal<81) {
            return "C";
        } else if (bal>61&&bal<71) {
            return "D";
        } else if (bal>51&&bal<61) {
            return "E";
        }else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Balinizi daxil edin");
        int bal = sc.nextInt();
        String netice  = a(bal);
        System.out.println(netice);



    }
}
