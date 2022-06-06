import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class SocketClient {
 public static void main(String[] args) {
 try {

 String sendMsg = "Messages sent by clients";

 int sendMsgLength=sendMsg.getBytes().length;

 InetAddress addr = InetAddress.getByName("localhost");

 DatagramPacket packet = new DatagramPacket(sendMsg.getBytes(),
sendMsgLength , addr, 8088);

 DatagramSocket socket = new DatagramSocket();
 
 socket.send(packet);
 
 byte[] receBuf = new byte[1024];
 DatagramPacket recePacket = new DatagramPacket(receBuf,
receBuf.length);
 socket .receive(recePacket);
 String receStr = new String(recePacket.getData(), 0 ,
recePacket.getLength());
 System.out.println( receStr);

 socket.close();
 } catch (Exception e) {

 e.printStackTrace();
 }
 }
}