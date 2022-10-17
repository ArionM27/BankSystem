//Arion Mercado
// 4/9/22

import java.util.Scanner;   //Importing scanner for input
import java.util.ArrayList; //Importing arrayList
import java.util.Calendar; //Importing calendar
import java.util.GregorianCalendar;

public class BankTest {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Using scanner

        //Creating Checking and savings accounts with their information
        

        checking C1 = new checking(10000, 0.02, "AC785689", 5);
        checking C2 = new checking(15000, 0.02, "AC123899", 5);
        Savings S1 = new Savings(100000, 0.03, "AS785689");
        Savings S2 = new Savings(1250000, 0.04, "AS345678");

        //Creating arraylists to keep information
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        accounts.add(C1);
        accounts.add(C2);
        accounts.add(S1);
        accounts.add(S2);

        
        while(true){

        //Asking user to enter account number
        System.out.println("Enter the customer account number");
        String number = input.next();   //Inputting scanner




        //Continuing if number is equal to an account number and selecting that specific account number
        if(number.equals(accounts.get(0).getAccountNumber())){
           //Providing the menu of choices
           while(true){
               
           System.out.println("Enter 1, 2 or 3 for the option you want:");
           System.out.println("1: deposit money");
           System.out.println("2: withdraw money");
           System.out.println("3: print account details");

          int choice = input.nextInt();

          

          if(choice == 1){
              //Depositing an amount of money
              System.out.println("Enter Deposit Amount");
              int depositnumber = input.nextInt();
              C1.deposit(depositnumber);
          }

          else if(choice == 2){
              //Withdrawing an amount of money
              System.out.println("Enter Withdraw Amount");
              int withdrawnumber = input.nextInt();
              C1.withdraw(withdrawnumber);

          }

          else if(choice == 3){
              System.out.println(C1.getInfo());

          }

          else{
              System.out.println("This choice is invalid, try again");
          }

          //Asking user if they want to continue
          System.out.println("Enter Y to continue with this account:");
          String answer = input.next();

          if(answer.equals("y")|| answer.equals("Y")){
            continue;
        }

    else{
        break;
    }

        }

               //Asking user if they want to continue with the program
           System.out.println("Enter Y to continue with another account:");
           String answer = input.next();

           if(answer.equals("y")||answer.equals("Y")){
                continue;
           }

           else{
                    //Retrieving calendar information for date
                    Calendar checker = GregorianCalendar.getInstance();
                    int day = checker.get(GregorianCalendar.DAY_OF_MONTH);
                    int month = checker.get(GregorianCalendar.MONTH);
                    int year = checker.get(GregorianCalendar.YEAR);

                   System.out.println( (month + 1) + "/" + day + "/" + year);
                   System.out.println("Thank you for visiting our bank today!!");
                   break;
            }

        }

        else if(number.equals(accounts.get(1).getAccountNumber())){
             //Providing the menu of choices
             while(true){

             System.out.println("Enter 1, 2 or 3 for the option you want:");
             System.out.println("1: deposit money");
             System.out.println("2: withdraw money");
             System.out.println("3: print account details");

            int choice = input.nextInt();

            

            if(choice == 1){
                //Depositing an amount of money
                System.out.println("Enter Deposit Amount");
                int depositnumber = input.nextInt();
                C2.deposit(depositnumber);
                
                //Asking user if they want to continue
                System.out.println("Enter Y to continue with this account:");
                String answer = input.next();

                if(answer.equals("y")|| answer.equals("Y")){
                    continue;
                }

            else{
                break;
            }
                
            }

            else if(choice == 2){
                //Withdrawing an amount of money
                System.out.println("Enter Withdraw Amount");
                int withdrawnumber = input.nextInt();
                C2.withdraw(withdrawnumber);

                //Asking user if they want to continue
                System.out.println("Enter Y to continue with this account:");
                String answer = input.next();

                if(answer.equals("y")|| answer.equals("Y")){
                    continue;
                }

            else{
                break;
            }

            }

            else if(choice == 3){
                System.out.println(C2.getInfo());

                //Asking user if they want to continue
                System.out.println("Enter Y to continue with this account:");
                String answer = input.next();

                if(answer.equals("y")|| answer.equals("Y")){
                    continue;
                }

            else{
                break;
            }

            }

            else{
                System.out.println("This choice is invalid, try again");
            }

            //Asking user if they want to continue with the program
            System.out.println("Enter Y to continue with another account:");
            String answer = input.next();

            if(answer.equals("y")|| answer.equals("Y")){
                    continue;
                }

            else{
                break;
            }

            }

             //Asking user if they want to continue with the program
           System.out.println("Enter Y to continue with another account:");
           String answer = input.next();

           if(answer.equals("y")||answer.equals("Y")){
            continue;
       }

       else{
                //Retrieving calendar information for date
                Calendar checker = GregorianCalendar.getInstance();
                int day = checker.get(GregorianCalendar.DAY_OF_MONTH);
                int month = checker.get(GregorianCalendar.MONTH);
                int year = checker.get(GregorianCalendar.YEAR);

               System.out.println( (month + 1) + "/" + day + "/" + year);
               System.out.println("Thank you for visiting our bank today!!");
               break;
        }

        }

        else if(number.equals(accounts.get(2).getAccountNumber())){
            //Providing the menu of choices
            while(true){

            System.out.println("Enter 1, 2 or 3 for the option you want:");
            System.out.println("1: deposit money");
            System.out.println("2: withdraw money");
            System.out.println("3: print account details");

           int choice = input.nextInt();

           

           if(choice == 1){
               //Depositing an amount of money
               System.out.println("Enter Deposit Amount");
               int depositnumber = input.nextInt();
               S1.deposit(depositnumber);
               
               //Asking user if they want to continue
               System.out.println("Enter Y to continue with this account:");
               String answer = input.next();

               if(answer.equals("y")|| answer.equals("Y")){
                continue;
            }

            else{
                break;
            }
               
           }

           else if(choice == 2){
               //Withdrawing an amount of money
               System.out.println("Enter Withdraw Amount");
               int withdrawnumber = input.nextInt();
               S1.withdraw(withdrawnumber);

               //Asking user if they want to continue
               System.out.println("Enter Y to continue with this account:");
               String answer = input.next();

               if(answer.equals("y")|| answer.equals("Y")){
                continue;
            }

                else{
                    break;
                }

           }

           else if(choice == 3){
            System.out.println(S1.getInfo());

               //Asking user if they want to continue
               System.out.println("Enter Y to continue with this account:");
               String answer = input.next();

               if(answer.equals("y")|| answer.equals("Y")){
                continue;
            }

                else{
                    break;
                }

           }

           else{
               System.out.println("This choice is invalid, try again");
           }

        }

            //Asking user if they want to continue with the program
            System.out.println("Enter Y to continue with another account:");
            String answer = input.next();
 
            if(answer.equals("y")||answer.equals("Y")){
                continue;
           }

           else{
                    //Retrieving calendar information for date
                    Calendar checker = GregorianCalendar.getInstance();
                    int day = checker.get(GregorianCalendar.DAY_OF_MONTH);
                    int month = checker.get(GregorianCalendar.MONTH);
                    int year = checker.get(GregorianCalendar.YEAR);

                   System.out.println( (month + 1) + "/" + day + "/" + year);
                   System.out.println("Thank you for visiting our bank today!!");
                   break;
            }
        
        }

       

        else if(number.equals(accounts.get(3).getAccountNumber())){
            //Providing the menu of choices
            while(true){

            System.out.println("Enter 1, 2 or 3 for the option you want:");
            System.out.println("1: deposit money");
            System.out.println("2: withdraw money");
            System.out.println("3: print account details");

           int choice = input.nextInt();

           

           if(choice == 1){
               //Depositing an amount of money
               System.out.println("Enter Deposit Amount");
               int depositnumber = input.nextInt();
               S2.deposit(depositnumber);
               
               //Asking user if they want to continue
               System.out.println("Enter Y to continue with this account:");
               String answer = input.next();

               if(answer.equals("y")|| answer.equals("Y")){
                continue;
            }

                else{
                    break;
                }
               
           }

           else if(choice == 2){
               //Withdrawing an amount of money
               System.out.println("Enter Withdraw Amount");
               int withdrawnumber = input.nextInt();
               S2.withdraw(withdrawnumber);

               //Asking user if they want to continue
               System.out.println("Enter Y to continue with this account:");
               String answer = input.next();

               if(answer.equals("y")|| answer.equals("Y")){
                continue;
            }

                else{
                    break;
                }

           }

           else if(choice == 3){
            System.out.println(S2.getInfo());

               //Asking user if they want to continue
               System.out.println("Enter Y to continue with this account:");
               String answer = input.next();

               if(answer.equals("y")|| answer.equals("Y")){
                continue;
            }

                else{
                    break;
                }

           }
        }

    }

           //What to do if the number entered is invalid
    else{
            System.out.println("This choice is invalid, try again");
        }

        

    //Asking user if they want to continue with the program
        System.out.println("Enter Y to continue with another account:");
        String answer = input.next();

        if(answer.equals("y")||answer.equals("Y")){
        continue;
       }

        else{
            //Retrieving calendar information for date
            Calendar checker = GregorianCalendar.getInstance();
            int day = checker.get(GregorianCalendar.DAY_OF_MONTH);
            int month = checker.get(GregorianCalendar.MONTH);
            int year = checker.get(GregorianCalendar.YEAR);

            System.out.println( (month + 1) + "/" + day + "/" + year);
            System.out.println("Thank you for visiting our bank today!!");
            break;
        }

        



        
        

    }
    
}

}