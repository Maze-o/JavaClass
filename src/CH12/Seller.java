package CH12;

public class Seller {
	private int money;
	private int count;
	private int price;

	public int receive(int money) {
		this.money += money;

		int returnCount = money / price;
		this.count -= returnCount;

		return returnCount;
	}

	public Seller(int money, int count, int price) {
		super();
		this.money = money;
		this.count = count;
		this.price = price;
	}

	@Override
	public String toString() {
		return "판매자의 보유 돈 : " + money + ", 남은 사과 개수 : " + count + ", 사과의 가격 : " + price;
	}

}
