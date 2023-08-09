package ch06;

public class Bird extends Animal {
	
	@Override
	public void makeSound() {
		System.out.println("새가 지저귀고 있습니다");
	}
	
	public void fly() {
		System.out.println("새가 날아갑니다");
	}

}
