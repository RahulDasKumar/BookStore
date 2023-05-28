
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UnitTest {
	
 @Test//TEST FOR MEMBERS BEING ADDED
 @Order(1)
   void testIfMembersAreCreated() {
	 System.out.println("Testing to see if members are created ...");
	  var member = new Member("Bob", 0);
	  ArrayList<Member> memberListTest = new ArrayList<>();
	  System.out.println("When it asks for your name, type Bob");
	  memberListTest.add(member);
	  member.addMember();
	  assertEquals(memberListTest.get(0).getName(), Member.memberList.get(0).getName());
	  System.out.println("Test Completed");
  }
 // TEST FOR PREMIUM MEMBERS BEING ADDED
 @Test
 @Order(2)
  void testIfPremiumMembersAreCreated() {
	 System.out.println("Testing to see if premium members are created ...");
	  var premiumMember = new PremiumMember("Rahul", 0, "Nothing", "No");
	  ArrayList<PremiumMember> premiumMemberListTest = new ArrayList<>();
	  premiumMemberListTest.add(premiumMember);
	  System.out.println("When it asks for your name, type Rahul");
	  premiumMember.addMember();
	  assertEquals( premiumMemberListTest.get(0).getName(), PremiumMember.premiumMemberList.get(0).getName());
	  System.out.println("Test Completed");
  }
    // TEST FOR SEEING IF PAYMENT METHOD WORKS 
    // AND THE PRICE CALCULATED CORRECTLY.
 @Test
 @Order(3)
    void testIfPurchaseMethodWorksandCalculatesCorrectly() {
	 System.out.println("Testing to see if purchase method works ... ");
	  var member = new Member();
	  System.out.println("Buy 1 copy of cat in the hat");
	  System.out.println("Buy 1 copy of the thriller");
	  System.out.println("Buy 1 copy of naruto");
	  System.out.println("Select Bob, when selecting a member");
	  member.memberPurchase();
	  int price = 34;
	  assertEquals(price, Member.memberList.get(0).getTotalPurchased());
	  System.out.println("Test Completed");
  }
    //TEST TO SEE IF REFUND METHOD WORKS
 @Test
 @Order(4)
    void testIfRefundMethodWorks() {
	 System.out.println("Testing to see if refund method works ... ");
	  var member = new Member();
    //	Member member = new Member("Rahul",65);
    //	Member.memberList.add(member);
	  System.out.println("Pick Bob and refund one copy of at in the hat");
    	member.refund();
    	// REFUND ONE COPY OF CAT IN THE HAT
    	int price = 25;
    	assertEquals(price, Member.memberList.get(0).getTotalPurchased());
    }
 // TESTS THE PAYMENT INFO, AND PAYMENT METHOD FROM PREMIUM MEMBERS
 @Test
 @Order(5)
 void testIfPremiumMemberPaymentInfoisSet() {
	 System.out.println("Testing to see if premiumMember payment info has been set");
	  var member = new PremiumMember();
	  var testMember = new PremiumMember("Test", 0, "Credit", "Yes");
	  System.out.println("Buy anything you want");
	  System.out.println("Select the second member Rahul");
	  System.out.println("When it asks for payment method, type Credit.");
	  System.out.println("When it asks if you have payed, type Yes");
	  System.out.println("Capitalize Properly");
	  member.memberPurchase();
	  String testPaymentStatus = PremiumMember.premiumMemberList.get(0).getPaymentStatus();
	  String testPaymentMethod = PremiumMember.premiumMemberList.get(0).getPaymentMethod();
	  assertEquals(testMember.getPaymentStatus(), testPaymentStatus );
	  assertEquals(testMember.getPaymentMethod(), testPaymentMethod );
 }
 @Test
 @Order(6)
 void testToSeeIfPrintMembersWorks() {
	 var member = new Member();
	 var member1 = new Member("Bob",0);
	 var member2 = new Member("Rahul",0);
	 ArrayList<Member> list = new ArrayList<>();
	 list.add(member1);
	 list.add(member2);
	 assertEquals(list.get(0).getName() , Member.memberList.get(0).getName());
	 assertEquals(list.get(1).getName() , Member.memberList.get(1).getName());
 }
 // TESTS TO SEE IF THE BOOKS GETS SUBRACTED, SINCE THE OUTPUT WILL VARY EACH TIME, 
 // IT HAS TO BE LESS THAN 5000 FOR THE TEST TO PASS.
 @Test
 @Order(7)
  void testingInventory() {
	 boolean testVariable = true;
	 boolean changingVariable2 = true;
	
	int number =  Books.amountOfBooks;
	  if(number < 5000) {
		  changingVariable2 = true;
	  }
	  else {
		  changingVariable2 = false;
		 
	  }
	  assertEquals(testVariable, changingVariable2);
	
 }
 
 
 
  
}
