import java.util.ArrayList;
import java.util.Scanner;

public class PremiumMember extends Member {
	//Declaring variables
	int monthlyFee;
	 static ArrayList<PremiumMember> premiumMemberList = new ArrayList<>();
	ArrayList<String> paymentMethodList = new ArrayList<>();
	String paymentMethod ;
    String paymentStatus;
   // Creating constructors
	PremiumMember(){

	}
	PremiumMember(String name, int totalPurchased, String payment, String paymentStatus) {
		super(name, totalPurchased);
		this.paymentMethod = payment ;
		this.paymentStatus = paymentStatus ;
		
	}
	// Creating getters and setters
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
   // Takes output, but adds to premiumMember list as well as the regular member list.
	public ArrayList<Member> addMember (){
		Scanner scnr = new Scanner(System.in);
			System.out.println("What is your name? ");
			String fullName = scnr.next();
			PremiumMember newPremuimMember = new PremiumMember(fullName,0, "none","no");	
		    memberList.add(newPremuimMember);
			premiumMemberList.add(newPremuimMember);
			return memberList ;
		
	}
  // Adds on to the method, buy asking for payment method for subscription services.
  // And asks for number to allocate data to the correct member.	
	@Override
	public void memberPurchase() {
		Scanner scnr = new Scanner(System.in);
		super.memberPurchase();
		System.out.println("Pick your number from the Premium Member List");
		System.out.println("You'll be selecting your payment method!");
		for(int i = 0; i< premiumMemberList.size(); i++) {
			System.out.println((i+1) + " " + premiumMemberList.get(i).getName());
		}
		int premuimMemberNumber = scnr.nextInt();
		premiumMemberList.get(premuimMemberNumber - 1).setTotalPurchased(totalPurchased);
		System.out.println("What will be your payment method for the monthly fee ?");
		String payment = scnr.next();
		System.out.println("Would you like to pay your monthly fee now?");
		System.out.println("Type Yes or No");
		String status = scnr.next();
		premiumMemberList.get(premuimMemberNumber - 1).setPaymentStatus(status);
		premiumMemberList.get(premuimMemberNumber - 1).setPaymentMethod(payment);	
	}
	// Adds on to the method buy printing out premium Member method, by looping through
	// the premiumMember list.
	@Override
	public void printMembers() {
		super.printMembers();
		if(premiumMemberList.size() > 0) {
			System.out.println("----------PREMIUM MEMBERSHIP INFO -----------------");
		for(int i = 0; i<premiumMemberList.size(); i++) {
			System.out.println("Name : " + premiumMemberList.get(i).getName() + " Payment Method : " + premiumMemberList.get(i).getPaymentMethod());
			System.out.println("Has " + premiumMemberList.get(i).getName() + " paid their monthly fee? " + premiumMemberList.get(i).getPaymentStatus());
		 }
		}
	}
	


}
