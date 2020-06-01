import java.lang.*;
import java.io.*;
import java.util.*;
import java.net.*;
import java.rmi.registry.*;
public class Client
{
   
    public Client()
    {
    }
public static void main(String[] args)
{
    try{
    Registry registry=LocateRegistry.getRegistry(null);
    Hello stub=(Hello) registry.lookup("Hello");
  //  stub.PrintName();
    double price=0.0;
Calendar date = new GregorianCalendar();

 int s = date.get(Calendar.SECOND);
      int m = date.get(Calendar.MINUTE);
      int h = date.get(Calendar.HOUR);


double num;
int des;
InetAddress ip=InetAddress.getLocalHost();
System.out.println("");
int des1;
Scanner in=new Scanner(System.in);
System.out.println("IF YOU WANT MILK:");
des1=in.nextInt();
while(des1==1)
{
System.out.println("How Many Liters: ");
double d1= in.nextDouble();
System.out.print(d1);

num=stub.add(d1,h,m,s);
if (num<3)
{
des1++;
System.out.println("");
System.out.println("SORRY WE HAVE NO STOCK !!!!!!!!!  ");
}
else
{
des1++;
System.out.println("\n you have to pay an amount of :  "+(String.format("%.2f",num)));
price=price+num;
}
System.out.println("");
System.out.println("IF YOU WANT MILK:");
des1=in.nextInt();
while(des1!=0 && des1!=1)
{
System.out.println("");
System.out.println("PLEASE ENTER ZERO (OR) ONE");
System.out.println("");
System.out.println("IF YOU WANT MILK:");
des1=in.nextInt();
}

}
Calendar date2 = new GregorianCalendar();

 int s1 = date2.get(Calendar.SECOND);
      int m1 = date2.get(Calendar.MINUTE);
      int h1 = date2.get(Calendar.HOUR);
Calendar date3 = new GregorianCalendar();

 int s2 = s1-s;
      int m2 = m1-m;
      int h2 = h1-h;
System.out.println("");
System.out.println("TOTAL AMOUNT :Rs "+(String.format("%.2f",price))+"");
System.out.println("");
System.out.println("PROCESSING TIME IS : "+h2+" ----- HOURS ----- "+m2+" ------- MINUTES ------ "+s2+"------ SECONDS ");


}
catch(Exception e)
{
System.out.println("Exception : "+e);
}
}
}

