package srp.bad;

public class LoanServiceBad {

	//Primero veo que tipo de prestamo realizo.
	public void getLoanInterestInfo(String loanType) {
		if (loanType.equals("homeLoan")) {
			//do some job
		}
		if (loanType.equals("personalLoan")) {
			//do some job
		}
		if (loanType.equals("car")) {
			//do some job
		}
	}


	//deposito la cantidad a la cuenta
	public long deposit(long amount, String accountNo) {
		return 0;
	}


	// Envio y valido el OTP
	public void sendOTP(String medium) {

		if (medium.equals("email")) {
			//use JavaMailSenderAPI
		}
		if(medium.equals("mobile")){
			//write logic using API
		}
	}

	//Imprimo nuevo estado de cuenta
	public void printPassbook() {
		//update transaction info in passbook
	}
}
