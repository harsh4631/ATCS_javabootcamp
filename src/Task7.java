import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner ob= new Scanner(System.in);
        System.out.println("enter first number");
        int a= ob.nextInt();
        System.out.println("enter second number");
        int b= ob.nextInt();
        System.out.println("enter third number");
        int c= ob.nextInt();
        int first=a>b?a:b;
        int second=c>first?c:first;
        System.out.println("the largest number is "+ second);
    }
}
