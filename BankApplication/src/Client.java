
public class Client {
	
	

	public static void main(String[] args) {
		
		ICICIBank bank = new ICICIBank();
		System.out.println(bank.createAccount(101,5000));
		
		System.out.println(bank.createAccount(102,10000));
		
		
		try
		{
			System.out.println("Total balance = "+bank.depositAmount(156, 2000));
		}catch(InvalidAccountNumberException ian)
		{
			System.out.println("invalid account number");
		}

	}

}
