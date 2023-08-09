package ch03;

public class Archer extends Hero{

	public Archer(String name, int hp) {
		super(name, hp);
		
	}

	public void fireArrow() {
		System.out.println("불화살 공격을 합니다");
		

	}
	
	@Override
	protected void attack() {
		System.out.println(name + "가 기본 공격을 합니다 ");
	}
}
