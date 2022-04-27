import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        double num1 = obj.nextDouble();
        double num2 = obj.nextDouble();
        System.out.println(num1);
        System.out.println(num2);
        if(num1>0 && num1<1 && num2>0 && num2<1) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}
