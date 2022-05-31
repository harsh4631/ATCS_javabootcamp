import java.util.Scanner;

class Y1 {

    int burger=80;
    int pizza=70;
    synchronized void bookburgers(int ab){
        if(burger>=ab){
            System.out.println(ab+" burgers are booked");
            burger=burger-ab;
            System.out.println("left burgers are "+ burger);
        }
        else {
            System.out.println("sorry your quantity is more than given quantity");
        }
    }
     void bookpizza(int ad){
        if(pizza>=ad){
            System.out.println(ad+" pizza are booked");
            pizza=pizza-ad;
            System.out.println("left pizza are "+ pizza);
        }
        else {
            System.out.println("sorry your quantity is more than given quantity");
        }
    }
    void thanks(){
        System.out.println("Thank you for Coming Your Order is:");
    }
}
public class Thred2 extends Thread{

    static Y1 h;
//    Scanner ob=new Scanner(System.in);
//    int c=ob.nextInt();
   int abc;

    public void run(){
        h.bookburgers(abc);
    }
    public void run1(){
        h.bookpizza(abc);
    }
    public void run2(){
        h.thanks();
    }


    public static void main(String[] args) {
        h=new Y1();
        Thred2 obj=new Thred2();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of Burger: ");
        int number = input.nextInt();
        System.out.print("Enter a number of pizza: ");
        int number2=input.nextInt();
        obj.abc=number;
        obj.start();
        obj.run2();

        Thred2 obj1=new Thred2();

        obj1.abc=number2;
        obj1.run1();



    }
}