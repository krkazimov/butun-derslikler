package StiringPacks;

public class StiringCls1 {
    public static void main(String[] args) {

        String name = "Farid";

        //System.out.println(name.length());

        char herf = name.charAt(2);

        //System.out.println(herf);

        String metn = "Qarabag Azerbaycanin erazisidir";
        boolean result = metn.endsWith("dir");
        //System.out.println(result);

         boolean result1 = metn.startsWith("Qar");
        //System.out.println(result1);

        String a = "alma";
        String b = "Alma";
        int result2 = a.compareTo(b);
        //System.out.println(result2);
        int result3 = a.compareToIgnoreCase(b);
        //System.out.println(result3);

        boolean result4 = a.equals(b);
        //System.out.println(result4);
        boolean result5 = a.equalsIgnoreCase(b);
        //System.out.println(result5);

        String ad = "Elxan Cebrayilov";
        int index = ad.indexOf("e", 5);
        //System.out.println(index);

        int lindex = ad.lastIndexOf("xan");
        //System.out.println(lindex);

        //System.out.println(ad.toUpperCase());
        //System.out.println(ad.toLowerCase());
        //System.out.println(ad.trim());
        //System.out.println(ad.substring(7));
        //System.out.println(ad.substring(6,16));
        //System.out.println(ad.replace('a', 'o'));
        //System.out.println(ad.replace("an", "oz"));

        String cumle = "alma@armud@heyva@nar";
        String[] sozler = cumle.split("@", 2);
        System.out.println(sozler[1]);

        System.out.println("--------");

        for (String soz: sozler){
            System.out.println(soz);
        }
    }
}
