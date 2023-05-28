
import java.util.Scanner;

/**
 * @author rahul
 *
 */
public class Books extends Items implements Transaction {
	String author;
	String genre;
    int numOfPages;
    static int amountOfBooks = 5000;
    static int books_purchased = 0;
    Books(){
    	
    }
	public Books(String name, String author, String genre,int numOfPages,int price) {
		super(price, name);
		this.author = author;
		this.genre = genre;
		this.numOfPages = numOfPages;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getNumOfPages() {
		return numOfPages;
	}
	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}
	//Gets input from user, deducts from inventory, and calculates price
	// For loops used for deducting items, and calculating price
	@Override
	public int makeAPurchase() {
		Scanner scnr =  new Scanner(System.in);
		Books book1 = new Books("Cat in the Hat","Dr.Suess", "Fiction",40,9);
		Books book2 = new Books("Lightning Theif","Percy Jackson","Non Ficiton",299,16);
		System.out.println("Which book do you want to buy ?");
		System.out.println("1. " + book1.getName() + " Price : " + "$"+book1.getPrice());
		System.out.println("2. " + book2.getName() + " Price : " + "$"+book2.getPrice());
		int choiceOfBooks = scnr.nextInt();
		System.out.println("How many copies of the book do you want to buy?");
		int numberOfBooks = scnr.nextInt();
		for(int i = 0; i<numberOfBooks; i++) {
			books_purchased ++ ;
		}
		for(int i = 0; i<numberOfBooks; i++) {
			amountOfBooks -- ;
		}
		int price = 0;
		if(choiceOfBooks == 1) {
			price = numberOfBooks * book1.getPrice();
		}
		if(choiceOfBooks == 2) {
			price = numberOfBooks * book2.getPrice();
		}
		return price;
	}
	// Method to display static variable amountOfBooks
	public void inventory() {
		System.out.println(amountOfBooks + " Books left");
	}
		
	}
	
	
    	
	

