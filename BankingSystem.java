import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0.0;// initial balance
        int choice;
        System.out.println();
        System.out.println("Simple Banking System");
        System.out.println();
        do {
            System.out.println("\n Choose an option");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            System.out.println();
            choice = sc.nextInt();
            switch (choice) {
                case 1:// deposit
                    System.out.println("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Amount deposited successfully");
                        System.out.println("Your current balance is:" + balance);
                    } else {
                        System.out.println("Invalid deposit amount");
                    }
                    break;
                case 2:// withdraw
                    System.out.println("Enter the amount to withdraw");
                    double withdraw = sc.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Amount withdrawn successfully");
                        System.out.println("Your current balance is:" + balance);

                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance");

                    } else {
                        System.out.println("Invalid withdrawal amount");
                    }
                    break;
                case 3:// check balance
                    System.out.println("Your current balance is: " + balance);
                    break;
                case 4:// Exit
                    System.out.println(
                            "Thank you so much for using my simple banking system. I appreciate it.\n Garima Thapa");
                    break;
                default:
                    System.out.println("Invalid choice .please try again.");
            }
        } while (choice != 4);

    }
}