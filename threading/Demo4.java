class Account {
	public int balance;
	public int accountNo;
	void displayBalance() {
		System.out.println("Account No:" + accountNo + "Balance: " + balance);
	}

	   void deposit(int amount){
			balance = balance + amount;
			System.out.println( amount + " is deposited");
			displayBalance();
	   }

	   void withdraw(int amount){
			  balance = balance - amount;
			  System.out.println( amount + " is withdrawn");
			  displayBalance();
	   }
}

class TransactionDeposit implements Runnable{
	int amount;
	Account accountX;
	TransactionDeposit(Account x, int amount){
		accountX = x;
		this.amount = amount;
		new Thread(this).start();
	}
	
	public void run(){
        synchronized(accountX){
        accountX.deposit(amount);
        }
	}
}

class TransactionWithdraw implements Runnable{
	int amount;
	Account accountY;
	
	TransactionWithdraw(Account y, int amount) {
		accountY = y;
		this.amount = amount;
		new Thread(this).start();
	}
	
	public void run(){
        synchronized(accountY){
        accountY.withdraw(amount);
        }
	}
}

class Demo4{
	public static void main(String args[]) {
		Account ABC = new Account();
		ABC.balance = 1000;
		ABC.accountNo = 111;
		TransactionDeposit t1;
		TransactionWithdraw t2;
		t1 = new TransactionDeposit(ABC, 500);
        t2 = new TransactionWithdraw(ABC,900);
        t1 = new TransactionDeposit(ABC, 400);
		t2 = new TransactionWithdraw(ABC,700);
	}
}
