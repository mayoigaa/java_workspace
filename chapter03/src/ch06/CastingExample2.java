package ch06;

public class CastingExample2 {

	public static void main(String[] args) {
		
	
	    
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
