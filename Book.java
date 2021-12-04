package mac_JavaProjects;

public class Book {

	
		private String title;
		private String author;
		private int pages;
		private String language;
		
	
	

		public Book(String title, String author, int pages, String language) {  //creating the constructor, constructors get invoked at object creation
			this.title = title;
			this.author = author;
			this.pages = pages;
			this.language = language;
			
			
		}
		public String getTitle() {
			return title;
		}
		public String getAuthor() {
			return author;
		}
		public int getPages() {
			return pages;
			
		}
		public String getLanguage() {
			return language;
		}
        public String toString() {  //toString is a built in method
        	return ("\n Title of the book: "+ getTitle()+"\n Author's name: "+ getAuthor()+" \n # of pages: "+getPages()+"\n Language: "+ getLanguage());

	   
	
	
}
	}

	


