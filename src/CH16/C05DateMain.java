package CH16;

import java.util.Calendar;

public class C05DateMain {
	public static void main(String[] args) {
//		Date d1 = new Date();
//		System.out.println(d1);
//		System.out.println(d1.getMonth() + 1);
//		System.out.println(d1.getDay());
//		System.out.println(d1.getHours());
//		System.out.println(d1.getMinutes());
//		System.out.println(d1.getSeconds());
//		System.out.println(d1.getTime());
		
		Calendar cal = Calendar.getInstance();
		
		System.out.print(cal.get(Calendar.YEAR) + "년 ");
		System.out.print(cal.get(Calendar.MONTH) + 1 + "월 ");
		System.out.print(cal.get(Calendar.DAY_OF_MONTH) + "일 ");
		System.out.print(cal.get(Calendar.DAY_OF_WEEK) + "일차 ");
		System.out.print(cal.get(Calendar.HOUR_OF_DAY) + "시 ");
		System.out.print(cal.get(Calendar.MINUTE) + "분 ");
		System.out.print(cal.get(Calendar.SECOND) + "초 ");
		
	
		
	}	
}
