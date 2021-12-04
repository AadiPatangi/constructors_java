package mac_JavaProjects;

public class bookvid {

	public static void main(String[] args) {
		book book1 = new book("Harry Potter","JK Rowling",500,"English");  //each object like book1 or book 2 is basically its own book
		  
		//reduced my code from 8 lines to 2
	
		
		book book2 = new book("Immune", "Philipp Dettmer",350,"English");
		
		System.out.println(book1.title);
		System.out.println(book2.title);		
				

	}

}
