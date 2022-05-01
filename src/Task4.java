import java.util.Scanner;

//import java.util.*;
//public class Task4 {
//
//        public static void main(String args[])
//        {
//            Scanner obj=new Scanner(System.in);
//            System.out.println("enter the number");
//            int a= obj.nextInt();
//            int sum=0;
//            while(a!=0)
//            {
//                sum=sum+(a%10);
//                a=a/10;
//            }
//
//            System.out.println("the sum is" + sum);
//        }
//    }
//

public class Task4{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number");
        int a=obj.nextInt();
        int one=a%10;
        int remain = a/10;
        int second=remain%10;
        remain =remain/10;
        int third = remain%10;
       remain=remain/10;
       int fourth=remain%10;
       remain=remain/10;
        int total=one+second+third+fourth;
        System.out.println("the sum of numbers is "+ total);


    }
}