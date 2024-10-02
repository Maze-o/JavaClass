package CH21;

import java.io.BufferedInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;

public class C08URLStreamMain {
	public static void main(String[] args) throws Exception {
		URL url = new URL("https://www.naver.com");

		InputStream bin = url.openStream();

		BufferedInputStream buffin = new BufferedInputStream(bin);

		Reader in = new InputStreamReader(buffin);

		
		Writer out = new FileWriter("c:\\TMP_IO\\index.html");
		
		while (true) {
			int data = in.read();

			if (data == -1) {
				break;
			}

			System.out.print((char) data);
			out.write((char) data);
		}
		
		out.flush();
		out.close();
		in.close();
		buffin.close();
		bin.close();

	}
}
