////class Thred4 extends Thread {
////    public void run() {
////        // Create Thread 1 using lambda expression
////        //  Thread thread1 = new Thread(() -> {
////        System.out.println("Entered Thread 1");
////        try {
////            Thread.sleep(2000);
////        } catch (InterruptedException e) {
////            throw new IllegalStateException(e);
////        }
////        System.out.println("Exiting Thread 1");
////    }
////}
////        // Create Thread 2
//////        Thread thread2 = new Thread(() ->
////    class Thred3 extends Thread{
////    public void run1()
////        {
////            System.out.println("Entered Thread 2");
////            try {
////                Thread.sleep(4000);
////            } catch (InterruptedException e) {
////                throw new IllegalStateException(e);
////            }
////            System.out.println("Exiting Thread 2");
////        }
////
////            public static void main(String[] args) throws InterruptedException {
////                Thred4 ob=new Thred4();
////                ob.setPriority(9);
////                Thred3 obj=new Thred3();
////
////        System.out.println("Starting Thread 1");
////        ob.start();
////       // Thread.MAX_PRIORITY
////      //  ob.join(10000);
////
////        System.out.println("Waiting for Thread 1 to complete");
//////        try {
//////            ob.join(1000);
//////        } catch (InterruptedException e) {
//////            throw new IllegalStateException(e);
//////        }
////
////        System.out.println("Waited enough! Starting Thread 2 now");
////        obj.start();
////        obj.run1();
////    }
////}
//public class Thred3  {
//    public static void main(String[] args) {
//        // Create Thread 1 using lambda expression
//       // Thread thread1 = new Thread(); {
//          public void run(){
//            System.out.println("Entered Thread 1");
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new IllegalStateException(e);
//            }
//            System.out.println("Exiting Thread 1");
//        }
//        // Create Thread 2
//        Thread thread2 = new Thread(() -> {
//            System.out.println("Entered Thread 2");
//            try {
//                Thread.sleep(4000);
//            } catch (InterruptedException e) {
//                throw new IllegalStateException(e);
//            }
//            System.out.println("Exiting Thread 2");
//        });
//        System.out.println("Starting Thread 1");
//        thread1.start();
//
//        System.out.println("Waiting for Thread 1 to complete");
//        try {
//            thread1.join(1000);
//        } catch (InterruptedException e) {
//            throw new IllegalStateException(e);
//        }
//
//        System.out.println("Waited enough! Starting Thread 2 now");
//        thread2.start();
//    }
//}