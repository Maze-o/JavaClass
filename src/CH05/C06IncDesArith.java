package CH05;

import java.util.*;
public class C06IncDesArith {

	public static void main(String[] args) throws Exception {
		int a=5, b=6, c=10, d;
		boolean e;
		d=++a*b--;
		 System.out.printf("a = %d, b = %d, d = %d\n", a, b, d); // a=6 b=5 d= 36
		 	
		d=a++ + ++c - b--;  
		System.out.printf("a = %d, b = %d, c = %d, d = %d\n", a, b, c, d); // a=7 b=4 c=11 d=12
		
		a=1;
		b=0; 
			
		e=(a++>0)||((b*d/c)>0);
		System.out.printf("a = %d, b = %d, c = %d, d = %d ,e = %b\n", a, b, c, d , e); //a=2 b=0 d=12 c= 11 true 
		

	}
}
