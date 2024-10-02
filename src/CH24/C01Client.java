package CH24;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class C01Client {
	public static void main(String[] args) throws Exception {
		Socket server = new Socket("192.168.5.50", 7000);

		InputStream in = server.getInputStream();

		DataInputStream din = new DataInputStream(in);
		String recv = din.readUTF();
		System.out.println("RECV : " + recv);

		din.close();
		in.close();
		server.close();

	}
}
