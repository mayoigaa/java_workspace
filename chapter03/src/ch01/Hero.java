package ch01;

public class Hero {
	
	String name;
	int power;
	int hp;
	
	public static void main(String[] args) {
		Warrior warrior1 = new Warrior();
		warrior1.hp = 100;
		System.out.println(warrior1.hp);
	}

}

class Warrior extends Hero {
	
}
