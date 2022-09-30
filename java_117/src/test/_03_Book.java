package test;
public class _03_Book{
	private String bookName;
	private String author; 
	private int price;

	public _03_Book(){}
	public _03_Book(String bookName, String author, int price){
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}

	public void setBookName(String BookName){
		this.bookName=bookName;
	}
	public String getBookName(){
		return bookName;
	}
	public void setAuthor(String author){
		this.author=author;
	}
	public String getAuthor(){
		return author;
	}
	public void setPrice(int price){
		this.price=price;
	}
	public int getPrice(){
		return price;
	}
	public void showBookInfo(){
		System.out.println("책 이름 : "+bookName + ", 책 저자 : " +author+", 책 가격: "+price);
	}
}
