import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank{
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        Bank bank = new Bank();
        Scanner scan = new Scanner(System.in);

        int accountNum = 0;
        String accountName = "";
        int loop = 0;
        do{
            int bAccount = bank.showChoices();
            switch(bAccount){
                case 1:
                    int aLoop = 0;
                    while(aLoop == 0){
                        try{
                            System.out.print("Account Number: ");
                            accountNum = scan.nextInt();
                            aLoop = 1;
                        }
                        catch(InputMismatchException r){
                            System.out.println("Invalid input! Integer only!");
                            scan.next();
                        }
                    }

                    System.out.print("Account Name: ");
                    accountName = scan.next();

                    double balance = 0.0;

                    BankAccount bankA = new BankAccount(accountNum, accountName, balance);
                    BankAccount.account.add(bankA);

                    System.out.println("Account successfully created!");
                    
                    int cLoop = 0;
                    while(cLoop == 0){
                    int c = bank.accountChoices();
                        switch(c){
                            case 1:
                                bankA.deposit();
                                break;
                            case 2:
                                bankA.withdraw();
                                break;
                            case 3:
                                bankA.showBalance();
                                break;
                            case 4:
                                cLoop = 1;
                                loop = 1;
                                break;
                            default:
                                System.out.println("Invalid option");
                            }
                        
                    }
                    break;
                case 2:
                    System.out.println("BYE!");
                    loop = 1;
                    break;
                default:
                    System.out.println("Invalid Input!");
            }
        scan.close();
        }while(loop == 0);
    }
    private int showChoices(){
        System.out.println("+++++++++++++++++++");
        System.out.println("1. Create a bank account");
        System.out.println("2. Exit");

        System.out.print("Choice: ");
        int choice = scan.nextInt();

        return choice;
    }
    private int accountChoices(){
        System.out.println("\n"+"+++++++++++++++++++");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Show Balance");
        System.out.println("4. Exit");

        System.out.print("Choice: ");
        int aChoice = scan.nextInt();

        return aChoice;
    }
}

