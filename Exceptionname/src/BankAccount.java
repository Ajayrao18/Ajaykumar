
public class BankAccount {
float balance;


BankAccount(float balance){
	this.balance=balance;
	
}


public void withdraw(float amount) {
	if(amount<=balance) {
		balance=balance-amount;
	}else {//explicitly throw the user defined exception
		
		//System.out.println(""insuficient balance);
		try {
			throw new NegativeBalanceException("insufficient balance");
		}
	catch(NegativeBalanceException nbe){
		System.err.println(nbe.getMessage());
	}
	}
}
public void showbalance() {
	System.out.println("balance:"+balance);
}
}
