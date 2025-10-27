package ques2_12;
public class Ques2_12 
{
    public static void f1()
    {
        try
        {
            f2();
        }
        catch(Exception e)
        {
            System.out.println("Checked Exception handled in f1");
        }
    }
    public static void f2() throws Exception
    {
        f3();
    }
    public static void f3() throws Exception
    {
        throw new Exception();
    }
    public static void main(String[] args) 
    {
        f1();
    }
}
