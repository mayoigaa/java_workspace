package ch08;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	
	//핵심 ! 템플릿 메서드 패턴 
	//final 키워드 활용해서 재정의 할 수 없도록 설계
	//실행의 흐름을 미리 만들어 준다 
     final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}

}
