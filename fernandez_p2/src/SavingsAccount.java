
public class SavingsAccount {

    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double value)
    {
        savingsBalance = value;
    }

    public void calculateMonthlyInterest()
    {
        savingsBalance += ((savingsBalance * annualInterestRate) / 12);
    }

    public static void modifyInterestRate(double value)
    {
        annualInterestRate = value;
    }

    public double getBalance()
    {
        return savingsBalance;
    }





//    static void calculateMonthlyInterest() {
//        double monthlyInterestRate = (savingsBalance * annualInterestRate) / 12;
//    }
//
//    public double getSavingsBalance() {
//        return savingsBalance;
//    }
//
//    public void setSavingsBalance(double savingsBalance) {
//        this.savingsBalance = savingsBalance + monthlyInterestRate;
//    }
//    public SavingsAccount(double annualInterestRate, double savingsBalance) {
//
//    }

} //end SavingsAccount class