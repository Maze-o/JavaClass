package CH19;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Properties;

public class C06PropertiesMain {
	public static void main(String[] args) throws IOException {
		
		//프로젝트 경로 확인
		String dirPath = System.getProperty("user.dir");
		System.out.println(dirPath);
		
		// 클래스 경로 확인
		String classPath = System.getProperty("java.class.path");
		System.out.println(classPath);
		
		//패키지 경로
		String packagePath = C06PropertiesMain.class.getPackageName();
		System.out.println(packagePath);
		
		//파일경로
		String filePath = dirPath+File.separator+"src"+File.separator+packagePath+File.separator+"application.properties";

		//파일경로받기
		FileInputStream m = new FileInputStream(filePath);
		
		// 파일 받아서 경로 넣어줌
		Properties properties = new Properties();
		properties.load(m);
		
		//키값으로 된 벨류 넣기
		String url=properties.getProperty("url");
		System.out.println(url);
		String username=properties.getProperty("username");
		System.out.println(username);
		String password=properties.getProperty("password");
		System.out.println(password);
		
	
	}
}
