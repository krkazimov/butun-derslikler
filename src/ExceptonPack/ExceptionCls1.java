package ExceptonPack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCls1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("eded daxil edin");

        try{
            int eded = scanner.nextInt()/0;
            System.out.println(eded);

        }catch (ArithmeticException aex){
            System.out.println(aex);
            return;
        }catch (InputMismatchException iex){
            System.out.println(iex);
        }
        finally {
            System.out.println("Qapini bagla");
        }

        System.out.println("Farid Kazimov");
    }
}
