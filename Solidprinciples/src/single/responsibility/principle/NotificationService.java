package single.responsibility.principle;

public class NotificationService {
	String otp="1234";
	public void sendMobileOTP(String ot)
	{
		if(otp.equals(ot)==true)
		{
			System.out.println("user is valid");
		}
		else
		{
			System.out.println("invalid otp");
		}
	}
	public void sendEmailOTP(String ot)
	{
		if(otp.equals(ot)==true)
		{
			System.out.println("user is valid");
		}
		else
		{
			System.out.println("invalid otp");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotificationService ob=new NotificationService();
		ob.sendMobileOTP("1234");
		ob.sendEmailOTP("123");

	}

}
