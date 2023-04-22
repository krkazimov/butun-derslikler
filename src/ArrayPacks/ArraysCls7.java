package ArrayPacks;

public class ArraysCls7 {
    public static void main(String[] args) {
        String[] names = new String[6];

        names[0] = "Farid";
        names[1] = "Elxan";
        names[2] = "Elsen";
        names[3] = "Tahir";
        names[4] = "Amil";
        names[5] = "Qara";

        int [] ages = new int[6];

        ages[0] = 28;
        ages[1] = 34;
        ages[2] = 27;
        ages[3] = 25;
        ages[4] = 23;
        ages[5] = 21;

        for (int i = 0;i<=5;i++){
            System.out.println("adi: " + names[i] + " yasi: " + ages[i]);
        }
    }
}
