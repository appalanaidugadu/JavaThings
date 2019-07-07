package ExceptionHandling;


public class MultipleException 
{
    public static void mian(String[] args)
    {
        try
        {
            int a[]=new int[6];
            a[6]=8;
            int i=7;
            int j=0;
            int k=i/j;
            System.out.println("Output is"+ k);
            System.out.println("Bye");

        }
        catch(ArithmeticException e)          //
        {
            System.err.println("Cants divide by zero");

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in your limits");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong");
        }
        finally
        {
            System.out.println("Bye");      //it executes always
        }
    }
    }
