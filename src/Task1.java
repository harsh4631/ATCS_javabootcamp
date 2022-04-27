import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        {
            Scanner obj=new Scanner(System.in);
            int num1 = obj.nextInt();
            int num2 = obj.nextInt();
            int num3 = obj.nextInt();
            int num4 = obj.nextInt();
            if(num1==num2 && num2==num3 && num3==num4)
            {
                System.out.println("the numbers are equal");
            }
            else{
                System.out.println("the numbers are not equal");
            }

        }
    }
}