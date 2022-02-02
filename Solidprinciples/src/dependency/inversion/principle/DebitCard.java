package dependency.inversion.principle;

public class DebitCard implements BankCards {

	@Override
	public void doTransaction(long amount) {
		System.out.println("payment using debit card");
		
	}

}
