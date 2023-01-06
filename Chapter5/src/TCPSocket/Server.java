package TCPSocket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket= new ServerSocket(8000);
        //let the server wait for 10 seconds
//        serverSocket.setSoTimeout(10000);
        try {
            System.out.println("I am Server Waiting For a Client at Port:" +
                    serverSocket.getLocalPort());
            Socket server = serverSocket.accept();
            System.out.println("I am just connected to client " +
                    server.getRemoteSocketAddress());

            InputStream inputStream = server.getInputStream();
            DataInputStream dataInputStream =(new DataInputStream(inputStream));
            System.out.println("Data Received From Client ::: " +
                    dataInputStream.read());
            System.out.println("Radius Value Received From Client :::" +
                    dataInputStream.readDouble());

            OutputStream outputStream = server.getOutputStream();
            DataOutputStream dataOutputStream = new
                    DataOutputStream(outputStream);
            dataOutputStream.writeUTF("Hello " +
                    "Client I received all data.");

            dataInputStream.close();
            dataOutputStream.close();
            server.close();

        }catch (SocketTimeoutException s)
        {
            s.printStackTrace();
            serverSocket.close();
        }


    }
}
