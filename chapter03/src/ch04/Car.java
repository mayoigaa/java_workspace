package ch04;

/**
 * 자동차와 엔진의 관계에 있어서 절대 상속을 사용하지 말자 차와 엔진의 관계는 포함 관계로 설계해주어야 한다.
 * 
 */
public class Car {

	private String name;
	private int price;
	// 포함 관계
	private Engine engine;

	public Car(String name, int price, Engine engine) {
		this.name = name;
		this.price = price;
		this.engine = engine;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public Engine getEngine() {
		return engine;
	}

}
