import java.util.Scanner;

public class ders {
    public static void main(String[] args) {
        double meter = 0.0254;
        System.out.println(1000 * meter);

        Scanner sc = new Scanner(System.in);
        System.out.println("Input ,faranheit , value");
        double faranheit = sc.nextDouble();

        double f = (5 * (faranheit -32) / 9);
        System.out.println(f);

        int a = 10;
        int b = 7;
        int qaliq = a%b;
        System.out.println(qaliq);
    }
}
