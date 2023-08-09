package starcraft;

public class Unit {

	protected String name;
	protected int power;
	protected int hp;

	public Unit(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void beAttacked(int power) {
		if (hp <= 0) {
			System.out.println(name + "이 이미 사망하였습니다");
			return;
		}
		hp -= power;
	}
	

	
	public void attack(Unit unit) {
		unit.beAttacked(power);
		System.out.println(name + "가 " + unit.getName() + "을 공격합니다");
	}
	
	

	public void showInfo() {
		System.out.println("=== 상태창 ===");
		System.out.println("이름 : " + name);
		System.out.println("공격력 : " + power);
		System.out.println("체력 : " + hp);

	}

}
