package UDPSocket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        InetAddress ip = InetAddress.getLocalHost();
        byte buff[] = null;
        System.out.println("Enter Some Text:");
        Scanner scanner = new Scanner(System.in);
        buff = scanner.nextLine().getBytes();
        DatagramPacket datagramPacket =
                new DatagramPacket(buff,buff.length,ip,8000);
        datagramSocket.send(datagramPacket);
    }
}
