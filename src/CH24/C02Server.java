package CH24;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class C02Server {
	public static void main(String[] args) throws Exception {

		// 서버 소켓 생성
		ServerSocket server = new ServerSocket(7000);
		System.out.println("[INFO] SERVER SOCKET LISTENING");

		Socket client = server.accept();
		System.out.println("[INFO] SERVER ACCEPT CLIENT IP : " + client.getInetAddress());

		DataInputStream din = new DataInputStream(client.getInputStream());
		DataOutputStream dout = new DataOutputStream(client.getOutputStream());

		Scanner sc = new Scanner(System.in);
		String send = null;
		String recv = null;

		while (true) {
			// 수신
			recv = din.readUTF();
			if (recv == null || recv.equals("q")) {
				break;
			}
			System.out.println("[CLIENT] : " + recv);

			System.out.println("[ME(q:종료)] : ");
			send = sc.nextLine();
			dout.writeUTF(send);
			dout.flush();
			if (send.equals("q")) {
				break;
			}

		}

		System.out.println("[INFO] 서버 종료");
		dout.close();
		din.close();
		client.close();
		server.close();
		sc.close();
	}
}
