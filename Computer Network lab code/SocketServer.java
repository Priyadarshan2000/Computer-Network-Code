import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class SocketServer {
 public static void main(String[] args) {
 try {
 
 byte[] bytes = new byte[1024];
 DatagramPacket packet = new DatagramPacket(bytes, bytes.length);

 DatagramSocket socket = new DatagramSocket(8088);

 socket.receive(packet);
 String receiveMsg = new String(packet.getData(), 0,
packet.getLength());
 System.out.println(receiveMsg);

 String sendMsg = "Messages sent by the server";

 packet.setData(sendMsg.getBytes());
 packet.setLength(sendMsg.getBytes().length);

 socket.send(packet);

 socket.close();
 } catch (Exception e) {

 e.printStackTrace();
 }
 }
}