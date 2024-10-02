package CH24;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class C02Client {
	public static void main(String[] args) throws Exception {
		Socket server = new Socket("192.168.5.27", 7000);
		
		
		
		
		DataInputStream din = new DataInputStream(server.getInputStream());
		DataOutputStream dout = new DataOutputStream(server.getOutputStream());

		Scanner sc = new Scanner(System.in);
		String send = null;
		String recv = null;

		while (true) {
			System.out.println("[ME(q:종료)] : ");
			send = sc.nextLine();
			dout.writeUTF(send);
			dout.flush();
			if (send.equals("q")) {
				break;
			}
			
			// 수신
			recv = din.readUTF();
			if (recv == null || recv.equals("q")) {
				break;
			}
			System.out.println("[CLIENT] : " + recv);
			dout.close();
			din.close();
			server.close();

		}
	}
}
