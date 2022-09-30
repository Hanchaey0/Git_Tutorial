package ch05;
	public class _03_Book {
		
		//멤버변수
		private String bookName;  	//"태백산맥"
		private String author;		//"조정래"
		private int price;
		//디폴트 생성자
		public _03_Book() {
		}
		//매개변수 생성자
		public _03_Book(String bookName, String author, int price) {
			this.bookName = bookName;
			this.author = author;
			this.price = price;
		}
		//멤버메서드
		public  String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName=bookName;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author=author;
	}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price=price;
	}
		public void showbookInfo() {
			System.out.println("책 이름 : "+bookName+", 저자 : "+author+", 책 가격 : "+price);
		}
	}
	