package CH16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C06SimpleDateFormat {
// 정처산기 시험에나옴!~!!!~!~!~!~!~!
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("YYYY/MM/DD 입력 : ");
		String ymd = sc.nextLine();
		
		// 포메터 객체 생성 (입력용)
		SimpleDateFormat fmtin = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(ymd);
		Date date = fmtin.parse(ymd);
		System.out.println(date);
		
		// 포메터 객체 생성 (출력용)
		SimpleDateFormat fmtout = new SimpleDateFormat("yyyy~MM~dd");
		System.out.println(fmtout.format(date));
	}
	
 
}
