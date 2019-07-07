//Final keyword can  be used with methods, variables and classes
class  P
{
    final int i=0;  //It means i is constant
    public P()
    {   //i=10 it cannot work here
    }
}
public class FinalKeyword {
    public static void main(String[] args)
    {
        P obj =new P();
    }
}
//Similarly we can use final with methods and classes. So that no one can modify