package exam1020;

public class BookExample {
	public static void main(String[] args) {
		Book[] books = new Book[3];
		books[0] = new Book("자바", "김자바", "123-456-789");
		books[1] = new Book("책제목1", "책저자1", "012-345-678", 20000);
		books[2] = new Book("책제목2", "책저자2", "987-654-321");
	
	
		for(int i = 0; i < books.length; i++) {
			System.out.println(books[i].getTitle());
		}
		
		/*
		//for each
		
		for(Book book : books) {
			System.out.println(book.getTitle());
		}
		*/
	}
}