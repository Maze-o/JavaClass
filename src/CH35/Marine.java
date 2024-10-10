package CH35;

public class Marine extends Unit {

	public int damageVal;
	private Gun myGun;

	Marine() {
		myGun = new Rifle();
	}

	public void setMyGun(Gun gun) {
		this.myGun = gun;
	}

	@Override
	public void move() {

	}

	@Override
	void underAttack(int damege) {

	}

	public void attack(Unit unit) {

	}

}
