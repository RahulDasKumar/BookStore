import java.util.ArrayList ;
import java.util.Scanner;
public class Member {
	// Declaring global variables
	String name;
	int totalPurchased;
	static ArrayList<Member> memberList = new ArrayList<>();
    // default constructor
	Member(){

	}
	Member(String name){
		Member testmember = new Member(name);
		memberList.add(testmember);
	}
	Member(String name, int totalPurchased){
		this.name = name;
		this.totalPurchased = totalPurchased ;
	     
	}
	public int getTotalPurchased() {
		return totalPurchased;
	}
	public void setTotalPurchased(int totalPurchased) {
		this.totalPurchased = totalPurchased;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// Asks users name, adds to an array list, sets price to 0
	public ArrayList<Member> addMember (){
		Scanner scnr = new Scanner(System.in);
		System.out.println("What is your name ?");
		String name = scnr.next(); 
		Member newmember = new Member(name, 0);
		memberList.add(newmember);
		// un comment and deleted construcotr change if it doesnt work
		return memberList; 
	}
	// method to purchase for members buy asking what member they are from the list, and calculating the total price
	// by multiplying the amount times price
	public void memberPurchase() {
		Books bookObject = new Books();
		CD cdObject = new CD();
		DVD dvdObject = new DVD();
		 
		Scanner scnr = new Scanner(System.in);
		System.out.println("Which member are you ?");
		System.out.println("Pick the number next to your name");
		for(int i = 0; i< memberList.size(); i++) {
			
			System.out.println((i + 1) + " " + memberList.get(i).getName());
		}

		int memberNumber = scnr.nextInt();
		int amountOfBooks = bookObject.makeAPurchase();
		int amountOfCDs = cdObject.makeAPurchase();
		int amountOfDVDs = dvdObject.makeAPurchase();
		int totalPurchased = amountOfBooks + amountOfCDs + amountOfDVDs ;

		memberList.get(memberNumber - 1).setTotalPurchased(totalPurchased);
		
		
	}
  //  Method used for printing out members, by looping over the member arrayList
	public void printMembers() {
		System.out.println("-----------MEMBERSHIP----------------");
		for(int i = 0; i<memberList.size(); i++) {
			System.out.println("Name : " + memberList.get(i).getName() + " Total Purchased : " + memberList.get(i).totalPurchased);
		}
	}
	// Calculates price from input, and adds back to user
	// Case switch used for each items
	// Number list also implemented to allocate data to the correct member
	public void refund() {
		Scanner scnr = new Scanner(System.in);
		int answer = 0;
		Books book1 = new Books("Cat in the Hat","Dr.Suess", "Fiction",40,9);
		Books book2 = new Books("Lightning Theif","Percy Jackson","Non Ficiton",299,16);
		CD cd1 = new CD ("Thriller","Micheal Jackson","Pop",1);
		CD cd2 = new CD ("Donda ","Kanye West","Rap",6);
		DVD dvd1 = new DVD ("Naruto","Director","Anime",72,24);
		DVD dvd2 = new DVD ("One Punch Man ","Saitama","Anime",100,10);
		System.out.println("Which member are you ?");
		System.out.println("Pick the number next to your name");
		for(int i = 0; i< memberList.size(); i++) {
			
			System.out.println((i + 1) + " " + memberList.get(i).getName());
		}
		int memberNumber = scnr.nextInt();
		System.out.println("Which item do you want to refund ?");
		System.out.println("1. " + book1.getName());
		System.out.println("2. " + book2.getName());
		System.out.println("3. " + cd1.getName());
		System.out.println("4. " + cd2.getName());
		System.out.println("5. " + dvd1.getName());
		System.out.println("6. " + dvd2.getName());
		int refundNumber = scnr.nextInt();
		switch(refundNumber) {
		case 1 :
			System.out.println("How many copies of " + book1.getName() + "do you want to refund " + memberList.get(memberNumber-1).getName() );
			 answer = scnr.nextInt();
			int refund = answer * book1.getPrice();
			Books.amountOfBooks += answer ;
			int amountBought = memberList.get(memberNumber-1).getTotalPurchased();
			int newAmount = amountBought - refund ;
			memberList.get(memberNumber - 1).setTotalPurchased(newAmount);
			System.out.println("Refund Completed!");
			break ;
		case 2 :
			System.out.println("How many copies of " + book2.getName() + "do you want to refund ?");
			answer = scnr.nextInt();
			int refund2 = answer * book2.getPrice();
			Books.amountOfBooks += answer ;
			int amountBought2 = memberList.get(memberNumber-1).getTotalPurchased();
			int newAmount2 = amountBought2 - refund2 ;
			memberList.get(memberNumber - 1).setTotalPurchased(newAmount2);
			System.out.println("Refund Completed!");
			break;
		case 3 :
			System.out.println("How many copies of " + cd1.getName() + "do you want to refund ?");
			answer = scnr.nextInt();
			int refund3 = answer * cd1.getPrice();
			CD.amountOfCDs += answer;
			int amountBought3 = memberList.get(memberNumber-1).getTotalPurchased();
			int newAmount3 = amountBought3 - refund3 ;
			memberList.get(memberNumber - 1).setTotalPurchased(newAmount3);
			System.out.println("Refund Completed!");
			break;
		case 4:	
			System.out.println("How many copies of " + cd2.getName() + "do you want to refund ?");
			answer = scnr.nextInt();
			CD.amountOfCDs += answer;
			int refund4 = answer * cd2.getPrice();
			int amountBought4 = memberList.get(memberNumber-1).getTotalPurchased();
			int newAmount4 = amountBought4 - refund4 ;
			memberList.get(memberNumber - 1).setTotalPurchased(newAmount4);
			System.out.println("Refund Completed!");
			break;
		case 5:
			System.out.println("How many copies of " + dvd1.getName() + "do you want to refund ?");
			answer = scnr.nextInt();
			int refund5 = answer * dvd1.getPrice();
			DVD.amountOfDVDs += answer;
			int amountBought5 = memberList.get(memberNumber-1).getTotalPurchased();
			int newAmount5 = amountBought5 - refund5 ;
			memberList.get(memberNumber - 1).setTotalPurchased(newAmount5);
			System.out.println("Refund Completed!");
			break;
		case 6:
			System.out.println("How many copies of " + dvd2.getName() + "do you want to refund ?");
			answer = scnr.nextInt();
			int refund6 = answer * dvd2.getPrice();
			DVD.amountOfDVDs += answer ;
			int amountBought6 = memberList.get(memberNumber -1).getTotalPurchased();
			int newAmount6 = amountBought6 - refund6 ;
			memberList.get(memberNumber - 1).setTotalPurchased(newAmount6);
			System.out.println("Refund Completed!");
			break;
			default :
				 System.out.println("Sorry, but you need to enter a number between 1-6");
		}
		
	}
	
	
}

