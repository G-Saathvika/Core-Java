public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Saathvika",5000);
        BankAccount bobAccount = new BankAccount("Bob Robinson");

        bobAccount.deposit(500);
        System.out.println("owner: "+bobAccount.getOwner());
        System.out.println("balance: "+bobAccount.getBalance());

        bobAccount.withdraw(1000);
        System.out.println("owner: "+bobAccount.getOwner());
        System.out.println("balance: "+bobAccount.getBalance());
        System.out.println();

        System.out.println("owner: "+myAccount.getOwner());
        System.out.println("balance: "+myAccount.getBalance());
        System.out.println();

        System.out.println("Deposit 1000");
        myAccount.deposit(1000);

        System.out.println("owner: "+myAccount.getOwner());
        System.out.println("balance: "+myAccount.getBalance());



    }
}
