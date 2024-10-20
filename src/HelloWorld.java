import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Simple Bank System POC");

        double account_balance = 1000.00;

        Scanner input = new Scanner(System.in);
        int menuOption = 0;

        while (menuOption != 4) { // 4 will be used to exit
            System.out.println("\nMenu Options:");
            System.out.println("1. Account Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.println("Choose the menu option for banking:");

            menuOption = input.nextInt();

            switch (menuOption) {
                case 1:
                    System.out.println("Your account balance: Rs. " + account_balance);
                    break;

                case 2:
                    System.out.println("Enter Withdrawal amount:");
                    double withdrawalAmount = input.nextDouble();
                    if (withdrawalAmount <= account_balance) {
                        account_balance -= withdrawalAmount;
                        System.out.println("Amount Rs. " + withdrawalAmount + " has been deducted. Your updated balance: Rs. " + account_balance);
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;

                case 3:
                    System.out.println("Enter Deposit amount:");
                    double depositAmount = input.nextDouble();
                    account_balance += depositAmount;
                    System.out.println("Amount Rs. " + depositAmount + " has been added. Your updated balance: Rs. " + account_balance);
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
