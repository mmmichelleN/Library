package libraryPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {

	@Test 
	void test0() {
		Book newBook = new Book();
		
		assertEquals("", newBook.getTitle());
		assertEquals("", newBook.getAuthor());
		assertEquals("", newBook.getIBSN());
		assertEquals(0, newBook.getYearPublished());
		assertEquals(false, newBook.getTranslated());
	}
	
	@Test
	void test1() {
		Book newBook = new Book(); //create a new Book object
		newBook.setTitle("Gideon the Ninth"); //set the book title
		newBook.setAuthor("Tamsyn Muir"); //set the author
		newBook.setIBSN("9781250313188");
		newBook.setYearPublished(2019);
		newBook.setTranslated(false);
		
		assertEquals("Gideon the Ninth", newBook.getTitle());
		assertEquals("Tamsyn Muir", newBook.getAuthor());
		assertEquals("9781250313188",newBook.getIBSN());
		assertEquals(2019, newBook.getYearPublished());
		assertEquals(false, newBook.getTranslated());
	}
	
	@Test
	void test2() {
		Book newBook = new Book(); //create a new Book object
		newBook.setTitle("Gideon the Ninth"); //set the book title
		newBook.setAuthor("Tamsyn Muir"); //set the author
		newBook.setIBSN("9781250313188");
		newBook.setYearPublished(2019);
		newBook.setTranslated(false);
		
		assertEquals("Gideon the Ninth", newBook.getTitle());
		assertEquals("Tamsyn Muir", newBook.getAuthor());
		assertEquals("9781250313188", newBook.getIBSN());
		assertEquals(2019, newBook.getYearPublished());
		assertEquals(false, newBook.getTranslated());
		
		Book newBook1 = new Book(); //create another book instance
		newBook1.setTitle("Harrow the Ninth"); 
		newBook1.setAuthor("Tamsyn Muir");
		newBook1.setIBSN("9781250313218");
		newBook1.setYearPublished(2020);
		newBook1.setTranslated(false);
		
		assertEquals("Harrow the Ninth", newBook1.getTitle());
		assertEquals("Tamsyn Muir", newBook1.getAuthor());
		assertEquals("9781250313218", newBook1.getIBSN());
		assertEquals(2020, newBook1.getYearPublished());
		assertEquals(false, newBook1.getTranslated());
	}
	
	@Test
	void test3() {
		//set regular book in one method
		Book newBook = new Book("Gideon the Ninth", "Tamsyn Muir", "9781250313188", 2019, false);
		
		assertEquals("Title: Gideon the Ninth, Author: Tamsyn Muir, Year Published: 2019, IBSN: 9781250313188, Translated: false", newBook.bookToString(newBook));
	}
	
	@Test
	void test4() {
		TranslatedBook newBook = new TranslatedBook("The Odyssey", "Homer", 2016, "9780198736479", true, "Anthony Verity");
		
		assertEquals("The Odyssey", newBook.getTitle());
		assertEquals("Homer", newBook.getAuthor());
		assertEquals(2016, newBook.getYearPublished());
		assertEquals("9780198736479", newBook.getIBSN());
		assertEquals(true, newBook.getTranslated());
		assertEquals("Anthony Verity", newBook.getTranslator());
		assertEquals("Title: The Odyssey, Author: Homer, Year Published: 2016, IBSN: 9780198736479, Translated: true, Translator: Anthony Verity", newBook.bookToString(newBook));
	}
	
	@Test
	void test5() {
		TranslatedBook newBook = new TranslatedBook("The Odyssey", "Homer", 2016, "9780198736479", true, "Anthony Verity");
		
		assertEquals("The Odyssey", newBook.getTitle());
		assertEquals("Homer", newBook.getAuthor());
		assertEquals(2016, newBook.getYearPublished());
		assertEquals("9780198736479", newBook.getIBSN());
		assertEquals(true, newBook.getTranslated());
		assertEquals("Anthony Verity", newBook.getTranslator());	
		assertEquals("Title: The Odyssey, Author: Homer, Year Published: 2016, IBSN: 9780198736479, Translated: true, Translator: Anthony Verity", newBook.bookToString(newBook));		
	
		newBook.setTitle("Roman Lives");
		newBook.setAuthor("Plutarch");
		
	
	}

	@Test
	void test6() {
		Book newBook = new Book(); //create a new Book object
		newBook.setTitle("Gideon the Ninth"); //set the book title
		newBook.setAuthor("Tamsyn Muir"); //set the author
		newBook.setIBSN("9781250313188");
		newBook.setYearPublished(2019);
		newBook.setTranslated(false);
		
		assertEquals("Gideon the Ninth", newBook.getTitle());
		assertEquals("Tamsyn Muir", newBook.getAuthor());
		assertEquals("9781250313188", newBook.getIBSN());
		assertEquals(2019, newBook.getYearPublished());
		assertEquals(false, newBook.getTranslated());
		
		Book newBook1 = new Book(); //create another book instance
		newBook1.setTitle("Harrow the Ninth"); 
		newBook1.setAuthor("Tamsyn Muir");
		newBook1.setIBSN("9781250313218");
		newBook1.setYearPublished(2020);
		newBook1.setTranslated(false);
		
		assertEquals("Harrow the Ninth", newBook1.getTitle());
		assertEquals("Tamsyn Muir", newBook1.getAuthor());
		assertEquals("9781250313218", newBook1.getIBSN());
		assertEquals(2020, newBook1.getYearPublished());
		assertEquals(false, newBook1.getTranslated());
		
		BookCollection newBookCollection = new BookCollection(); //make a new collection of books 
		
		newBookCollection.addBook(newBook); //add Gideon the Ninth to collection
		newBookCollection.addBook(newBook1); //add Harrow the Ninth to collection
		
		assertEquals("Gideon the Ninth, Harrow the Ninth", newBookCollection.getBookCollection());
	}

}
