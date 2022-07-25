import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    //*อยากให้ function ไหนเห็นประกาศไว้ class Main
    private ArrayList<Account> account_list = new ArrayList<>();
    
    private void addAccount(Account account_atm) {
        account_list.add(account_atm);
    }
    Scanner Sc = new Scanner(System.in);
    Account account_atm;
    Manager manager;
    // *Main */
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Main main = new Main();
        main.crateManager();
        main.loginManager();
        System.out.print("Enter amount of all account = ");
        int i = Sc.nextInt();
        System.out.println("Enter Detail of each account.");
        for (int j = 0; j < i; j++) {
            System.out.println("No." + (j + 1));
            Account account_atm = main.takeAtm_accInput();
            main.addAccount(account_atm);
        }
        main.loginAccount();
        // main.menuATM();
    }

    private Manager crateManager() {
        String manager_ID, manager_Password, person_ID, person_Name, gender;
        System.out.println("Create Manager !!");
        do {
            System.out.print("Enter Manager ID = ");
            manager_ID = Sc.next();
            if ((manager_ID.length() > 13)) {
                System.out.println("ID to long");
            }
        } while ((manager_ID.length() > 13));

        do {
            System.out.print("Enter Manager Password = ");
            manager_Password = Sc.next();
            if ((manager_Password.length() > 4)) {
                System.out.println("Password too long");
            }
        } while ((manager_Password.length() > 4));

        do {
            System.out.print("Enter Person ID = ");
            person_ID = Sc.next();
            if ((person_ID.length() > 13)) {
                System.out.println("ID to long");
            }
        } while ((person_ID.length() > 13));

        do {
            System.out.print("Enter Manager Name = ");
            person_Name = Sc.next();
            if ((person_Name.length() > 13)) {
                System.out.println("Name too long");
            }
        } while ((manager_ID.length() > 13));

        do {
            System.out.print("Enter Manager Gender = ");
            gender = Sc.next();
            if ((gender.length() > 6)) {
                System.out.print("Gender too long");
            }
        } while ((gender.length() > 6));

        manager = new Manager(manager_ID, manager_Password, person_ID, person_Name, gender);
        return manager;
    }

    private void loginManager() {
        System.out.print("Enter Manager ID = ");
        String manager_ID = Sc.next();
        System.out.print("Enter Manager Password = ");
        String manager_Password = Sc.next();
        
        if(manager.getManager_ID().equals(manager_ID) && manager.getManager_Password().equals(manager_Password)) {
            System.out.println("Login Success");
        }
    }

    private Account takeAtm_accInput() {
        String account_ID, account_Password, person_ID, person_Name, gender;
        int balance;
        do {
            System.out.print("Enter Account ID = ");
            account_ID = Sc.next();
            if(account_ID.length() > 13){
                System.out.println("ID too long");
            }
        }while(account_ID.length() > 13);

        do {
            System.out.print("Enter Account Password = ");
            account_Password = Sc.next();
            if(account_Password.length() > 4){
                System.out.println("Password too long");
            }
        }while(account_Password.length() > 4);

        do {
            System.out.print("Enter Balance = ");
            balance = Sc.nextInt();
            if(balance > 1000000){
                System.out.println("Balance too high");
            }
        }while(balance > 1000000); 
           
        do {
            System.out.print("Enter Person ID = ");
            person_ID = Sc.next();
            if(person_ID.length() > 13){
                System.out.println("ID too long");
            }
        }while(person_ID.length()  > 13); 

        do {
            System.out.print("Enter Person Name = ");
            person_Name = Sc.next();
            if(person_Name.length() > 30){
                System.out.println("Name too long");
            }
        }while(person_Name.length()  > 30); 

        do {
            System.out.print("Enter Gender = ");
            gender = Sc.next();
            if(gender.length() > 6){
                System.out.println("Gender too long");
            }
        }while(gender.length()  > 6); 

            account_atm = new Account(account_ID, account_Password, balance, person_ID, person_Name, gender);
            return account_atm;

    }
    //*login Account */
    private void loginAccount(){
        System.out.print("Account ID : ");
        String Account_ID = Sc.next();
        System.out.print("Account Password : ");
        String Password = Sc.next();
            for (Account account_atm : account_list) {
                if(account_atm.getAccount_ID().equals(Account_ID) && account_atm.getAccount_Password().equals(Password)){
                    System.out.println("Login success");
                    int option;
       
                    do{
                        System.out.println("==============================");
                        System.out.println("ATM ComputerThanyaburi Bank");
                        System.out.println("Account ID :" + account_atm.getAccount_ID());
                        System.out.println("Menu Service");
                        System.out.println("1. Account Balance");
                        System.out.println("2. Withdraw");
                        System.out.println("3. Deposit");
                        System.out.println("4. Transfer");
                        System.out.println("5. Back to login");
                        System.out.print("Choose : ");
                        option = Sc.nextInt();
                        System.out.println("==============================");
                        switch(option){
                            case 1:
                                account_atm.checkable();
                              
                                break;
                            case 2:
                                account_atm.withdrawable();
                              
                                break;
                            case 3:
                                account_atm.depositeable();
                               
                                break;
                            case 4:
                                account_atm.Transferable(account_list);
                                
                                break;
                            case 5:
                                loginAccount();
                                break;
                            default:
                                System.out.println("Invalid option");
                        }
                    }while(option !=10);
                }
            }
        }
    }



