class Calc          //Super Class or Parent or Base
{
    public int add(int i, int j)
    {
        return i+j;
    }
}
class CalcAdv extends Calc  //Sub Class or Child or Derived
{
 /*  public int add(int i, int j)
    {
        return i+j;
    }*/
    public int sub(int i, int j)
    {
        return i-j;
    }
}

public class InheritanceDemo {
    public static void main(String[] args)
    {
        CalcAdv c1=new CalcAdv();                    //Calc c1=new Calc();
        int result1=c1.add(5, 6);
        int result2=c1.sub(6, 2);
        
        System.out.println(result1);
        System.out.println(result2);
    }
}
