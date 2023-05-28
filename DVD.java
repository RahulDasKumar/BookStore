import java.util.Scanner;

public class DVD extends Items implements Transaction{
    String director;
    String genre;
	double length;
	static int amountOfDVDs = 5000;
	public DVD(String name, String director, String genre, int length, int price) {
		super(price, name);
		this.director = director;
		this.genre = genre;
		this.length = length;
	}
	public DVD() {
		// TODO Auto-generated constructor stub
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	//Gets input from user, deducts from inventory, and calculates price
	@Override
	public int makeAPurchase() {
		Scanner scnr =  new Scanner(System.in);
		DVD dvd1 = new DVD ("Naruto","Director","Anime",72,24);
		DVD dvd2 = new DVD ("One Punch Man ","Saitama","Anime",100,10);
		System.out.println("Which DVD do you want to buy ?");
		System.out.println("1. "+ dvd1.getName()  + " Price : " + "$"+dvd1.getPrice());
		System.out.println("2. "+ dvd2.getName()  + " Price : " + "$"+dvd2.getPrice());
		int choiceOfDVD = scnr.nextInt();
		System.out.println("How many copies of the CD do you want to buy?");
		int numberOfDVD = scnr.nextInt();
		for(int i = 0; i<numberOfDVD ; i++) {
			amountOfDVDs -- ;
		}
		int price = 0;
		if(choiceOfDVD == 1) {
			price = numberOfDVD * dvd1.getPrice();
		}
		if(choiceOfDVD == 2) {
			price = numberOfDVD * dvd2.getPrice();
		}
		return price;
		
	}
	// Method to display static variable amountOfDVDs
	public void inventory() {
		System.out.println(amountOfDVDs + " DVDs left");
	}
	

}
