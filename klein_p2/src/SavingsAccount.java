public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public void setSavingsBalance(double amount) {
        savingsBalance = amount;
    }

    public void calculateMonthlyInterest(){
        savingsBalance = ((savingsBalance * annualInterestRate) / 12) + savingsBalance;
    }

    public static void modifyInterestRate(double newValue){
        annualInterestRate = newValue;
    }

    public double getBalance(){
        return savingsBalance;
    }
}
