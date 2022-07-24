import java.util.ArrayList;
import java.util.Scanner;
public class Account extends Person implements ATMactionable {
    //attribute
    private String Account_ID, Account_Password;
    private int Balance;
    Scanner Sc = new Scanner(System.in);
    public void checkable() {
        System.out.println("Account Balance : " + getBalance());
    }

    public void withdrawable() {
        System.out.println("==============================");
        System.out.print("Enter amount : ");
        int amount = Sc.nextInt();
        if(amount > getBalance()){
            System.out.println("Not enough b alance");
        }else{
            setBalance(getBalance() - amount);
            System.out.println("Withdraw success");
            System.out.println("==============================");
        }
    }
    
    public void depositeable() {
        System.out.print("Enter amount : ");
        int amount = Sc.nextInt();
        setBalance(getBalance() + amount);
        System.out.println("Deposite success");
    }

    public void Transferable(ArrayList<Account> account_list) {
        String transfer_Account_ID;
        System.out.print("Enter Account ID For your Transfer: ");
        transfer_Account_ID = Sc.next();
        for(Account account_atm : account_list){
            if(account_atm.getAccount_ID().equals(transfer_Account_ID)){
                System.out.print("Enter amount : ");
                int amount = Sc.nextInt();
                if(amount > getBalance()){
                    System.out.println("Not enough balance");
                }else{
                    setBalance(getBalance() - amount);
                    account_atm.setBalance(account_atm.getBalance() + amount);
                    System.out.println("Transfer success");
                }
            }
        }
    }

    public void setAccount_ID(String account_ID) {
        Account_ID = account_ID;
    }

    public void setAccount_Password(String account_Password) {
        Account_Password = account_Password;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public String getAccount_ID() {
        return Account_ID;
    }

    public String getAccount_Password() {
        return Account_Password;
    }

    public int getBalance() {
        return Balance;
    }

    //constructor
    public Account(String Account_ID, String Account_Password, int Balance,String Person_ID, String Person_Name, String Gender) {
        super(Person_ID, Person_Name, Gender);
        this.Account_ID = Account_ID;
        this.Account_Password = Account_Password;
        this.Balance = Balance;
    }
}
