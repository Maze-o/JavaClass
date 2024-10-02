package CH21;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class C02FileCopy {
	// 명령어 원본경로 저장대상경로
	private static final String DIR = "C:\\TMP_IO\\";

	public static void main(String[] args) throws Exception {
		for (String arg : args) {
			System.out.println(arg);
		}

		Reader in = new FileReader(DIR + args[0]);
		Writer out = new FileWriter(DIR + args[1]);

		while (true) {
			int data = in.read();
			if (data == -1) {
				break;
			}
			
			out.write((char)data);
			out.flush();

		}

		in.close();
		out.close();
	}

}
