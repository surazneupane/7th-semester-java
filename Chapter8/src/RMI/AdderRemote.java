package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/* UnicastRemoteObject is used for exporting a remote object with
 Java Remote Method Protocol
  and obtaining a stub that communicates to the remote object.
*/
public class AdderRemote extends UnicastRemoteObject  implements
        AdderInterface {

    AdderRemote() throws RemoteException {

    }
    public int add(int a,int b)
    {
        return a+b;
    }

}
