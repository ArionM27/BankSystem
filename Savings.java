public class Savings extends BankAccount {

//Creating a savings method
    Savings(int balance, double interestRate, String accountNumber) {
        super(balance, interestRate, accountNumber);
        
    }

    //Deposit
    public int deposit(int amount){
        balance += amount;
        applyInterest();
        
        return balance;
    }

    //Withdrawing
    public int withdraw(int amount){
        balance -= amount;
        applyInterest();
        return balance;
    }

    //ApplyingInterest
    public void applyInterest(){
        balance += (balance*2*interestRate);
    }

    //Getting info

    
    public String getInfo(){
       return ("Savings account number: " + this.accountNumber + "\n" + "Balance is: " + this.balance);
      }

}