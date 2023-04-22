package ifswitchpack;

import java.util.Scanner;

public class ifclass2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adinizi daxil edin");
        String name = scanner.next();
        String surname = "";

        if(name.equals("Farid")){
            surname = "Kazimzade";
        } else if (name.equals("Elxan")) {
            surname = "Cabrayilov";

        } else if (name.equals("Sahin")) {
            surname = "Ahmedov";

        }else {
            surname = "not found";
        }
        System.out.println(surname);
    }
}
