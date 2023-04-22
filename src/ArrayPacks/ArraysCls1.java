package ArrayPacks;

public class ArraysCls1 {
    public static void main(String[] args) {
        String[] names = new String[6];

        names[0] = "Farid";
        names[1] = "Elxan";
        names[2] = "Elsen";
        names[3] = "Tahir";
        names[4] = "Amil";
        names[5] = "Qara";

        //System.out.println(names[names.length-1]);

        /*for (int i = 1;i < names.length;i++){
            System.out.println(names[i]);
        }*/

        for (String a:names){
            System.out.println(a);
        }

    }
}
