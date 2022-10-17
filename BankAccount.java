//Arion Mercado
// 4/8/22



public class BankAccount {
     //Creating the strings and variables required

     int balance;
     double interestRate;
     String accountNumber;


//Creating the main BankAccount
     BankAccount(int balance, double interestRate, String accountNumber){
        this.balance = balance;
        this.interestRate = interestRate;
        this.accountNumber = accountNumber;
     }
 
     //Getting the account number 
     public String getAccountNumber(){
         return accountNumber;
     }

     //Setting the account number
     public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
     }

     //Getting the account balance
     public int getBalance(){
        return balance;
     }

    //Getting the interest rate
      public double getInterestRate(){
         return interestRate;
      }

    //Setting the interest rate
    public void setInterestRate(double interestRate){
      this.interestRate = interestRate;
   }

   //Creating a deposit function
   public int deposit(int amount){ //Check deposit and withdraw if theres any issue
      balance += amount;
      return balance;
   }

   //Creating a withdraw function
   public int withdraw(int amount){
      balance -= amount;
      return balance;
   }

   //ApplyingInterest
   public void applyInterest(){
      
   }

   //Getting the Info
   public String getInfo(){
      String info = ("account number: " + this.accountNumber + "\n" + "Balance is: " + this.balance);
      return info;
   }

}
