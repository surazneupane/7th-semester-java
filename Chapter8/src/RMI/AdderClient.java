package RMI;
import java.rmi.Naming;

public class AdderClient {
        public static void main(String[] args)throws Exception {

            //       returns the reference of the remote object.
            AdderInterface adderInterface=(AdderInterface)
                    Naming.lookup("rmi://localhost:8000/add");
            System.out.println(adderInterface.add(3,3));

        }

    }
