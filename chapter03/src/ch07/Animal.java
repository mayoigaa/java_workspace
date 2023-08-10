package ch07;

//추상 클래스란
//1. abstract 키워드를 포함하면 추상 클래스가 된다
//2.하나 이상의 추상 메서드를 포함하면 반드시 추상 클래스가 되어야 한다 
// 추상 클래스와 강제성 
public abstract class Animal {
	
      public void move() {
    	  System.out.println("동물이 움직입니다");
      }
      
      //추상 메서드란!!
      public abstract void hunt();
      
      
}
