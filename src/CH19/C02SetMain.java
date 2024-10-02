package CH19;

import java.util.HashSet;
import java.util.Set;

public class C02SetMain {
	public static void main(String[] args) {

		Set<String> list = new HashSet();
		list.add("HTML/CSS/JS");
		list.add("JQUERY");
		list.add("NODEJS");
		list.add("SCSS");
		list.add("REACT");
		list.add("JAVA");
		list.add("JSP/SERVLET");
		list.add("STS");
		list.add("SPRING BOOT");
		list.add("SPRING");

		System.out.println("개수 확인 : " + list.size());

		list.remove("STS");
		System.out.println("개수 확인 : " + list.size());
		
		for (String el : list) {
			System.out.println(el);
		}
		
		list.clear();
	}
}
