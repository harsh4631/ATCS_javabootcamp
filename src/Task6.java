import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner ob= new Scanner(System.in);
        System.out.println("please enter the number");
        int a=ob.nextInt();
        if(a>0){
            System.out.println("the number is positive "+a);
        }
        else if(a==0){
            System.out.println("the number is zero "+a);
        }
        else {
            System.out.println("the number is negative "+a);
        }
    }
}
