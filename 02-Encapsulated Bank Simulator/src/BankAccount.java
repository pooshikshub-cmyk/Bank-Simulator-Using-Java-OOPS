class BankAccount {
    private String accountholder;
    private Double balance;

    public BankAccount(String name,Double start_balance){
        this.accountholder=name;
        this.balance=start_balance;
    }

    public double getBalance(){
        return balance;
    }

    public String getName(){
        return accountholder;
    }

    public void deposit(double money){
        if(money>0) {
            balance += money;
        }
        else{
            System.out.println("Sorry User You Entered Invalid Input");
        }
    }
    public void withdraw(double money){
        if(balance>0 && money<=balance && money>0){
            balance-=money;
        }
        else {
            System.out.println("Sorry You Dont Have Enouh Balance to Withdraw");
        }
    }
}
