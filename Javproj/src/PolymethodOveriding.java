
class Card{
	
	void swipe() {
		System.out.println("Dummy");
	}
}
	
	class CreditCard extends Card{
		
		void swipe() {
			System.out.println("Due increases");
		}
	}
	
	class DebitCard extends Card{
		
		void swipe() {
			
			System.out.println("Balance decreases");
		}
	}
	
	class Shop{
	static	void swippingMachine(Card arg) {
			arg.swipe();
		}
	}
	

public class PolymethodOveriding {
	
	
	public static void main(String[] args) {
		CreditCard card=new CreditCard();
			Shop.swippingMachine(card);
		
	}
	}
