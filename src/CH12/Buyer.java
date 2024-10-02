package CH12;

public class Buyer {
	private int money;
	private int count;

	public void payment(Seller seller, int money) {
		this.money -= money;
		int receiveApp = seller.receive(money);
		System.out.println("구매자가 " + money + "원 지불");

		this.count += receiveApp;

	}

	public Buyer(int money, int count) {
		super();
		this.money = money;
		this.count = count;
	}

	@Override
	public String toString() {
		return "구매자의 남은 돈 : " + money + ", 사과 보유 갯수 : " + count;
	}

}
