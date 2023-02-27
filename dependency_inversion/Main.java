package dependency_inversion;

public class Main {

	public static void main(String[] args) {

		//BAD
		DebitCard debitCard = new DebitCard();
		CreditCard creditCard = new CreditCard();
		debitCard.doTransaction(1000);
		ShoppingMallBad shoppingMallBad = new ShoppingMallBad(debitCard, creditCard);
		shoppingMallBad.doPurchaseSomething(5000, true);

		//GOOD
		BankCard bankCard = new CreditCard();
		ShoppingMall shoppingMall = new ShoppingMall(bankCard);
		shoppingMall.doPurchaseSomething(5000);
	}
}
