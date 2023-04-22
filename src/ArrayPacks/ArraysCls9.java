package ArrayPacks;

public class ArraysCls9 {
    public static void main(String[] args) {

        int[][] numbers = new int [2][3];

        numbers[0][0] =45;
        numbers[0][1] =37;
        numbers[0][2] =48;
        numbers[1][0] =67;
        numbers[1][1] =56;
        numbers[1][2] =23;

        /*for (int i =0;i<=numbers.length-1;i++){

            for (int j =0;j<=2;j++){
                System.out.print(numbers[i][j] +" ");
            }
            System.out.println();
        }*/
        String netice = "";
        for (int i =0;i<=numbers.length-1;i++){

            for (int j =0;j<=2;j++){
                netice += numbers[i][j] + " ";
            }
            netice += "\n";
        }
        System.out.println(netice);


    }
}
