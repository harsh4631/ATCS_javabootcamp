import java.util.ArrayList;
import java.util.List;
public class Colltion
{
    public static void main (String[]args)
    {
        // Creation of ArrayList
        ArrayList <String> al = new ArrayList <String>();

        //adding the elements into the list
        al.add ("harsh");  //autoboxing
        al.add ("jai"); //manual boxing
        al.add ("kuldeep");
        al.add ("ketan");
        al.add ("harshit");

        //Display elements of the List and its Size
        System.out.println (al);
        System.out.println (al.size ());

        //inserting an element into the List at specified location
        al.add (1, "veeru");
        System.out.println (al);
        System.out.println (al.size ());

        //modifying the existing element of the List by specifying its value
//        al.remove (new Integer (30));
//        System.out.println (al);
//        System.out.println (al.size ());

        //removing the element of the List by specifying its index position
        al.remove (0);
        System.out.println (al);
        System.out.println (al.size ());

        //Displaying elements of List 1 by 1 using for loop (accessing)
        for (int i = 0; i < al.size (); i++)
        {
            System.out.println (al.get (i));
        }

        //Displaying elements of List 1 by 1 using forEach Loop (auto-unboxing)
        for (String v:al)
        {
            System.out.println (v);
        }
//
//        //Searching an element
        System.out.println (al.contains ("harshit"));
      //  System.out.println(al.);

        //Copying the array list into another list
//        ArrayList < Integer > al1 = new ArrayList < Integer > (al);
//        System.out.println (al1);
    }
}