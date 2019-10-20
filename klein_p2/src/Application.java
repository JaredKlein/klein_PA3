public class Application {
    public static void main (String [] args){
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        saver1.setSavingsBalance(2000.0);
        saver2.setSavingsBalance(3000.0);

        saver1.modifyInterestRate(.04);
        saver2.modifyInterestRate(.04);
        for (int i = 0; i < 11; i++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }

        System.out.println("Saver1 balance is: " + saver1.getBalance());
        System.out.println("Saver2 balance is: " + saver2.getBalance());

        saver1.modifyInterestRate(.05);
        saver2.modifyInterestRate(.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Saver1 balance is: " + saver1.getBalance());
        System.out.println("Saver2 balance is: " + saver2.getBalance());
    }
}
