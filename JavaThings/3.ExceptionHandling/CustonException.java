
package ExceptionHandling;

public class CustonException {

    public static void main(String[] args) {
        int i,j;
        i=8;
        j=9;
        try
        {
            int k=i/j;
            if(k==0)
                throw new PrasadException("This is not Possible");
            System.out.println(k);            
        }
        catch(PrasadException e)
        {
            System.out.println("Error "+e.getMessage());
        }
    }
    
}
