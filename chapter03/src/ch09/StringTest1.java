package ch09;

public class StringTest1 {
	
	public static void main(String[] args) {
		
		// String 
		// 문자열이라는 데이터를 보관, 연산 사용
		// static 영역, 데이터 영역, --> 상수 풀영역 
		
		String str1 = "반가워";
		String str2 = new String("반가워");
		String str3 = "반가워";
		
	   System.out.println(str1);
	   System.out.println(str2);
	   
	   // 시나리오1
	   if(str1 == str2) {
		   System.out.println("주소값이 같아요!");
	   }else {
		   System.out.println("주소값이 달라요");
	   }
	   
	   // 시나리오2
	   // 리터럴 방식으로 생성한 문자열은
	   // 이미 생성한 값이 똑같다면 새로 만들지 않고
	   // 재활용 한다.
	   if(str1 == str3) {
		   System.out.println("주소 같음");
	   }else {
		   System.out.println("주소 다름");
	   }
		
	   System.out.println("***********************");
	   // 시나리오 3
	   str3 = "반갑습니다"; // 값을 변경
	   if (str1 == str3) {
		   System.out.println("주소 같아요~ 다시 확인 ");
	   }else {
		   System.out.println("주소 달라요! 다시 확인 ");
	   }
	   
	   System.out.println("-----------------------");
	   // 시나리오 4
	   // 문자열의 값을 비교할려면 equals 반드시 사용 
	   if(str1.equals(str2)) {
		   System.out.println("같은 값이에요");
	   }else {
		   System.out.println("다른 값이에요");
	   }
	}

}
