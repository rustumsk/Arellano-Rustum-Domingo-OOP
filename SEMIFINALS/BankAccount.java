import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount{
    private int accountNum;
    private String accountName;
    private double balance;
    public static ArrayList<BankAccount> account = new ArrayList<>(); /*thought it is still not needed, i prepared this arraylist wherever we
                                                                        need to handle creating and handling multiple bank accounts*/

    Scanner scan = new Scanner(System.in);

    public BankAccount(int accountNum, String accountName, double balance){
        this.accountNum = accountNum;
        this.accountName = accountName;
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "Account Number: " + this.accountNum + " | Account Name: "+accountNum+ " | Balance: " + balance;
    }

    void deposit(){
        System.out.print("How much do you want to deposit?: ");
        double deposit = scan.nextDouble();

        this.balance += deposit;

        System.out.println("\n"+"!!Deposit successful!!");
    }
    void withdraw(){
        System.out.print("How much do you want to withdraw?: ");
        double withdraw = scan.nextDouble();

        this.balance -= withdraw;

        System.out.println("\n"+"!!Withdraw successful!!");
    }
    void showBalance(){
        System.out.println("\n"+"Balance: "+ this.balance);
    }

}