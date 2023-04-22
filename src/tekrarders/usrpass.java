package tekrarders;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class usrpass {

    public static void main(String[] args) {

        int wrongLoginCount = 0;

      while (true){
          Scanner sc = new Scanner(System.in);

          String user, pass;

          System.out.println("Login daxil edin");
          user = sc.nextLine();

          System.out.println("Sifrenizi daxil edin");
          pass = sc.nextLine();

           if (wrongLoginCount==2){
               System.out.println("blok edildiz");
               break;
           }

           if (user.equals("admin") && pass.equals("12345")){
               System.out.println("ugurla daxil oldunuz");

               System.out.println("nece nefer oyunda istirak edecek");
               int playerscount = sc.nextInt();

               String[] players = new String[playerscount];

               for (int j = 0; j < playerscount ;j++ ){
                   Scanner scanner = new Scanner(System.in);

                   System.out.println("oyuncu " +j+ " ad soyadi daxil edin");
                   String fullname = scanner.nextLine();
                   players[j] = fullname;
                   System.out.println("oyuncu " +fullname+ " daxil edildi");
               }
               System.out.println("oyuncular uygurla qeydiyyatdan kecdi");
               System.out.println("1.Yarisa basla");
               System.out.println("2.Logout");
               System.out.println("3.Exit");

               int operations = sc.nextInt();


               if (operations == 1 ){

                   Random rd = new Random();
                   int rduser = rd.nextInt(playerscount);

                   System.out.println("secilen sexs kimdir?");
                   int player = sc.nextInt();

                   if (rduser==player){
                       System.out.println("Congratulations you won!");
                   }else {
                       System.out.println("You failed");
                   }
                   System.exit(0);

               } else if (operations == 2) {
                   System.out.println("Logout");
                   System.out.flush();

               } else if (operations == 3) {
                   System.out.println("Exit");
                   System.exit(0);
               }else{
                   System.out.println("not found");
                   System.exit(0);
               }

           }else {
               wrongLoginCount++;
               System.out.println("login ve ya sifre yanlisdir");
           }
       }
    }
}
