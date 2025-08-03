package program;
import account.account;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        account account;

        System.out.println("Enter account number: ");
        int accountnumber = scanner.nextInt();
        System.out.println("Enter account holder: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.println();
        System.out.println("Is there na initial deposit (y/n)");
        char response = scanner.next().charAt(0);
        if(response == 'y') {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = scanner.nextDouble();
            account = new account(name, accountnumber, initialDeposit);
        }
        else{
            System.out.println("Account data:");
            account = new account(name, accountnumber);

        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();

        System.out.print("Enter a deposit value: ");
        double deposit = scanner.nextDouble();
        account.deposit(deposit);

        System.out.println("Updated Account data:");
        System.out.println(account);
        System.out.println();
        
        System.out.print("Enter a withdraw value: ");
        double withdraw = scanner.nextDouble();
        account.withdraw(withdraw);
        System.out.println("Updated Account data: ");
        System.out.println(account);




        scanner.close();
    }
}
