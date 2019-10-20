public class Test {

    //test case for savings account
    public static void main(String[] args)
    {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
//interest rate 4%
        SavingsAccount.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        System.out.println("Saver1's balance is $" + saver1.getBalance());

        saver2.calculateMonthlyInterest();
        System.out.println("Saver2's balance is $" + saver2.getBalance());
        System.out.println();

//interest rate 5%
        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        System.out.println("Saver1's balance is $" + saver1.getBalance());

        saver2.calculateMonthlyInterest();
        System.out.println("Saver2's balance is $" + saver2.getBalance());


    }
}
