import java.util.Scanner;

public class CD extends Items implements Transaction{
	
	String artist;
	String genre;
	static int amountOfCDs = 5000;
    
	// Default Constructor
	CD(){
    	
    }
	public CD(String name,String artist, String genre, int price) {
		super(price, name);
		this.artist = artist;
		this.genre = genre;
		// TODO Auto-generated constructor stub
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	//Gets input from user, deducts from inventory, and calculates price
	@Override
	public int makeAPurchase() {
		// TODO Auto-generated method stub
		Scanner scnr =  new Scanner(System.in);
		CD cd1 = new CD ("Thriller","Micheal Jackson","Pop",1);
		CD cd2 = new CD ("Donda ","Kanye West","Rap",6);
		System.out.println("Which CD do you want to buy ?");
		System.out.println("1. " + cd1.getName() + " Price : " + "$"+cd1.getPrice());
		System.out.println("2. " + cd2.getName() + " Price : " + "$"+cd2.getPrice());
		int choiceOfCD = scnr.nextInt();
		System.out.println("How many copies of the CD do you want to buy?");
		int numberOfCD = scnr.nextInt();
		for(int i = 0; i<numberOfCD ; i++) {
			amountOfCDs -- ;
		}
		int price = 0;
		if(choiceOfCD == 1) {
			price = numberOfCD * cd1.getPrice();
		}
		if(choiceOfCD == 2) {
			price = numberOfCD * cd2.getPrice();
		}
		return price;
	}
	// Method to display static variable amountOfCDs
    public void inventory() {
    	System.out.println(amountOfCDs + " CDs left");
    	
    }
}
