import java.util.ArrayList;

import java.math.BigInteger;
import java.util.*;

public class ArrayListSort {
    public static void main(String[] args) {
       viewArrayList();
    }

    public static List<BigInteger> arrayListSortDesc() {
        ArrayList<BigInteger> ob = new ArrayList<BigInteger>();


        ob.add(new BigInteger("775757"));
        ob.add(new BigInteger("775748557"));
        ob.add(new BigInteger("37775757"));
        ob.add(new BigInteger("7757"));


        System.out.println("before sorting" + ob);

        Collections.sort(ob, Collections.reverseOrder());

        System.out.print("after sorting " );

        return ob;
    }

    static List<BigInteger> GetArrayList() {
        ArrayList<BigInteger> ob = new ArrayList<BigInteger>();
        return arrayListSortDesc();
    }

    public static void viewArrayList() {
        System.out.println(GetArrayList());
    }
}

