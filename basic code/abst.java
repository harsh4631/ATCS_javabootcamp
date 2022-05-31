 abstract class Hel {
    abstract void add();
    abstract void mul();
    int add1(){
        System.out.println("hello buddy");
        return 0;
    }
}
class Hel1 extends Hel{
    @Override
    void add(){
        System.out.println("hello jai");
    }
    void mul(){
        System.out.println("hello harsh");
    }
//    void hj(){
//        System
//    }

//    @Override
//    void add() {
//
//    }
}
class abst {
    public static void main(String[] args){
        Hel1 ob=new Hel1();
        ob.add();
        ob.add1();
        ob.mul();

    }
}

