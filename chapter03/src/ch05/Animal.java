package ch05;

public class Animal {

	public void move() {
		System.out.println("동물이 움직입니다.");
	}

	public void eating() {
		System.out.println("동물이 먹이를 먹습니다.");
	}
	
}//end of Animal class

class Tiger extends Animal {
	
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 움직입니다");
	}
	@Override
	public void eating() {
	    System.out.println("호랑이가 사냥을 합니다");
	}
}

class Human  {
	
	public void move() {
		System.out.println("사람이 두 발로 걸어 다닙니다");
	}
	
	public void eating() {
		System.out.println("밥을 먹습니다 ");
	}
	private void readBooks() {
		System.out.println("사람이 책을 읽습니다");

	}
	
}