package libraryPackage;
import java.util.*;

public class Book {

	public String title;
	public String author;
	public String IBSN;
	public int yearPublished;
	public boolean translated;
	
	//constructors
	public Book()
	{
		this.title = "";
		this.author = "";
		this.IBSN = "";
		this.yearPublished = 0;
		this.translated = false;
	}

	public Book (String title, String author, String IBSN, int yearPublished, boolean translated)
	{
		this.title = title;
		this.author = author;
		this.IBSN = IBSN;
		this.yearPublished = yearPublished;
		this.translated = translated;
	}
	
	//getter methods
	public String getTitle()
	{
		return title;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public String getIBSN()
	{
		return IBSN;
	}
	
	public int getYearPublished()
	{
		return yearPublished;
	}
	
	public boolean getTranslated()
	{
		return translated;		
	}
	
	//setter methods	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public void setIBSN (String IBSN)
	{
		this.IBSN = IBSN;
	}
	
	public void setYearPublished(int yearPublished)
	{
		this.yearPublished = yearPublished;
	}
	
	public void setTranslated(boolean translated)
	{
		this.translated = translated;
	}
	
	//return values of the book
	public String bookToString(Book book)
	{
		//format info of the book
		String bookInfo = String.format("Title: %s, Author: %s, Year Published: %d, IBSN: %s, Translated: %b", title, author, yearPublished, IBSN, translated); 
		return bookInfo;
	}

}

class TranslatedBook extends Book 
{
	public String translator;

	//constructor
	public TranslatedBook(String title, String author, int yearPublished, String IBSN, boolean translated, String translator)
	{
		this.title = title;
		this.author = author;
		this.yearPublished = yearPublished;
		this.IBSN = IBSN;
		this.translated = translated;
		this.translator = translator;
	}
	
	//get the translator of book
	public String getTranslator()
	{
		return translator;
	}
	
	public String bookToString(TranslatedBook translatedBook)
	{
		String bookInfo = String.format("Title: %s, Author: %s, Year Published: %d, IBSN: %s, Translated: %b, Translator: %s", title, author, yearPublished, IBSN, translated, translator);
		return bookInfo;
	}
}

//a collection of books that someone has
class BookCollection
{
	public ArrayList<Book> bookCollection;
	
	//make a new collection of books
	public BookCollection()
	{
		this.bookCollection = new ArrayList<Book>();
	}
	
	//add all of the info of a book into the collection
	public void addBook(Book book)
	{
		this.bookCollection.add(book);
	}

	public int numBooks()
	{
		return bookCollection.size();
	}
	
	//list the titles of all books in collection
	public String getBookTitles()
	{
		String bookTitles = "";
		
		//iterate through the set of books
		for (int i = 0; i < bookCollection.size(); i++)
		{
			if (i == 0)
			{
				bookTitles = bookCollection.get(i).getTitle();
			}
			
			else
			{	
				bookTitles = bookTitles + ", " + bookCollection.get(i).getTitle();		
			}
		}
			
		return bookTitles;
	}
	
}
