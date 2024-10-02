package CH21;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;
import java.util.UUID;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class C09JsoupMain {
	public static void main(String[] args) throws Exception {
		Connection conn = Jsoup.connect("https://www.op.gg/champions");

		Document document = conn.get();

//		System.out.println(document);

		Elements elements = document.getElementsByTag("img");
//		System.out.println(elements);

		for (Element el : elements) {
			String img_url = el.getElementsByAttribute("src").attr("src");
			System.out.println(img_url);
			URL url = (new URI(img_url)).toURL();

			InputStream in = url.openStream();

			BufferedInputStream buffin = new BufferedInputStream(in);

			OutputStream out = new FileOutputStream("C:\\TMP_IO\\" + UUID.randomUUID() + ".png");
			
			byte [] buffer = new byte[4096];
			
			while(true) {
				int data = buffin.read(buffer);
				if (data == -1) {
					break;
				}
				
				out.write(buffer, 0 , data);
				out.flush();
			}
			
			out.close();
			in.close();
			buffin.close();
					
		}
		
		

	}

}
