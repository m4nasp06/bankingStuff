//

import java.util.Scanner;

public class Bank
{
    Scanner console = new Scanner(System.in);

    private int balance;
    private String name;

    public Bank(String uName, int uBalance)
    {
        name = uName;
        balance = uBalance;
    }


    public void run()
    {
        boolean quit = false;

        while (!quit)
        {

            System.out.println("What would you like to do?");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");

            int choice = console.nextInt();
            console.nextLine();

            if (choice == 1)
            {
                deposit();
            }
            else if (choice == 2)
            {
                withdraw();
            }
            else if (choice == 3)
            {
                quit = true;
            }
            else
            {
                System.out.println("Invalid choice");
            }
        }
    }

    public void deposit()
    {
        System.out.println("How much would you like to deposit?");
        int deposit = console.nextInt();
        console.nextLine();
        balance += deposit;
        System.out.println("Your new balance is " + balance);
    }

    public void withdraw()
    {
        System.out.println("How much would you like to withdraw?");
        int withdraw = console.nextInt();
        console.nextLine();
        balance -= withdraw;
        System.out.println("Your new balance is " + balance);
    }





}