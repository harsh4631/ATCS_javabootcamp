import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner ob= new Scanner(System.in);
        int b=0;
        System.out.println("enter a number");
        int a=ob.nextInt();
        System.out.println("the odd numbers is");
        for(int i=1;i<=a;i++)
        {
            System.out.println(2*i-1);
            b+=2*i-1;
        }
        System.out.println("sum of the number is");
        System.out.println(b);
    }
}
