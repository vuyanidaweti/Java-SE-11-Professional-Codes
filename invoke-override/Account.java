/*This code is to test and verify the thoery of invoking subclass methods 
 in the super class via calling the super class 
 */
 class Card {
 	String Name ="" ,IDNumber =""; 
 	int CardNumber = 0;
 	double Amount = 0.0 ;
 	Card(String Name, String IDNumber, int CardNumber, double Amount){
 		this.Name =Name;
 		this.IDNumber = IDNumber;
 		this.CardNumber = CardNumber;
 		this.Amount = Amount;
 		this.printDetails();
 	}
 	void printDetails(){
 		System.out.println("Card Number" + CardNumber);
 		System.out.println("ID Number:" + IDNumber);
 		System.out.println("Name:" + Name);
 		System.out.println("Amount Available :"+Amount);
 	}
 }

 class MasterCard extends Card { 
 	String CardTye = "MasterCard";
 	MasterCard(String Name, String IDNumber, int CardNumber, double Amount){
 		super(Name,IDNumber,CardNumber,Amount);
 		this.CardTye = CardTye;
 		//this.printDetails();
 	}
 	void printDetails(){
 		System.out.println("MasterCard");
 		//this.printDetails();
 	}
 }

class VisaCard extends Card { 
 	String CardTye = "VisaCard";
 	VisaCard(String Name, String IDNumber, int CardNumber, double Amount){
 		super(Name,IDNumber,CardNumber,Amount);
 		this.CardTye = CardTye;
 	}
 	void printDetails(){
 		System.out.println("Card Type" + CardNumber);
 		//this.printDetails();
 	}
 }

 public class Account { 
 	public static void main(String[] args) {
 		Card a = new MasterCard("Vuyani", "0987654345678",22211134,100.234);
 	}

 }