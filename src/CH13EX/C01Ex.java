package CH13EX;


//[1번] 다음 main() 메소드와 실행 결과를 참고하여 TV를 상속받은 ColorTV 클래스를 작성하라.

//출력 결과
//32인치 1024컬러
class TV{
	int inch;
	
	TV(int inch) {
		super();
		this.inch = inch;
	}
	
}

class ColorTV extends TV{
	int color;
	
	ColorTV(int inch, int color) {
		super(inch);
		this.color = color;
	}
	

	void printProperty(){
		System.out.println(inch + "인치 " + color + "컬러");
	}


	


}
public class C01Ex {
	
	public static void main(String[] args) {
		   ColorTV myTV = new ColorTV(32, 1024);
		   myTV.printProperty(); // 32인치 1024컬러 가 나오면 해결!
	}
	
}

