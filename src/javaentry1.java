import java.util.Scanner;

public class javaentry1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("birinci ededi daxil edin");
        int a = scanner.nextInt();
        System.out.println("ikinci ededi daxil edin");
        int b = scanner.nextInt();

        int netice = a+b;
        System.out.println(netice);

    }
}
