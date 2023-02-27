import java.io*;
import java.net*;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientUDP {
    public static void main(String[] args) throws Exception {
        int portaServer = 9876;
        InetAddress IPAddress = InetAddress.getByName("localhost");
        
        byte[] bufferIN = new byte[1024];
        byte[] bufferOUT = new byte[1024];
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        DatagramSocket clientSocket = new DatagramSocket();
        
        byte[] sendData = new byte[1024];
        String sentence = "Hello, UDP Server!";
        sendData = sentence.getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
        clientSocket.send(sendPacket);
    }
}
