package loopspack;

public class LoopsCsl8 {

    public static void main(String[] args) {

        String a = "";
        String b = "";
        String c = "";

        for (int i =1;i<=4;i++){

            for (int j =1;j<=5;j++){
                a = a +"%";
            }
            b = b +"$";
        }
        c = c +"@";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}
