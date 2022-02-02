package dependency.inversion.principle;

public class ShoppingMall 
{
	private BankCards bankcard;
	

	public ShoppingMall(BankCards bankcard) {
		this.bankcard = bankcard;
	}
	public void do_purchase(long amount)
	{
		bankcard.doTransaction(amount);
	}
	
	public static void main(String[] args) {
		BankCards bcardOb=new CreditCard();
		ShoppingMall sm=new ShoppingMall(bcardOb);
		sm.do_purchase(2000);

	}

}
