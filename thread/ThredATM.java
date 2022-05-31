 class ATM {
    int SBI=1000000;
    int PNB=100000;
    int BOB=10000;
    public void banksbi(int a){
        if(SBI>=a)
        {
            System.out.println(a+" your withdrawal is successful");
            SBI=SBI-a;
            System.out.println("your reamainig amount left is "+ SBI);
        }
        else{
            System.out.println(a+" your money amount is greater than given amount so sorry!  ");
        }
    }
     public void bankpnb(int b){
         if(PNB>=b)
         {
             System.out.println(b+" your withdrawal is successful");
             PNB=PNB-b;
             System.out.println("your reamainig amount left is "+ PNB);
         }
         else{
             System.out.println(b+" your money amount is greater than given amount so sorry!  ");
         }
     }
     public void bankbob(int c){
         if(BOB>=c)
         {
             System.out.println(c+" your withdrawal is successful");
             BOB=BOB-c;
             System.out.println("your reamainig amount left is "+ BOB);
         }
         else{
             System.out.println(c+" your money amount is greater than given amount so sorry!  ");
         }
     }
}
class ThredATM extends Thread{
    static ATM h;
    int ab;
    public void run(){
      //  h.SBI(ab);
    }
}
