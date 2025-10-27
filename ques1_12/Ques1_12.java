package ques1_12;
public class Ques1_12 
{
    public static void function()
    {
        try
        {
            for(int i=5;i>=0;i--)
            {
                System.out.println(100/i);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Example of Unchecked Exception");
        }
    }
    public static void main(String[] args) 
    {
        function();
    }
}
