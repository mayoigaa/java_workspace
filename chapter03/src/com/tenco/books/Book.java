package com.tenco.books;

public class Book {
	
	private String title;
	private String author;
	private int totalPage;
	
	public Book(String title, String author) {
	
		this.title = title;
		this.author = author;
	}
	
	public Book(String title, String author, int totalPage) {
		this(title, author);
		this.totalPage = totalPage;
		
	}  // 생성자 오버로딩 
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
	
  public void showInfo() {
	  System.out.println(">>>책정보<<<");
	  System.out.println("제목: " + this.title);
	  System.out.println("작가: " + this.author);
	  
	 
	  
  }

}
