interface Payment 
{
    public void pay (double amount);
}

class Online implements Payment
{
    private String email;
    private String password;
    
    public Online(String email, String password)
    {
        super();
        this.email = email;
        this.password = password;
    }
    public void pay (double amount)
    {
        System.out.println("Paid using online account: " + amount);
    }
}

class Mobile implements Payment
{
    private String number;
    private int pin;
    
    public Mobile (String number, int pin)
    {
        super();
        this.number = number;
        this.pin = pin;
    }
    
    public void pay(double amount)
    {
        System.out.println("Paid using mobile wallet: " + amount);
    }
}

class Cart
{
    private double amount;
    public Cart(double amount)
    {
        this.amount = amount;
    }
    
    public void pay(Payment mode)
    {
        mode.pay(amount);
    }
}

public class testStrategy 
{
    public static void main (String []harjit)
    {
        Cart cart = new Cart(1512.75);
        cart.pay(new Online("youremail@gmail.com", "yourpassword123"));
        cart = new Cart(375.25);
        cart.pay(new Mobile("0123456789", 1001));
    }
}
