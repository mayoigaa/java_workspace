package ch07;

// 추상 메서드를 상속 받았다면
//해결 방법
//1. 자식 클래스도 추상 클래스로 만들어 주면 된다
//2. 
public class Human extends Animal{

	@Override
	public void hunt() {
		System.out.println("돌 도끼로 사냥을 합니다");
		
	}
	

}
