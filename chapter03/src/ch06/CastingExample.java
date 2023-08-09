package ch06;

public class CastingExample {

	public static void main(String[] args) {
		
		// 다형성, 업캐스팅(Upcasting)
		// 업캐스팅은 하위 클래스의 객체를 상위 클래스 타입으로
		// 변환 하는 것을 말합니다 이 경우에는 데이터 손실이 없습니다 
		// 업캐스팅은 자동적으로 이루어지므로 별도의 형변환 연산자가
		// 필요없습니다.
		
		Animal animal = new Bird();   // 업캐스팅 
		//animal.fly();
		// 다운 캐스팅이란 
		// 다운 캐스팅이란 업캐스팅된 객체를 다시 원래의 하위
		// 클래스 타입으로 변환하는 것을 말합니다. 다운캐스팅은
		// 수동적으로 형변환 연산자를 사용하여 이루어집니다.
		// 업캐스팅된 객체를 하위 클래스에 메서드나 속성을 사용하기 위해
		// 필요합니다.
	    Bird bird = (Bird)animal;
		bird.fly();
	    
		//배열을 활용
		Animal[] animals = new Animal[3];
		animals[0] = new Animal();
		animals[1] = new Bird();
		animals[2] = new Animal();
		
		System.out.println("=====================");
		// 0 -- Animal --> if --> false
		// 1 -- Bird --> if --> True
		// 2 -- Animal --> if --> false
		for (Animal a : animals) {
			a.makeSound();
			//a.fly(); 데이터 타입을 확인하고 싶다면 : instanceof 연산자
			if(a instanceof Bird) {
				Bird targetbird = (Bird)a;
				targetbird.fly();
				
			}
			System.out.println("------------------");
		}
//		for (int i = 0; i < animals.length; i++) {
			
//		}

	}//end of main

}//end of class
