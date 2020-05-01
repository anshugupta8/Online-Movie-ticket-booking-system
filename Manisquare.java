import java.util.*;
class Manisquare
{//start of class
Scanner sc=new Scanner(System.in);
public void mani()
{//start of method
    try{//stat of try
    int l;
System.out.println("                                          **********WELCOME TO MANISQUARE-CINEMAX**********");
System.out.println("                                          Choose One Of The Following Movies");
System.out.println("                                          ENTER 1.JAI HO");
System.out.println("                                          Director:Kabir Khan");
System.out.println("                                          Rating:*****");
System.out.println("                                          Type:ACTION COMEDY");
System.out.println("                                          -------------------------");
System.out.println("                                          ENTER 2.PREM RATAN DHAN PAYO");
System.out.println("                                          Director:Shajid Nadaiwala");
System.out.println("                                          Rating:****");
System.out.println("                                          Type:MYSTERY");
System.out.println("                                          -------------------------");
System.out.println("                                          ENTER 3.BAJIRAO MASTAANI");
System.out.println("                                          Director:Sanjay leela Bhansali");
System.out.println("                                          Rating:***");
System.out.println("                                          Type:EPIC");
System.out.println("                                          -------------------------");
do{System.out.print("                                          ");
   l=sc.nextInt();
   if(l==0 || l>3)
   System.out.println("                                          WRONG INPUT!!!!!");
}while(l==0 || l>3);
int r;
Calendar c=Calendar.getInstance();
System.out.println("                                          Choose Date Of Show:");
System.out.println("                                          ENTER 1."+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
System.out.println("                                          ENTER 2."+(c.get(Calendar.DATE)+1)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
do{System.out.print("                                          ");
r=sc.nextInt();
if(r==0||r>2)
 System.out.println("                                          WRONG INPUT!!!!!");
}while(r==0||r>2);
String ar[]={"","9am","12pm","3pm","7pm","11pm"};int t;
    System.out.println("                                          TIMING OF SHOW");
    System.out.println("                                          ENTER 1-9AM");
    System.out.println("                                          ENTER 2-12PM");
    System.out.println("                                          ENTER 3-3PM");
    System.out.println("                                          ENTER 4-9PM");
    System.out.println("                                          ENTER 5-11PM");
do{System.out.print("                                          ");
    t=sc.nextInt();
    if(t!=1&&t!=2&&t!=3&&t!=4&&t!=5)
    System.out.println("                                          WRONG INPUT!!!!!");
}while(t!=1&&t!=2&&t!=3&&t!=4&&t!=5);
System.out.println("                                          |--------------------------------|");
if(l==1)
System.out.println("                                          |MOVIE NAME:JAI HO               |");
else if(l==2)
System.out.println("                                          |MOVIE NAME:PREM RATAN DHAN PAYO |");
else
System.out.println("                                          |MOVIE NAME:DEEWANI MASTAANI     |");
System.out.println("                                          |LOCATION:MANISQUARE-CINEMA      |");
if(r==1)
System.out.println("                                          |DATE:"+(c.get(Calendar.DATE))+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR)+"                     |");
else
System.out.println("                                          |DATE:"+(c.get(Calendar.DATE)+1)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR)+"                   |");
if(t==2||t==5)
System.out.println("                                          |TIME:"+ar[t]+"                       |");
else
System.out.println("                                          |TIME:"+ar[t]+"                        |");
System.out.println("                                          |--------------------------------|");
System.out.println("                                          CHOOSE SEAT OPTION GIVEN BELOW:");
System.out.println("                                          ENTER 1: CLUB-Rs.250 per seat");
System.out.println("                                          ENTER 2: EXECUTIVE-Rs.300 per seat");
int seat;
do{System.out.print("                                          ");
    seat=sc.nextInt();
    if(seat!=1&&seat!=2)
    System.out.println("                                          WRONG CHOICE!!!!!");
}while(seat!=1&&seat!=2);
if(seat==1)
System.out.println("                                          ENTER THE NUMBER OF CLUB'S SEAT");
else
System.out.println("                                          ENTER THE NUMBER OF EXECUTIVE'S SEAT");
int no;
do{System.out.print("                                          ");
    no=sc.nextInt();
    if(no>10)
    System.out.println("                                          SORRY!!!!! ABOVE 10 SEATS IS UNAVAILABLE");
}while(no>10);
System.out.println("                                          SEAT AVAILABLE FROM 10 TO 45");
int ar1[]=new int[no];int E;
for(int s=0;s<ar1.length;s++)
   { //start of for loop
       System.out.println("                                          ENTER SEAT NUMBER");
       
do{System.out.print("                                          ");
    ar1[s]=sc.nextInt();
    if(ar1[s]<10||ar1[s]>45)
    System.out.println("                                          SORRY!!!!!SEATS YOU HAVE ENTERED IS UNAVAILABLE ");
    
 
}while(ar1[s]<10||ar1[s]>45);
    
}//end of for loop
int m;
for(int i=0;i<ar1.length;i++)
{//start of i loop
    m=ar1[i];
    for(int j=i+1;j<ar1.length;j++)
        {//start of j loop
            if(ar1[j]==m)
            {//start of if
                
                System.out.println("                                          SORRY SEAT NUMBER "+ar1[j]+" IS ALREADY BOOKED BY YOU!!!!!");
               do{System.out.println("                                          PLEASE ENTER SEAT NUMBER AGAIN");
                System.out.print("                                          ");
                ar1[j]=sc.nextInt();
                if(ar1[j]<10||ar1[j]>45)
                System.out.println("                                          SORRY!!!!! SEATS YOU HAVE ENTERED IS UNAVAILABLE");
            }while(ar1[j]<10||ar1[j]>45);
            }//end of if
            }//end of j loop
    }//end of i loop
int u=0;double tax=0.0;double sum=0.0;
if(seat==1)
{//start of if
u=(250*no);
tax=(u*12.5)/100;
sum=u+tax;
}//end of if
else
{//start of else
u=(300*no);
tax=(u*12.5)/100;
sum=u+tax;
   }//end of else
 
     System.out.println('\u000c');
   System.out.println("                                           **********USER DETAILS**********");
   System.out.println();
   System.out.println();
   System.out.println("                                           PLEASE ENTER YOUR FIRST NAME ");
   System.out.print("                                           ");
   String Fname=sc.next();
    System.out.println();
   System.out.println();
   System.out.println("                                           PLEASE ENTER YOUR LAST NAME ");
   System.out.print("                                           ");
   String Lname=sc.next();
   System.out.println();
   System.out.println();
  System.out.println("                                           PLEASE ENTER YOUR ACCOUNT NUMBER ");
   System.out.print("                                           ");
   long acc=sc.nextLong();
   System.out.println();
   System.out.println();
   System.out.println("                                           PLEASE ENTER YOUR MOBILE NUMBER");
  int g=0;int e=0;long mob;
   do{System.out.print("                                           ");
        mob=sc.nextLong();
       for(long y=mob;y>0;y=y/10)
       g++;
       if(g==10)
       e=1;
       else
       System.out.println("                                           INVALID NUMBER!!! ENTER YOUR MOBILE NUMBER AGAIN");
       g=0;
    }while(e!=1);
   System.out.println('\u000c');
   System.out.println("                                                  ***********ORDER SUMMARY***********");
   if(l==1)
    System.out.println("                                          MOVIE NAME : JAI HO");
    else if(l==2)
    System.out.println("                                          MOVIE NAME : PREM RATAN DHAN PAYO");
    else
    System.out.println("                                          MOVIE NAME : BAJIRAO MASTAANI");
    System.out.println("                                          CINEMAX : MANISQUARE");
    System.out.println("                                          LOCATION : KOLKATA, WEST BENGAL");
    System.out.println("                                          DATE OF BOOKING:"+(c.get(Calendar.DATE))+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
System.out.println("                                          TIME OF BOOKING:"+(c.get(Calendar.HOUR))+":"+(c.get(Calendar.MINUTE)));
if(seat==1)
System.out.println("                                          CLUB:Rs.250");
else
System.out.println("                                          EXECUTIVE: Rs.300");
System.out.println("                                          NUMBER OF SEAT: "+no);
System.out.print("                                          ");
for(int p=0;p<ar1.length;p++)
System.out.print(ar1[p]+",");
System.out.println();
System.out.println("                                          TICKET AMOUNT :Rs."+u);
System.out.println("                                          SERVICE TAX   :Rs."+tax);
System.out.println("                                                         -----------");
System.out.println("                                          TOTAL AMOUNT  :Rs."+sum);
System.out.println();
System.out.println("                                                                  CONGRATULATIONS...!!! YOUR BOOKING IS DONE!!!");
}catch(InputMismatchException e)
{//start of catch
    System.out.print("                                          ");
    System.out.println(e.getMessage());
}//end of catch
}//end of method
}//end of class
 
