//import java.util.Scanner;
//
//public class Excep2 {
//    public static void main(String[] args) {
//        void dispui() {
//            Scanner ob = new Scanner(System.in);
//            System.out.println("first name");
//            String a = ob.next();
//            System.out.println("second name");
//            String b = ob.next();
//        }
//        Excep2 oc=new Excep2();
//
//    }
//}
import java.util.*;
public class Excep2 {
    public static void main(String[] args)
    {
        String[] array1 = {"Python"};

        String[] array2 = {"MySQL"};

        System.out.println("Array1 : "+Arrays.toString(array1));
        System.out.println("Array2 : "+Arrays.toString(array2));

        HashSet<String> set = new HashSet<String>();

        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i]==array2[j])
                {
                    System.out.println("Common element : "+(set));
                }
            }
        }

             //OUTPUT : [THREE, FOUR, FIVE]
    }
}

