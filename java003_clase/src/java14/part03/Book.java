package java14.part03;

/*
 *  -title:String
 *  -author:String
 *  -page:int
 *  
 *  +Book()
 *  +Book(title:String, author:String, page:int)
 *  +setter & getter
 *  +toString():String
 */
public class Book{
	private String title;
	private String author;
	private int page;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Book(String title, String author, int page) {
		super();
		this.title = title;
		this.author = author;
		this.page = page;
	}


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
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	@Override
	public String toString() {
		return String.format("%s 의  %s는  %d 페이지로 구성", title,author,page);
	}
	
}







