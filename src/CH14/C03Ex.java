package CH14;

abstract class Shape{
	 abstract void 넓이();
}
class Rectangle extends Shape{
	int width;
	int height;
	
	void 넓이() {
		System.out.println("구의 넓이" + this.width * this.height);
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

}
class Triangle extends Shape{
	int height;
	int bottomLine;
	
	void 넓이() {
		System.out.println("삼각형의 넓이 : " + this.height * this.bottomLine);
	}
	
	public Triangle(int height, int bottomLine) {
		this.height = height;
		this.bottomLine = bottomLine;
	}
	
	
}
class Circle extends Shape{
	int radius;
	static final double PI=3.14;
	
	void 넓이() {
		System.out.println("원의 넓이 : " + this.radius * (float) PI);
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	


}
public class C03Ex {
	public static void 전체넓이확인(Shape shape) 
	{
		//넓이 출력
		shape.넓이();
	}
	
	public static void main(String[] args) {
		전체넓이확인(new Rectangle(45,45));
		전체넓이확인(new Triangle(100,20));
		전체넓이확인(new Circle(5));
	}
}

class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int n = board.length;
        int count = 0;
        
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};
        
        for (int i = 0; i < 3; i++ ) {
            int h_check = h + dh[i];
            int w_check = w + dw[i];
         	if (h_check < n && w_check < n) {
                if (board[h][w] == board[h_check][w_check]) {
                	count++;
                    return count;
                }
				
            } else if (h_check == 0 && w_check == 0 ) {
                return 0;
            }
         }
        
        
        return answer;
    }
}
