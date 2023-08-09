package ch05;

import starcraft.Marine;
import starcraft.Unit;
import starcraft.Zealot;
import starcraft.Zergling;

public class MainTest2 {
	
	public static void main(String[] args) {
		//Unit이라는 배열에 저글링,질럿,마린을 담아보세요
		//실행도 시켜 봅시다.

		Unit[] arrayStarcraft = new Unit[3];
		
		arrayStarcraft[0] = new Zealot("1");
		arrayStarcraft[1] = new Marine("2");
		arrayStarcraft[2] = new Zergling("3");
		
		Zealot zealot1 = new Zealot("1");
		Marine marine1 = new Marine("2");
		Zergling zergling1 = new Zergling("3");
		zealot1.attack(marine1);
		marine1.attack(zergling1);
		
		
		
		
		
	}

}
