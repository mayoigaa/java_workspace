package com.tenco.books;

import java.util.Scanner;

import com.tenco.books.Book;

/**
 * @author 박유빈 책을 관리하는 프로그램 C R U D 기능을 구현해보자.
 */
public class TencoBooks {

	public static void main(String[] args) {

		// 준비물
		Scanner sc = new Scanner(System.in);
		Book[] books = new Book[100];
		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_TITLE = "3";
		final String DELETE_ALL = "4";
		final String UPDATE = "5";
		final String END = "0";

		boolean flag = true;
		// 마지막에 저장된 인덱스 번호를 기억해 두자
		int lastIndexNumber = 0;

		// todo 샘플 데이터 추후 삭제
		books[0] = new Book("홍길동전", "허균");
		books[1] = new Book("사피엔스", "유발하라리");
		lastIndexNumber = 2;

		while (flag) {

			System.out.println("**메뉴선택**");
			System.out.println("1.저장 2.전체조회 3.선택조회 4.전체 삭제 5.수정 0.종료");
			System.out.println("-----------------------------------------------------");
			String selectedNumber = sc.nextLine();

			if (selectedNumber.equals(END)) {
				flag = false;
			} else if (selectedNumber.equals(SAVE)) {
				lastIndexNumber = save(sc, books, lastIndexNumber);

			} else if (selectedNumber.equals(SEARCH_ALL)) {
				searchAll(books);

			} else if (selectedNumber.equals(SEARCH_TITLE)) {
				searchTitle(sc, books);
				
			} else if (selectedNumber.equals(DELETE_ALL)) {
				deleteAll(books);
				
			} else if (selectedNumber.equals(UPDATE)) {
				update(sc, books);
			} else {
				System.out.println("잘못 입력하였습니다. 다시 선택해주세요 ");
			}

		} // end of while
		System.out.println("프로그램이 종료되었습니다");
	}// end of main

	// 저장하는 기능 static 메서드로 만들어 보기
	public static int save(Scanner scanner, Book[] books, int index) {
		System.out.println(">>저장하기<<");
		System.out.println("책 제목을 입력하세요");
		String bookTitle = scanner.nextLine();
		System.out.println("저자 이름을 입력하세요");
		String bookAuthor = scanner.nextLine();
		Book book = new Book(bookTitle, bookAuthor);
		books[index] = book;
		index++;
		System.out.println(bookTitle + " 책을 생성했습니다");
		return index;
	}// end of save

	public static void searchAll(Book[] books) {
		System.out.println(">>전체 조회하기<<");
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				books[i].showInfo();
				System.out.println("---------------");

			} // end of if
		} // end of for
	}// end of searchAll

	// 선택 조회 - 책 제목으로 검색하기
	public static void searchTitle(Scanner scanner, Book[] books) {
		System.out.println(">>선택조회<<");
		String bookTitle = scanner.nextLine();
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) { // 방어적 코드 작성
				// "홍길동전".equals("사용자가 입력한 값")
				if (books[i].getTitle().equals(bookTitle)) {
					// 같은 책 제목이 존재한다 <-- true
					books[i].showInfo();
					break; // 여기서는 선택조회라 데이터를 찾았다면 굳이 모든 반복문을 동작시킬 필요가 없다 
				}//end of if 
			}//end of if

		}// end of for
	}//end of searchTitle
	
	public static void deleteAll(Book[] books) {
		System.out.println(">>전체 삭제<<");
		 for(int i = 0; i < books.length; i++) {
			 if(books[i] != null) {
				books[i] = null;
			 }
		 }
		 System.out.println("초기화되었습니다");	 
	}
	
	public static void update(Scanner scanner, Book[] books) {
		System.out.println(">>수정<<");
		System.out.println("수정할 책 제목을 입력해주세요");
		String bookTitle = scanner.nextLine();
		
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) { // 방어적 코드 작성
				// "홍길동전".equals("사용자가 입력한 값")
					System.out.println("다시 입력해주세요");	
		             return;		
			}
			if (books[i].getTitle().equals(bookTitle)) {
				// 같은 책 제목이 존재한다 -> 수정
				String title = scanner.nextLine();
				
				System.out.println(bookTitle + " 책을 생성했습니다");
                 
			}
//				String bookAuthor = scanner.nextLine();
//				if (books[i].getAuthor().equals(bookAuthor)) {

//					System.out.println("작가 이름을 수정하세요");
//					

		} // end of if

	} // end of for

}// end of class
