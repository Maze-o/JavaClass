package CH12;

public class Buy {
	private int money;
	private int count;

	public void pay(Sel sel, int money) {
		this.money = money;
		int re = sel.receive(money);
		System.out.println("구매자가 " + money + "원 지불");

		this.count += re;
	}

	public Buy(int money, int count) {
		super();
		this.money = money;
		this.count = count;
	}

	@Override
	public String toString() {
		return "Buy [money=" + money + ", count=" + count + "]";
	}

}
