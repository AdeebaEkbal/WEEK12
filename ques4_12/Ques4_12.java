package ques4_12;
class InvalidAgeException extends Exception
{
    
}

public class Ques4_12 
{
    public static void f(int age) throws InvalidAgeException  
    {
        if(age<18)
        {
            throw new InvalidAgeException ();
        }
        else
        {
            System.out.println("Vote...");
        }
    }
    public static void main(String[] args) 
    {
        int age=16;
        
        try
        {
            f(age);
        }
        catch(InvalidAgeException  e)
        {
            System.out.println("Age is less than 18");
        }
    }
}
