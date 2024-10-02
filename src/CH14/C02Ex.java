package CH14;

public class C02Ex {
	public static void main(String[] args) {
		Parttimer emp1 = new Parttimer("홍길동", 22, "대구", 3300);
		Reqular emp2 = new Reqular("남길동", 30, "구미", 5000);
		System.out.println(emp1);
		System.out.println(emp2);
		
	}
}

abstract class Employee {
	public String name;
	private int age;
	private String addr;
	
	abstract int payment();

	Employee(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public int getAge() {
		return age;
	} 

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}

class Parttimer extends Employee {
	private int hour_pay;
	private int time;

	@Override
	int payment() {
		
		return hour_pay * time;
	}

	public Parttimer(String name, int age, String addr, int hour_pay) {
		super(name, age, addr);
		this.hour_pay = hour_pay;
	}

	public void setHour_pay(int hourPay) {
		this.hour_pay = hourPay;
	}

	@Override
	public String toString() {
		return "Parttimer [hour_pay=" + hour_pay + " age=" + getAge() + "addr=" + getAge() + "]";
	}

}

class Reqular extends Employee {
	private int salary;
	

	@Override
	int payment() {
		return salary / 12;
	}

	public Reqular(String name, int age, String addr, int salary) {
		super(name, age, addr);
		this.salary = salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Parttimer [salary=" + salary + " age=" + getAge() + "addr=" + getAge() + "]";
	}

}