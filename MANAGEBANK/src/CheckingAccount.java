/**
   A checking account that charges transaction fees.
*/
public class CheckingAccount extends BankAccount
{  

   private int transactionCount;
   
   private static final int FREE_TRANSACTIONS = 3;
   private static final double TRANSACTION_FEE = 2.0;
   
   /**
      Constructs a checking account with a given balance.
      @param initialBalance the initial balance
   */
   public CheckingAccount(String anAccountNumber, String firstName, String lastName, String password, double initialBalance)
   {  
	   /* Bổ sung mã lệnh để hoàn thiện hàm dựng với đẩy đủ tham số */
	   // Construct superclass
	   // Initialize transaction count ( = 0)
	   super(anAccountNumber, firstName, lastName, password, initialBalance);
	   
   }

    public int getTransactionCount(){
    	/* Sửa lại mã lệnh để trả về trường tương ứng */
        return transactionCount;
    }

   public void deposit(double amount) 
   {  
      transactionCount++;
      // Now add amount to balance 
      super.deposit(amount); 
   }
   
   public void withdraw(double amount) 
   {  
      /* Bổ sung mã lệnh tương tự phương thức deposit
      // increases count of transaction
      
      // Now subtract amount from balance 
	  */
	   transactionCount++;
	   super.withdraw(amount);
   }

   /**
      Deducts the accumulated fees and resets the
      transaction count.
   */
   public void deductFees()
   {  
      if (transactionCount > FREE_TRANSACTIONS)
      {  
         double fees = TRANSACTION_FEE *
               (transactionCount - FREE_TRANSACTIONS);
         super.withdraw(fees);
      }
      transactionCount = 0;
   }
   
   // Overriding method transfer
   public void transfer(double amount, BankAccount other)
   {  
        transactionCount++;
        deductFees();
        amount = Math.min(amount, this.getBalance());
        withdraw(amount);
        other.deposit(amount);
   }

    public String toString(){
        
         return "AccountN."+super.getAccountNumber()+"; Name: " + super.getFirstName()+ " "+ super.getLastName()+ 
                "; Balance: " + String.valueOf(super.getBalance()) + ". Number of transactions : " + transactionCount;  
             
    }

	public static int getFreeTransactions() {
		return FREE_TRANSACTIONS;
	}

	public static double getTransactionFee() {
		return TRANSACTION_FEE;
	}

	public void setTransactionCount(int transactionCount) {
		this.transactionCount = transactionCount;
	}
}