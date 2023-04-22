package CollectionPack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListCls {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(23);
        list.add(31);
        list.add(23);

        int a = list.get(1);

        System.out.println(a);

        //wrapper
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }

       // int t = 45;
       // Object e = t;  //boxing

        //Object s = 45;  //anboxing
      //  int c = s;

       Object o = 45;
        int b = (int)o;
    }
}
