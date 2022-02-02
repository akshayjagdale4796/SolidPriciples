package interfacesegregation.principle;

public class PhonepayVio implements UpiPaymentVio{

	@Override
	public void paymoney() {
		// logic here
		
	}

	@Override
	public void getScrashcard() {
		// logic here
		
	}

	@Override
	public void getCashbackAsCreditBalance() {
		// does not support/ do not want to use then we cannot force to client to use method
		
	}

}
