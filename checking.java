import java.util.Calendar; //Importing calendar
import java.util.GregorianCalendar;

public class checking extends BankAccount {
    //Creating the extra variable required
    int overdraftFee;

    //Creating main checking method
    checking(int balance, double interestRate, String accountNumber, int overdraftFee){
        super(balance, interestRate, accountNumber);
        this.overdraftFee = overdraftFee;
    }

    //Creating a getFee method
    public int getFee(){
        return overdraftFee;
    }

    //Setting a fee
    public void setFee(int overdraftFee){
        this.overdraftFee = overdraftFee;
    }

    //Deposit
    public int deposit(int amount){
        balance += amount;
        

        //Importing calendar to check month for deposit
        Calendar checker = GregorianCalendar.getInstance();
        int day = checker.get(GregorianCalendar.DAY_OF_MONTH);

        if(day < 27){
            applyInterest();
        }
            return balance;

    }

    //Withdrawing
    public int withdraw(int amount){
        balance -= amount;

        //Checking if balance is negative
        if(balance < 0){
            balance -= overdraftFee;
        }

        return balance;
    }


    //ApplyingInterest
    public void applyInterest(){
        balance+= (balance*interestRate);
    }

    //Getting info
    public String getInfo(){
        return ("Checking account number: " + this.accountNumber + "\n" + "Balance is: " + this.balance);
          
    }
}