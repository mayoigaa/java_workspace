package ch05;

public class Toy {
	String name;
	int price;
	
	public Toy(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("상품명 : " + name);
		System.out.println("가격 : " + price);
		
	}

}
