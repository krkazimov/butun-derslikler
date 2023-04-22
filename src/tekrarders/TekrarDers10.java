package tekrarders;

import java.util.Scanner;

public class TekrarDers10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input fullname: ");
        String fullname = scanner.nextLine();

        int index = fullname.indexOf(" ");
        int index2 = fullname.indexOf(" ", index + 1);

        System.out.println(fullname.substring(index + 1, index2));
    }
}
