package ExceptionHandling;

public class ExceptionDemo 
{
    public static void mian(String[] args)
    {
        try
        {
            int i=7;
            int j=0;
            int k=i/j;
            System.out.println("Output is"+ k);
            System.out.println("Bye");

        }
        catch(ArithmeticException e)          //
        {
            System.err.println("Error");

        }
        finally
        {
            System.out.println("Bye");      //it executes always
        }
    }
    }
