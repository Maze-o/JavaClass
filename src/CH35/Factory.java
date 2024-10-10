package CH35;

public class Factory extends Building implements ICanFly {

	AddOn addOn;

	Factory() {
		
	}
	
	void setAddOn(AddOn addOn) {
		this.addOn = addOn;
	}

	@Override
	public void move() {

	}

	@Override
	public void lend() {

	}

	@Override
	public void fly() {

	}

	@Override
	public void BuildStructure() {

	}

	@Override
	public void underAttack(Unit unit) {

	}

}
