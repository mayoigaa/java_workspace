package ch02;

public class MainTest1 {

	public static void main(String[] args) {
		//default - 같은 패키지 내에서 접근 가능 
		Cal2 cal2 = new Cal2();
		cal2.sum(10, 20); // sum 메서드는 부모
		cal2.minus(20, 10); //this 자신에게 있는 메서드 
		
		//?? Cal이라는 부모  객체는 생성이 된걸까??
		//부모 클래스가 메모리에 먼저 생성이 되고 
		//자식 클래스가 메모리에 올라오게 된다.
		
		//multiply 메서드 재정의 (오버라이드)
		cal2.multiply(10, 0);
		
		// 메서드 오버 로딩은 sysout이다.
         System.out.println("안녕");     
         System.out.println('a');     
         System.out.println(100);     
         System.out.println(0.5);     
         System.out.println(true);     
		
	}//end of main

}//end of class
