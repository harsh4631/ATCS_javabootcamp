import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Assign {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		// TODO Auto-generated method stub
      try {
    	  Class.forName("com.mysql.cj.jdbc.Driver");
    	  
    	  
    	  Connection ob=DriverManager.getConnection("jdbc:mysql://localhost:3306/harsh","root","root");
    	 
    	  Scanner obj=new Scanner(System.in);
    	  
    	  if(ob!=null) {
    		  
    	  boolean Flag=true;
    		  do {
    		  System.out.println("connected");
    	    System.out.println("1: insert");
    	    System.out.println("2: update");
    	    System.out.println("3: delete");
    	    System.out.println("4: show");
    	    System.out.println("5: show using id");
    	    System.out.println("6: show using name");
    	    System.out.println("7: show using sort data");
    	    System.out.println("0: exit");
    	    
    	 
    	   
    	   
    	    Statement jk=ob.createStatement();
    	    int choose=obj.nextInt();
    	    switch (choose) {
			case 1: 
			
				
				String First=obj.next();
				String Last=obj.next();
				int age=obj.nextInt();
		    	 String city = obj.nextLine();
		    	 int ID= obj.nextInt();
		    	 
		    	 String insertquery="insert into people(First,Last,age,city,ID) values(?,?,?,?,?);";
		    	 PreparedStatement hj=ob.prepareStatement(insertquery);
		    	 hj.setString(1, First);
		    	 hj.setString(2, Last);
		    	 hj.setInt(3, age);
		    	 hj.setString(4,city);
		    	 hj.setInt(5, ID);
		    	 hj.executeUpdate();
			
			break;
			case 2:
				String city1=obj.next();
				int ID1=obj.nextInt();
				
				String updatequery="update people set city=? where ID=?";
				 PreparedStatement hj1=ob.prepareStatement(updatequery);
				 hj1.setString(1,city1);
				 hj1.setInt(2, ID1);
				 hj1.execute();
				 
				 break;
				 
			case 3:
				int ID2=obj.nextInt();
				String Deletequery="delete from people where ID=?";
				PreparedStatement hj2=ob.prepareStatement(Deletequery);
				hj2.setInt(1, ID2);
				hj2.execute();
				
				break;
			case 4:
				String showquery="select * from people";
				PreparedStatement hj4=ob.prepareStatement(showquery);
				 ResultSet st=hj4.executeQuery();
				 while(st.next()) {
		    		 System.out.println(st.getString(1)+" "+st.getString(2)+" "+st.getInt(3)+" "+st.getString(4)+" "+st.getInt(5));
		    	 }
				
			
			break;
			case 5:
				int id3=obj.nextInt();
				String idquery="select * from people where ID=?";
				PreparedStatement hj5=ob.prepareStatement(idquery);
				hj5.setInt(1, id3);
				 ResultSet st1=hj5.executeQuery();
				 while(st1.next()) {
		    		 System.out.println(st1.getString(1)+" "+st1.getString(2)+" "+st1.getInt(3)+" "+st1.getString(4)+" "+st1.getInt(5));
		    	 }
				break;
			case 6:
				
				String name=obj.next();
				String namequery="select * from people where First=?";
				PreparedStatement hj6=ob.prepareStatement(namequery);
				hj6.setString(1, name);
				ResultSet st2=hj6.executeQuery();
				if(st2.next()) {
				do {	
				
				 
		    		 System.out.println(st2.getString(1)+" "+st2.getString(2)+" "+st2.getInt(3)+" "+st2.getString(4)+" "+st2.getInt(5));
				}while(st2.next());
		    	 }
				else {
					System.out.println("not found");
				}
				break;
			case 7:
				String sortquery="select * from people order by First ";
				PreparedStatement hj7=ob.prepareStatement(sortquery);
				ResultSet st3=hj7.executeQuery();
				while(st3.next()) {
		    		 System.out.println(st3.getString(1)+" "+st3.getString(2)+" "+st3.getInt(3)+" "+st3.getString(4)+" "+st3.getInt(5));
		    	 }
				
				break;
			case 0:
				
				Flag=false;
				
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + choose);
			}
    		  
    	   }
    		  while(Flag!=false);
    	  }
    	  else {
    		  System.out.println("not connected");
    	  }
    	  
}
      catch(Exception e) {
    	e.printStackTrace();
      }
    
}
}