package ch03;

    public class Hero {
	String name;
	int hp;
	
	public Hero(String name, int hp) {
		this.hp = hp;
		this.name = name;
	}
	
	protected void attack() {
		System.out.println("기본 공격을 합니다");
	}

}
