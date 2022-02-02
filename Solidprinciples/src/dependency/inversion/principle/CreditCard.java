package dependency.inversion.principle;

public class CreditCard implements BankCards {

	@Override
	public void doTransaction(long amount) {
		System.out.println("payment through credit card");
		
	}

}
