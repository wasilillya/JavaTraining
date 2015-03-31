package bookpack;

 public class Book {
	protected String title;
	protected String author;
	protected int datePub;
	
	public Book(String t,String a,int d) {
		title=t;
		author=a;
		datePub=d;
	}
	
	public void show(){
		System.out.println(title);
		System.out.println(author);
		System.out.println(datePub);
		//System.out.println();
	}
	
}
