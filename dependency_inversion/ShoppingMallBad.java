package dependency_inversion;

public class ShoppingMallBad {

	private DebitCard debitCard;

	private CreditCard creditCard;

	public ShoppingMallBad(DebitCard debitCard, CreditCard creditCard) {
		this.debitCard = debitCard;
		this.creditCard = creditCard;
	}

	public void doPurchaseSomething(long amount, Boolean how) {
		if (how) {
			creditCard.doTransaction(amount);
		} else {
			debitCard.doTransaction(amount);
		}

	}

}
