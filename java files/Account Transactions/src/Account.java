
public class Account {
	private String accountNumber;
	private int balance;
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public Account(String accountNumber, int balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
		
	}
	
	public void deposit(int transactionAmount){
		balance = balance + transactionAmount;
		display();
	}
	
	public void withdraw(int transactionAmount){
		if(balance > transactionAmount){
			balance = balance - transactionAmount;
			display();
		}
		else{
			System.out.println("Insufficient Balance");
			display();
		}
		}
	
	public void display(){
		System.out.println("Your balance after the transaction is :"+balance);
	}
	public void balance(){
		
	}
}
