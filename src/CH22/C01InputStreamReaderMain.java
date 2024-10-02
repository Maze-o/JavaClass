package CH22;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class C01InputStreamReaderMain {
	public static void main(String[] args) throws Exception {
		OutputStream fout = new FileOutputStream("C:\\TMP_IO\\test.exe");

		fout.write("홍길동".getBytes(StandardCharsets.UTF_8));

		fout.flush();
		fout.close();

		InputStream fin = new FileInputStream("C:\\TMP_IO\\test.exe");
		InputStreamReader subIn = new InputStreamReader(fin);
		subIn.read();

		while (true) {
			int data = fin.read();

			if (data == -1) {
				break;
			}

			System.out.print((char) data);
		}

	}

}
