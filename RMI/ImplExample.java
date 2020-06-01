 import java.net.*;
 import java.rmi.RemoteException;
class q
{
    double d2;
InetAddress ip;
double price;
int h,m,s;
String host;
}

public class ImplExample implements Hello
{
   
    int i=0,front=-1,rear=-1,f1=0,r1=0;
q[] a=new q[10];
q[] b=new q[10];
public void enqueue(q ai)
{
 if(front==-1)
front=rear=0;
 else
rear=(rear+1)%2;
 a[rear]=ai;  //enqueue
 }


public void enq(q ai)
{
 if(f1==-1)
f1=r1=0;
 else
r1=(1+1)%2;
 a[r1]=ai;  //enqueue
 }


q dequeue()
{
q t= new q();
t=a[rear];
if(front==rear)         //dequeue
	 front=rear=-1;
else
	front = (front+1)%2;
return t;
}


q deq()
{
q t= new q();
t=a[r1];
if(f1==r1)         //dequeue
 f1=r1=-1;
else
f1= (f1+1)%2;
return t;
}


double calc(q ai)
{
q m=new q();
double total=300;
double amount;
if(total>ai.d2)
{
     try {
    Thread.sleep(10000);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
total=total-ai.d2;
amount=ai.d2*16.52;
m=dequeue();
return amount;
}
else
{
amount=2.0;
return amount;
}
}

//public Addserverimp() throws RemoteException
//{

//}

public double add(double d2,int h,int m,int s) throws RemoteException{
q ai=new q();

ai.d2=d2;
ai.h=h;
ai.m=m;
ai.s=s;
  try  
   {  
if(front !=(rear+1)%2)
{
enqueue(ai);
i++;
ai.price=calc(ai);
}
else
{
System.out.println();
System.out.println("-*********SERVER BUSYYYYYYYYYYYY**********");
System.out.println();
enq(ai);
while(f1!= -1)
{
if(front !=(rear+1)%2)
{
q t=new q();
t=deq();
enqueue(t);
i++;
ai.price= calc(t);
}
}}
System.out.println("");
System.out.println("Requesting time : "+ai.h+" hour : "+ai.m+" minutes : "+ai.s+" seconds  ");
return ai.price;

}
  catch(Exception e)  
   {  
   System.out.println(e.getMessage());  
}

  return 0;
   }  
}

