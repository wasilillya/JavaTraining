package bookpackext;

import bookpack.Book;

class ExtBook extends Book{
	private String publicher;

	public ExtBook(String t, String a, int d, String p) {
		super(t, a, d);
		publicher=p;
	}
	
	public void show(){
		super.show();
		System.out.println(publicher);
		System.out.println();
	}
	
	public void setPublicher(String publicher) {
		this.publicher = publicher;
	}
	
	public String getPublicher() {
		return publicher;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String t){
		title=t;
	}
	
	public  String getAuthor(){
		return author;
	}
	
	public void setAuthor(String a){
		author=a;
	}
	
	public int getPubDate(){
		return datePub;
	}
	
	public void setPubDate(int d){
		datePub=d;
	}
}


class BookDemo extends Book {
	

	public BookDemo(String t, String a, int d) {
		super(t, a, d);
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]){
		ExtBook books[]=new ExtBook[5];
		books[0]=new ExtBook("Java: A Beginner's Guide", 
                "Schildt", 2011,"fff");
		books[1]=new ExtBook("Java: The Complete Reference", 
                "Schildt", 2011,"dddd");
		books[2]=new ExtBook("The Art of Java", 
                "Schildt and Holmes", 2003,"dfsdfsf");
		books[3] = new ExtBook("Red Storm Rising", 
                 "Clancy", 1986,"qqqq");  
		books[4] = new ExtBook("On the Road", 
                "Kerouac", 1955,"rrrrr");
		for(int i=0;i<books.length;i++)books[i].show();
		
		System.out.println("Showing all books by Shildt");
		for(int i=0;i<books.length;i++){
			if(books[i].getAuthor()=="Schildt")
				System.out.println(books[i].getTitle());
		}
		
	}
}