import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void Register(ArrayList<BankAccount> list){
        Scanner s=new Scanner(System.in);
        boolean run1=true;
        while(run1) {
            System.out.println("Kindly Enter The Name Of Account Opener");
            String ao = s.nextLine();
            System.out.println("Kindly Enter The Initial Deposit");
            double dep=s.nextDouble();
            s.nextLine();
            if(dep>=100){
                run1=false;
                BankAccount obj=new BankAccount(ao,dep);
                list.add(obj);
                System.out.println("Your account Has Been Sucessfully Created");
            }
            else {
                System.out.println("Dear User The Minimum Deposit Should Be Rs 100");
            }
        }
    }
    public static void login(ArrayList<BankAccount>list){
        Scanner s=new Scanner(System.in);
        boolean run2=true;
        System.out.println("Kindly Enter Your Account Holder Name To Login");
        String user=s.nextLine();
        for(BankAccount search:list){
            if(search.getName().equalsIgnoreCase(user)){
                System.out.println("Welcome Dear Customer Mr "+search.getName());
                while (run2){
                    System.out.println("Kindly Press 1 for Withdraw Amount");
                    System.out.println("Kindly Press 2 For Deposit Amount");
                    System.out.println("Kindly Press 3 for Check Your Balance");
                    System.out.println("Kindly Press 4 for Logging Out");
                    int choice2= s.nextInt();
                    if(choice2==1){
                        System.out.println("Kindly Enter Amount To Withdraw");
                        int wd=s.nextInt();
                        search.withdraw(wd);
                        System.out.println("Kindly Collect Your Amount From Machine");
                    }
                    else if (choice2==2) {
                        System.out.println("Kindly Enter Amount to Deposit");
                        int dp=s.nextInt();
                        search.deposit(dp);
                        System.out.println("The Amount Is Deposited Scuccesfully");
                    }
                    else if (choice2==3) {
                        System.out.println(search.getBalance());
                    }
                    else if (choice2==4) {
                           run2=false;
                    }
                    else{
                        System.out.println("Enter a Valid Choice");
                    }
                }
            }
            else {
                System.out.println("Sry User We Cant Find Account Kindly Create A new Account");
            }
        }
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        boolean run=true;
        ArrayList<BankAccount>list=new ArrayList<>();
        while(run) {
            System.out.println("Kindly Press 1 For Creating Bank Account");
            System.out.println("Kindly Press 2 For Loging In to existing account");
            int choice1=s.nextInt();
            if (choice1==1){
                Register(list);
            }
            else if(choice1==2) {
                login(list);
            }
            else {
                System.out.println("enter a vaild Choice");
            }
        }
    }
}
