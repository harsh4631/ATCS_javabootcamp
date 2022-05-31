// class H12 extends Thread {
//   public void run(){
//        System.out.println("this is thread ");
//    }
//}
//class Thred{
//    public static void main(String[] args) {
//        H12 ob= new H12();
//        ob.start();
//        //ob.run();
//    }
//}
//
//class H12 extends Thread {
//    public void start(){
//        System.out.println("this is thread ");
//    }
//}
//class Thred{
//    public static void main(String[] args) {
//        H12 ob= new H12();
//       // Thread oj=new Thread(ob);
//        ob.run();
//        ob.start();
////        oj.stop();
//        //ob.run();
//    }
//}

//public class Thred
//{
//    // Main method
//    public static void main(String argvs[])
//    {
//// creating an object of the Thread class using the constructor Thread(String name)
//        Thread t= new Thread("My first thread");
//
//// the start() method moves the thread to the active state
//        t.start();
//// getting the thread name by invoking the getName() method
//        //String str = t.getName();
//        System.out.println(t);
//    }
//}
class Busreservation
{
    int total_seats = 80;
    synchronized void bookSeats(int seats)
    { // 10>=6
        if(total_seats>=seats)
        {
            System.out.println(seats + "Seats booked successfully");
            total_seats= total_seats-seats;
            System.out.println("seats left: " +total_seats);
        }
        else
        {
            System.out.println("Seats Not booked");
            System.out.println("seats available" +total_seats);
        }
    }
}
public class Thred extends Thread {

    static Busreservation m;
    int seats;
    public void run()
    {
        m.bookSeats(seats);
    }
    public static void main(String[] args) {

        m = new Busreservation();
        Thred user1 = new Thred();
        user1.seats=10;
        user1.start();
        Thred user2 = new Thred();
        user2.seats = 6;
        user2.start();


    }
}

