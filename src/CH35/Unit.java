package CH35;

public abstract class Unit {
	int hp;
	int armor;
	String type;

	abstract public void move();
	abstract void underAttack(int damege);

}
