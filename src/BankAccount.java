public class BankAccount {
        private double accountBalance;

        // Constructor
        public BankAccount(double initialBalance) {
            this.accountBalance = initialBalance;
        }


        public void showBalance() {
            System.out.println("Your account balance: Rs. " + accountBalance);
        }


        public void withdraw(double amount) {
            if (amount <= accountBalance) {
                accountBalance -= amount;
                System.out.println("Amount Rs. " + amount + " has been withdrawn. Updated balance: Rs. " + accountBalance);
            } else {
                System.out.println("Insufficient balance.");
            }
        }


        public void deposit(double amount) {
            accountBalance += amount;
            System.out.println("Amount Rs. " + amount + " has been deposited. Updated balance: Rs. " + accountBalance);
        }
}
