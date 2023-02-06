import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


class MainServer  {
  public static void main(String[] args) {
    // abbiamo utilizzato come punto di riferimento il codice sorgente datoci dalla professoressa. stiamo creando degli oggetti di classe socket a cui avvieremo dei metodi speciali di quella particolare classe. abbiamo inserito delle librerie apposite e stiamo a verificare se esse presentano delle eccezioni particolari.
    try{
      ServerSocket serverSocket = new ServerSocket(2000);
          
    if(serverSocket!=null)
    {
       System.out.println("IN ATTESA...");
    serverSocket.accept();
      serverSocket.close();
    }
   
    } catch(IOException EX){
      System.out.println(EX);
    }

    
  }
}
