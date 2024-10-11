import java.util.Scanner;

public class BankSimulator {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("Enter command (create, deposit, withdraw, balance, exit): ");
            command = scanner.nextLine();

            if (command.equals("create")) {
                System.out.print("Enter account number: ");
                String accountNumber = scanner.nextLine();
                bank.createAccount(accountNumber);
                System.out.println("Account created.");
            } else if (command.equals("deposit")) {
                System.out.print("Enter account number: ");
                String accountNumber = scanner.nextLine();
                System.out.print("Enter amount to deposit: ");
                double amount = scanner.nextDouble();
                scanner.nextLine(); // Clear the buffer
                Account account = bank.getAccount(accountNumber);
                if (account != null) {
                    account.deposit(amount);
                    System.out.println("Deposited: " + amount);
                } else {
                    System.out.println("Account not found.");
                }
            } else if (command.equals("withdraw")) {
                System.out.print("Enter account number: ");
                String accountNumber = scanner.nextLine();
                System.out.print("Enter amount to withdraw: ");
                double amount = scanner.nextDouble();
                scanner.nextLine(); // Clear the buffer
                Account account = bank.getAccount(accountNumber);
                if (account != null) {
                    account.withdraw(amount);
                    System.out.println("Withdrawn: " + amount);
                } else {
                    System.out.println("Account not found.");
                }
            } else if (command.equals("balance")) {
                System.out.print("Enter account number: ");
                String accountNumber = scanner.nextLine();
                Account account = bank.getAccount(accountNumber);
                if (account != null) {
                    System.out.println("Balance: " + account.getBalance());
                } else {
                    System.out.println("Account not found.");
                }
            } else if (command.equals("exit")) {
                break;
            } else {
                System.out.println("Unknown command.");
            }
        }

        scanner.close();
    }
}
