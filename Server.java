import java.io*;
import java.net*;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) throws Exception {
        boolean attivo = true;
        DatagramSocket serverSocket = new DatagramSocket(9876);
        
        byte[] bufferIN = new byte[1024];
        byte[] bufferOUT = new byte[1024];
        while (attivo) {
            DatagramPacket receivePacket = new DatagramPacket(bufferIN, bufferOUT.length);
            serverSocket.receive(receivePacket);
            String ricevuto = new String(receivePacket.getData());
            System.out.println("Received: " + sentence);
            int numCaratteri = receivePacket.getLenght();
            ricevuto=ricevuto.substring(0,numCaratteri);
            System.out.println("RICEVUTO:" + ricevuto);
            InetAddress IPClient = receivePacket.getAddress();
            int portaClient = receivePaclet.getPort();
            String daSpedire = ricevuto.toUppercase();
            bufferOUT = daSpedire.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(bufferOUT, bufferOUT-lenght, IPClient, portaClient);
            serverSocket.send(sendpacket);
            if (ricevuto.equals("fine")){
                System.out.println("chiusura");
                attivo=false;
            }
        }
        serverSocket.close();
    }
}
