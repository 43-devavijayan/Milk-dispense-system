import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class Server extends ImplExample
{
   
   
    public Server()throws RemoteException
    {
      super();
    }
    public static void main(String[] args)
    {
        try{
        ImplExample obj=new ImplExample();
        Hello stub=(Hello) UnicastRemoteObject.exportObject(obj,0);
        Registry registry=LocateRegistry.getRegistry();
        registry.bind("Hello",stub);
        System.err.println("Server Ready");
    }
    catch(Exception e)
    {
        System.out.println("Error Occured");
    }
}

}
