package test;

public class _17_book {

		//멤버변수
		private int bookId;
		private String bookName;
		private String author;

		//생성자
		public _17_book(){}
		public _17_book(int bookId, String bookName, String author ){
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		}
		//멤버메서트
		public int getBookId(){
		return bookId;
		}
		public void setBookId(int bookId){
		this.bookId = bookId;
		}
		public String getBookName(){
		return bookName;
		}
		public void setBookName(String bookName){
		this.bookName = bookName;
		}
		public String getAuthor(){
		return author;
		}
		public void setAuthor(String author){
		this.author= author;
		}


		@Override
		public String toString(){
		return "id : "+bookId +", bookName : "+bookName+", author : "+author;
		}

}
