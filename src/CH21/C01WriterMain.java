package CH21;

import java.io.FileWriter;
import java.io.Writer;

public class C01WriterMain {
	public static void main(String[] args) throws Exception {
		Writer fout = new FileWriter("C:\\TMP_IO\\text1.txt", true);
		fout.write("HELLOWORLD\n");
		fout.write("TEXT2\n");
		fout.write("TEXT3\n");
		fout.write("TEXT4\n");
		fout.write("TEXT5\n");
		fout.flush();
		fout.close();
		
	}

	
	
}
