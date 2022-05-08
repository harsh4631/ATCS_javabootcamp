import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = ob.nextInt();
        System.out.println("Enter the Second number");
        int b = ob.nextInt();
        int c;
        c=a+b;
        System.out.println("the sum is "+ c);
        c=a-b;
        System.out.println("the difference is "+ c);
        c=a*b;
        System.out.println("the product is "+ c);
        c=(a+b)/2;
        System.out.println("the Average is "+ c);
        c=a-b;
        System.out.println("the difference is "+ c);
        System.out.println("the maximum is "+Math.max(a,b));
        System.out.println("the minimum is "+Math.min(a,b));
    }


}
