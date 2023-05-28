
import java.util.Scanner;

public class Shop {

	public static void main(String [] args) {
		Books book = new Books();
		CD cds = new CD();
		DVD dvds = new DVD();
		Member member = new Member();
		PremiumMember premiumMember = new PremiumMember();
		Scanner scnr = new Scanner(System.in);
		int proceed;
		do {
			System.out.println("Welcome to the shop");
			System.out.println("Please select one of the actions");
			System.out.println("1. Become a member");
			System.out.println("2. Purchase an item");
			System.out.println("3. Refund an Item");
			System.out.println("YOU HAVE TO BE A MEMBER BEFORE YOU PURCHASE ANYTHING");
			
			int customerAnswer = scnr.nextInt();
			int typeOfMember = 0;
			if(customerAnswer == 1) {
				// Add logic to add members
				System.out.println("Do you want to be a 1. Premuim Member or a 2. Regular Member ?");
				typeOfMember = scnr.nextInt();
				if(typeOfMember == 1) {
					premiumMember.addMember();
				}
				if(typeOfMember == 2) {
				    member.addMember();
				}
			}
			if(customerAnswer == 2) {
				System.out.println("Which type of member are you?");
				System.out.println("1.Premium Member");
				System.out.println("2.Regular Member");
				int typeOfMember2 = scnr.nextInt();
				if(typeOfMember2 == 1) {
					premiumMember.memberPurchase();
				}
				else {
					member.memberPurchase();
				}
			}
			if(customerAnswer == 3) {
				member.refund();
			}
			System.out.println("Would you like to do any of the following?");
			System.out.println("Refund, purchase and item, or make a new member ?");
			System.out.println("1. Yes or 2. No");
			proceed = scnr.nextInt();
		}while(proceed == 1);
      //*************************************PRINTS OUT ALL MEMBERS INFO ******************************************
		premiumMember.printMembers();
      // ************************************PRINTS OUT INVENTORY DATA ********************************************
		System.out.println("---------------INVENTORY----------------");
		book.inventory();
		cds.inventory();
		dvds.inventory();
	  //***********************************************************************************************************
	}
}
