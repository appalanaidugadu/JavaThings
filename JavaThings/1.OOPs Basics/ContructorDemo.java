/*Contructor is a member method
Contructor will never return anything
Same as class name
It will be used to allocate memory
Contructor will be called automatically when object is created */
class Calc1
{
    int num1;
    int num2;
    int result;
   
    public Calc1()
    {
        num1=5;
        num2=7;
    }
    public Calc1(int n)
    {
        num1=n;
        num2=n;    
    }
    public Calc1(double d, int n)
    {
        num1=(int)d;
        num2=n;
    }
}
public class ContructorDemo {
    public static void main(String[] args)
    {
        Calc1 obj=new Calc1(9.5,8);
        System.out.println(obj.num1);
    }
    
}
