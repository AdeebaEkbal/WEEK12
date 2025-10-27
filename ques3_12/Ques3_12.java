package ques3_12;
class InsufficientFundsException extends Exception
{
    
}

public class Ques3_12 
{
    public static void f(int withdrawn,int balance) throws InsufficientFundsException 
    {
        if(withdrawn>balance)
        {
            throw new InsufficientFundsException();
        }
        else
        {
            System.out.println("Current balance:" +(balance-withdrawn));
        }
    }
    public static void main(String[] args) 
    {
        int balance=500;
        int withdrawn=600;
        
        try
        {
            f(withdrawn,balance);
        }
        catch(InsufficientFundsException e)
        {
            System.out.println("More money is withdrawn than available");
        }
    }
}
