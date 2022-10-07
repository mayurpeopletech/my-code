package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class Shop 
{ static Scanner sc= new Scanner(System.in);
    static double total=0;
    static double bal=0;
    static void display(){
    	System.out.println("==============>* WELCOME TO PEOPLETECH STORE * <==============\n");
    	System.out.println("               [ Available Products In The Store ]          ");
		System.out.println("------------------------------------------------------------");
		System.out.println(" [1] Electronics \n [2] Bath \n [3] Kitchen \n [4]Cloths \n [5] Others \n"
				+ "-------------------------------------------------------------");
		System.out.println("Please Enter your choice..?");
		int choice=sc.nextInt();
		switch(choice){
		case 1:
			boolean invalid;
			int choice4=0;
			int  i=0;
			int [] arr=new int[3];
			do { invalid= false;
			try{
 				 Class.forName("com.mysql.cj.jdbc.Driver");
 		    	 Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_info","root","root");
 		    	Statement statement=connection.createStatement();
                ResultSet set=statement.executeQuery("Select * from product_info.electronic ");
                System.out.println("Code : \t"+"Pname :\t"+"Cost :"+"\n");
                while(set.next())
                {
                	System.out.println(set.getInt(1)+"\t"+set.getString(2)+"\t"+set.getInt(3));
                	arr[i]=set.getInt(1);
                	i++;
                }
 		    	System.out.println("\n Enter your code:->....");
 				choice4 = sc.nextInt();
				 if(!(choice4==arr[0]||choice4==arr[1]||choice4==arr[2]))
				 { System.out.println("Invalid Input Please Try Again ");
					 invalid=true;
			     }
			    }catch(Exception e)
			{
			  System.out.println(e);  	
			}
			meth1(choice4);	
			}while(invalid);	
		 }
		switch(choice)
		{ case 2:
			boolean invalid;
			int choice3=0;
			int  i=0;
			int [] arr=new int[3];
			do { invalid= false;
			try
 			{
 				 Class.forName("com.mysql.cj.jdbc.Driver");
 		    	 Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_info","root","root");
 		    	Statement statement=connection.createStatement();
                ResultSet set=statement.executeQuery("Select * from product_info.bath ");
                System.out.println("Code : \t"+"Pname :\t"+"Cost :"+"\n");
                while(set.next())
                {
                	System.out.println(set.getInt(1)+"\t"+set.getString(2)+"\t"+set.getInt(3));
                	arr[i]=set.getInt(1);
                	i++;
                }
 		    	System.out.println("\n Enter your code:->....");
 				choice3 = sc.nextInt();
				 if(!(choice3==arr[0]||choice3==arr[1]||choice3==arr[2]))
				 { System.out.println("Invalid Input Please Try Again ");
					 invalid=true;
			     }
			    }catch(Exception e)
			{
			  System.out.println(e);  	
			}
			 meth2(choice3);
			} while(invalid);
		}
		switch(choice){
	case 3:
		boolean invalid;
		int choice2=0;
		int  i=0;
		int [] arr=new int[3];
		do { invalid= false;
		try
			{
				 Class.forName("com.mysql.cj.jdbc.Driver");
		    	 Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_info","root","root");
		    	Statement statement=connection.createStatement();
            ResultSet set=statement.executeQuery("Select * from product_info.kitchen ");
            System.out.println("Code : \t"+"Pname :\t"+"Cost :"+"\n");
            while(set.next())
            {
            	System.out.println(set.getInt(1)+"\t"+set.getString(2)+"\t"+set.getInt(3));
            	arr[i]=set.getInt(1);
            	i++;
            }
		    	System.out.println("\n Enter your code:->....");
		    	choice2 = sc.nextInt();
			 if(!(choice2==arr[0]||choice2==arr[1]||choice2==arr[2]))
			 { System.out.println("Invalid Input Please Try Again ");
				 invalid=true;
		     }
		    }catch(Exception e)
		{
		  System.out.println(e);  	
		}
		meth1(choice2);	
		}while(invalid);
	}
		switch(choice)
		{
			case 4:
				boolean invalid;
				int choice1=0;
				int  i=0;
				int [] arr=new int[3];
				do { invalid= false;
				try
					{
						 Class.forName("com.mysql.cj.jdbc.Driver");
				    	 Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_info","root","root");
				    	Statement statement=connection.createStatement();
		            ResultSet set=statement.executeQuery("Select * from product_info.cloths ");
		            System.out.println("Code : \t"+"Pname :\t"+"Cost :"+"\n");
		            while(set.next())
		            {
		            	System.out.println(set.getInt(1)+"\t"+set.getString(2)+"\t"+set.getInt(3));
		            	arr[i]=set.getInt(1);
		            	i++;
		            }
				    	System.out.println("\n Enter your code:->....");
				    	choice1 = sc.nextInt();
					 if(!(choice1==arr[0]||choice1==arr[1]||choice1==arr[2]))
					 { System.out.println("Invalid Input Please Try Again ");
						 invalid=true;
				     }
				    }catch(Exception e)
				{
				  System.out.println(e);  	
				}
				meth1(choice1);	
    }while(invalid);
   }
 }
    public static void meth1(int a){
		 if(a==125)
		 {System.out.println(" Description : Samsung LED is good choice.... \n  Enter how much peace : ");
			 int p=sc.nextInt();
			 total=total+(p*25000.00); }
		 if(a==126){
			System.out.println(" Description : Apple LED is good choice.... \n  Enter how much peace : ");
			int p=sc.nextInt();
			total=total+(p*50000.00);}
		 if(a==127){
			 System.out.println(" Description : Mi LED is good choice.... \n  Enter how much peace : ");
			 int p=sc.nextInt();
			 total=total+(p*15000.00);}
	     }
    static void meth2(int a){
		 if(a==225){
			 System.out.println("Description:  santoor Is A Good Choice....\n Enter A how much you wants : ");
			 int peace=sc.nextInt();	  
			 total=total+(peace*40.00);  }
		 if(a==226){
			 System.out.println("Description:  Fair & Lovely  Is A Good Choice....\n Enter A how much you wants :");
			 int peace=sc.nextInt();
			 total=total+(peace*90.00); }
		 if(a==227){
			 System.out.println("Description: Dove shampoo Is A Good Choice....\n Enter A how much you wants :");
			 int peace=sc.nextInt();
			 total=total+(peace*50.00);  }
    }
    static void meth3(int a){
		 if(a==325) {
			 System.out.println("Description: Spoon Is A Good Choice....\n Enter A how much you wants :");
				 int q= sc.nextInt();
				 total=total+(q*70.00);  }
		 if(a==326) {
			 System.out.println("Description: Container Is A Good Choice....\n Enter A how much you wants :");
				 int q = sc.nextInt();
				 total=total+(q*400.00);}
		 if(a==327) {
			 System.out.println("Description: Knife Is A Good Choice....\n Enter A how much you wants :");
				 int q= sc.nextInt();
				 total=total+(q*90.00);   }
		 }
    static void meth4(int a){
		 if(a==425) {
			 System.out.println("Description: Jeans Is A Good Choice....\n Enter A how much jeans  you wants :");
				 int p = sc.nextInt();
				 total=total+(p*900.00);}
		 if(a==426) {
			 System.out.println("Description: Trouger Is A Good Choice....\n Enter A how much trouger  you wants :");
			 int p=sc.nextInt();
			 total=total+(p*1200.00);}
		 if(a==427){
			 System.out.println("Description: Kurta_Pajama Is A Good Choice....\n Enter A how much Kurta_Pajama  you wants :");
			 int p=sc.nextInt();
			 total=total+(p*1500.00);  }
		 }    
    public static void main(String[] args) {
		int choice;
		Shop aobj= new Shop();
		do { display();		
			boolean invalid;
			{  do {
				invalid=false; 
				System.out.println("Do You Want To Purchase More");
				System.out.println("Continue Press 1\nPress 2 for Exit");
				choice=aobj.sc.nextInt();
				if(!(choice==1||choice==2)){
					System.out.println("Invalid Input Please Try Again  ");
					invalid=true;  }
			} while(invalid);	}
		}while(choice==1);		
		System.out.println("-----------------------------------------------------");
		System.out.println("    Before Disscount Your Total Bill :- "+aobj.total);
		System.out.println("======THANK YOU FOR SHOPPING YOU HAVE SAVED MONEY===== " );	
		if(aobj.total>=5000) {
			double dis =(aobj.total/100)*10;
			aobj.total=aobj.total-dis;	
			System.out.println("_______Your Disscount %10 is :-    "+dis +" \n------After Disscount Final Total Bill :- " +aobj.total);
			System.out.println("\n======THANK YOU FOR SHOPPING YOU HAVE SAVED MONEY " +dis+"....");
		  }	    }
    public void name() {
    	  System.out.println("please enter choice");
          int z=sc.nextInt();
          double price=0;
      	try{
				 Class.forName("com.mysql.cj.jdbc.Driver");
		    	 Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_info","root","root");
		    	Statement statement=connection.createStatement();
          ResultSet tet=statement.executeQuery("Select * from product_info.electronic where pcode='"+z+"'");
          while(tet.next())
          {
          	price =tet.getInt(3);
          	System.out.println(price);
          }
			}
          catch (Exception e) {
			System.out.println(e);
		}	
	}
}
    
