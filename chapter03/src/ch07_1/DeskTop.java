package ch07_1;

public class DeskTop extends Computer{

	// 구현 메서드 오버라이드 
	@Override
	public void display() {
	    System.out.println("모니터에 화면을 출력합니다");
		
	}

	@Override
	public void typing() {
		System.out.println("타이핑을 합니다");
		
	}
	

}
