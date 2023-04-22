package loopspack;

public class LoopsCls1Eve {
    public static void main(String[] args) {

        String a = "";

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {
                a = a + "1";
            }
            a = a + "\n";
        }

        System.out.println(a);

    }
}
