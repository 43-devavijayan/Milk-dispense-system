import java.rmi.*;
import java.rmi.RemoteException.*;
public interface Hello extends Remote
{
   
    public double add(double d2,int h,int m,int s)throws RemoteException;
}
