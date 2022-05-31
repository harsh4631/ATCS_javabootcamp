import java.util.Scanner;

class A1 {
    Scanner sc = new Scanner(System.in);
    void name(){
        System.out.println("hello buddy its a calculator");
    }
}
class A2 extends A1{
    int add(int a, int b)
    {
        int c=a+b;
        System.out.println("the sum is "+c);
        return c;
    }
}
class A3 extends A2{
    int sub(int a, int b)
    {
        int c=a-b;
        System.out.println("the sub is "+c);
        return c;
    }
}
class A4 extends A3{
    int mul(int a, int b)
    {
        int c=a*b;
        System.out.println("the multiply is "+c);
        return c;
    }
}
class A5 extends A4{
    int div(int a, int b)
    {
        int c=a/b;
        System.out.println("the div is "+c);
        return c;
    }
}
public class Calcy{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        A5 ob=new A5();
        ob.name();
        ob.add(67,98);
        ob.sub(90,45);
        ob.mul(3,9);
        ob.div(8,2);
    }
}