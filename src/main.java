//


import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);


        bankIntro();

        getUserName();
        String name = console.nextLine();

        balance();
        int balance = console.nextInt();
        console.nextLine();


        User user1 = new User(name, balance);

        Bank bank = new Bank(user1.getName(), user1.getBalance());



        bank.run();


    }

    public static void bankIntro()
    {
        System.out.println("Welcome to the Bank of Java");
        System.out.println("We are here to help you");
    }

    public static void getUserName()
    {
        System.out.println("What is your name?");
    }

    public static void balance()
    {
        System.out.println("What is your balance?");
    }
}