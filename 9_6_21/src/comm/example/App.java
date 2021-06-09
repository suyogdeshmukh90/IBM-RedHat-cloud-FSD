package comm.example;

public class App {

	public static void main(String[] args) {
		AccountClass acc=new AccountClass();
		acc.createAcount("acc-01", "Suyog", 65000, AccountType.CURRENT);
		if(acc.getAccountType()==AccountType.CURRENT)
		{
			CurrentAccount cur=new CurrentAccount();
			cur.createCurrentAccount();
			
		}
		else if(acc.getAccountType()==AccountType.SAVINGS)
		{
			SavingAccount cur=new SavingAccount();
			cur.createSavingAccount();
			
		}
	}

}
