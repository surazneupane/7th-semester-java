package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

//For creating the remote interface, extend the Remote interface
public interface AdderInterface extends Remote {
    public int add(int x,int y) throws RemoteException;

}
