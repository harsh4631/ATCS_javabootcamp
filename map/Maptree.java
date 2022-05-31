//import java.util.Comparator;
//import java.util.SortedMap;
//import java.util.TreeMap;
//
//public class Maptree {
//    public static void main(String[] args) {
//        // Creating a TreeMap with a Custom comparator (Descending order)
//        SortedMap<String, String> fileExtensions = new TreeMap<>();{
//
//        }
////            @Override
////            public int compare(String s1, String s2) {
////                return s2.compareTo(s1);
////            }
//
//
//        /*
//            The above TreeMap with custom Comparator can be simply written as -
//            SortedMap<String, String> fileExtensions = new TreeMap<>(Comparator.reverseOrder());
//        */
//
//        // Adding new key-value pairs to a TreeMap
//        fileExtensions.put("python", ".py");
//        fileExtensions.put("C++", ".cpp");
//        fileExtensions.put("KOTLIN", ".kt");
//        fileExtensions.put("Golang", ".go");
//        fileExtensions.put("java", ".java");
//
//        // Printing the TreeMap (The keys will be sorted based on the supplied comparator)
//        System.out.println(fileExtensions);
//
//    }
//}
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class Maptree {
    public static void main(String[] args) {
        // TreeMap with keys sorted by ignoring case
        SortedMap<Integer,String> fileExtensions = new TreeMap<>();

        /*
            The above statement is the short form of -
            SortedMap<String, String> fileExtensions = new TreeMap<>(new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    return s1.compareToIgnoreCase(s2);
                }
            });
        */

        fileExtensions.put(1, "jain");
        fileExtensions.put(2, "jain");
        fileExtensions.put(3, "jain");


        // The keys will be sorted ignoring the case (Try removing String.CASE_INSENSITIVE_ORDER and see the output)
        System.out.println(fileExtensions);

        System.out.println(fileExtensions.containsKey(1));
        System.out.println(fileExtensions.remove(2,"jain"));
        System.out.println(fileExtensions);

    }
}