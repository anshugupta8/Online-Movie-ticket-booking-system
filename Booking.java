import java.util.*;
class Booking
{//start of class
public void area()
{ //start of method 
 System.out.println("                                                   ***********ONLINE MOVIE BOOKING SITE***********"); 
 System.out.println();
    int n;
Scanner sc=new Scanner(System.in);
System.out.println("                                          ENTER 1.SWABHUMI CINEMA-INOX");
System.out.println("                                          129,Narkeldanga Main Road,Kolkata-700054");
System.out.println("                                          Rating:*****");
System.out.println("                                          ------------------------------------------------------");
System.out.println("                                          ENTER 2.MANI SQUARE-CINEMAX");
System.out.println("                                          12,Bengal Chemical,Kolkata-700006");
System.out.println("                                          Rating:****");
System.out.println("                                          ------------------------------------------------------");
System.out.println("                                          ENTER 3.JAYA CINEMA-INOX");
System.out.println("                                          67,Bangur Street,Kolkata-700032");
System.out.println("                                          Rating:****");
System.out.println("                                          ------------------------------------------------------");
System.out.println("                                          Choose One Of The Above Area--");
do{ System.out.print("                                          ");
    n=sc.nextInt();
    if(n==0||n>3)
    System.out.println("                      WRONG INPUT!!!!!");
   }while(n==0||n>3);
   switch(n)
   {//start of switch
       case 1:
       Swabhumi ob=new Swabhumi();
       ob.swa();
       break;
       case 2:
       Manisquare o=new Manisquare();
       o.mani();
       break;
       case 3:
       Jaya b=new Jaya();
       b.jay();
       break;    
    }//end of switch
}//end of method
}//end of class
    