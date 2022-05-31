public class Excep {
    public static void main(String[] args) {
        try{
//            int a=10;
//            int b=5;
//            int c=a/0;
            int a[] = new int[6];
            System.out.println(a[10]);
        }
        catch (ArrayIndexOutOfBoundsException a){
//            a.printStackTrace();
//            System.out.println(a);
            System.out.println(a.getMessage());
//            System.out.println(a.toString());
        }
        try {
            int a=10;
            int b=5;
            int c=a/0;
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally {
            System.out.println("there is entire code");
        }
    }
}


//class UnderAge extends Exception{
//    UnderAge()
//    {
//        super("You are under  age");
//    }
//    UnderAge(String message)
//    {
//        super(message);
//    }
//
//}
//
//public class Excep
//{
//    public static void main(String[] args) {
//        int age = 2;
//        try {
//            if(age< 18)
//            {
//                throw new UnderAge("You can not vote as your age is below 18");
//            }
//            else
//            {
//                System.out.println("you can vote now...");
//            }
//        }
//        catch(UnderAge e)
//        {
//            e.printStackTrace();
//        }
//    }
//}