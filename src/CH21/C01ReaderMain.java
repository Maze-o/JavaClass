package CH21;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C01ReaderMain {
	public static void main(String[] args) throws IOException{
		
		Reader fin = new FileReader("C:\\TMP_IO\\text1.txt");
		int data = 0;
		StringBuffer buffer = new StringBuffer();
		
		while((data = fin.read()) != -1 ) {
			
//			System.out.print((char)data);
//			if (data == -1) {
//				break;
//				
//			}
			buffer.append((char)data);
		}
		System.out.println(buffer);
		fin.close();
		
	}
}
