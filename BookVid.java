package mac_JavaProjects;

public class BookVid {

	public static void main(String[] args) {
		Book book1 = new Book("Harry Potter","JK Rowling",500,"English");  //each object like book1 or book 2 is basically its own book
		  
		//reduced my code from 8 lines to 2
	
		
		Book book2 = new Book("Immune", "Philipp Dettmer",350,"English");
		System.out.println(book1.getTitle());

System.out.println(book1);	
System.out.println(book2);

				

	}

}
