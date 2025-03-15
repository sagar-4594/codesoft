import java.util.Scanner;

class ATM {
    private BankAccount bankAccount;

    // Constructor to initialize the ATM with a user's bank account
    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    // Method to display the ATM menu and interact with the user
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        } while (choice != 4);
    }

    // Method to check balance
    private void checkBalance() {
        System.out.println("Current Balance: " + bankAccount.checkBalance());
    }

    // Method to deposit money into the account
    private void deposit(Scanner scanner) {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        bankAccount.deposit(amount);
    }

    // Method to withdraw money from the account
    private void withdraw(Scanner scanner) {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        bankAccount.withdraw(amount);
    }
}
