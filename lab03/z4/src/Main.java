import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Konto[] konta = new Konto[5];
        konta[0] = new Konto(1, 100);
        konta[1] = new Konto(2, 100);
        konta[2] = new Konto(3, 100);
        konta[3] = new Konto(4, 100);
        konta[4] = new Konto(5, 100);

        Scanner scanner = new Scanner(System.in);
        int id = -1;

        while (true) {
            System.out.print("Enter an id: ");
            id = scanner.nextInt() - 1;
            if (id < 0 || id >= konta.length) {
                System.out.println("Invalid id");
                continue;
            }
            Konto konto = konta[id];
            while (true) {
                System.out.println("Main menu");
                System.out.println("1: Check balance");
                System.out.println("2: Withdraw");
                System.out.println("3: Deposit");
                System.out.println("4: Exit");
                System.out.print("Enter a choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("The balance is " + konto.getBalance());
                        break;
                    case 2:
                        System.out.print("Enter an amount to withdraw: ");
                        double amount1 = scanner.nextDouble();
                        konto.withdraw(amount1);
                        break;
                    case 3:
                        System.out.print("Enter an amount to deposit: ");
                        double amount2 = scanner.nextDouble();
                        konto.deposit(amount2);
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }

                if (choice == 4) {
                    break;
                }
            }
        }
    }
}