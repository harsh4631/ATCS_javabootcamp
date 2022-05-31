public class Constructor {
    int c;
    String z;
    Constructor() {
    }

    void display() {
        System.out.println("hello buddy ");
    }

    Constructor(int a, int b) {
         c = a + b;

    }
    void display1(){
            System.out.println(c);
    }
    Constructor(String w){
        z=w;
    }
    Constructor(Constructor tt){
        z=tt.z;
    }
    void display7(){
        System.out.println("the name is " + z);
    }

    public static void main(String args[]) {
       Constructor obj=new Constructor();
        Constructor obj1=new Constructor(45,78);
        Constructor obj12=new Constructor("hasrh");
       obj.display();
       obj1.display1();
       obj12.display7();
    }
}