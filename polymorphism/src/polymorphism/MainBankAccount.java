package polymorphism;

public class MainBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       BankAccount sbAccount=new BankAccount();
       sbAccount.showAccountdetails();
       
       BankAccount rdAccount=new BankAccount(500000.00f);
       rdAccount.acno=12345;
       rdAccount.actype="fixed deposit acccount";
       rdAccount.showAccountdetails();
    
       BankAccount fdAccount=new BankAccount("recurring deposit account",20000.00f);
       fdAccount.acno=6457855;
       fdAccount.showAccountdetails();
	}
    
}
