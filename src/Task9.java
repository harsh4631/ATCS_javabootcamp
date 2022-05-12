import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner on=new Scanner(System.in);
        String c= on.next();
        if(c.equals('a')||c.equals('e')||c.equals('i')||c.equals('o')||c.equals('u')||
                c.equals('A')||c.equals('E')||c.equals('I')||c.equals('O')||c.equals('U')){
            System.out.println("this is a vowels");

        }
        else if(c.length()>1){
            System.out.println("enter a only single character");
        }
        else{
            System.out.println("this is a constant ");
        }
    }
}
