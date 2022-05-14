import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner on=new Scanner(System.in);
        System.out.println("enter a character");
        String c= on.next();
        boolean vowels=c.equals("a")||c.equals("e")||c.equals("i")||c.equals("o")||c.equals("u")||
                c.equals("A")||c.equals("E")||c.equals("I")||c.equals("O")||c.equals("U");



         if(c.length()>1){
            System.out.println("enter a only single character");
        }
         else if(vowels){
             System.out.println("this is a vowel");
         }
        else{
            System.out.println("this is a constant ");
        }
    }
}
