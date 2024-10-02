package CH12;

public class Sel {
	private int price;
	private int count;
	private int money;
	
	public int receive(int money) {
		this.money += money;
		int cnt = money / price;
		this.count -= cnt;
		return cnt;
		
	}

	public Sel(int price, int count, int money) {
		super();
		this.price = price;
		this.count = count;
		this.money = money;
	}

	@Override
	public String toString() {
		return "Sel [price=" + price + ", count=" + count + ", money=" + money + "]";
	}
	
	

}
