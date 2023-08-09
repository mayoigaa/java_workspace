package ch03;

public class Warrior extends Hero {
	
	public Warrior(String name, int hp) {
		super(name, hp);
		
	}

	public void comboAttack() {
		System.out.println("2단 공격을 합니다");
	}
	
    @Override
    protected void attack() {
    	System.out.println(name + "가 기본공격을 합니다");
    }

}
