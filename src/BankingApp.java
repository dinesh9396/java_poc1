import java.util.Scanner;


public class BankingApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BankAccount account = new BankAccount(1000.00);

        int menuOption = 0;


        while (menuOption != 4) {
            System.out.println("\nMenu Options:");
            System.out.println("1. Account Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.println("Choose the menu option for banking:");

            menuOption = input.nextInt();

            switch (menuOption) {
                case 1:
                    account.showBalance();
                    break;

                case 2:
                    System.out.println("Enter Withdrawal amount:");
                    double withdrawalAmount = input.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;

                case 3:
                    System.out.println("Enter Deposit amount:");
                    double depositAmount = input.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 4:
                    System.out.println("Exiting the banking system. Thank you!");
                    break;

                default:
                    System.out.println("Invalid option. Please choose a valid menu option.");
            }
        }

        input.close();
    }
}
