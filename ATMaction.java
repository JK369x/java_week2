import java.util.ArrayList;

interface ATMactionable {
   void checkable();
   void withdrawable();
   void depositeable();
   void Transferable(ArrayList<Account> account_list);
}