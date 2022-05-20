public class User
{
    private int balance;
    private String name;

    public User(String uName, int uBalance)
    {
        name = uName;
        balance = uBalance;
    }

    public String getName()
    {
        return name;
    }

    public int getBalance()
    {
        return balance;
    }
}
