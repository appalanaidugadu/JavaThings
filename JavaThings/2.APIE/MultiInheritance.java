class Calc1          //Super Class or Parent or Base
{
    public int add(int i, int j)
    {
        return i+j;
    }
}
class Calc2 extends Calc  //Sub Class or Child or Derived
{
    public int sub(int i, int j)
    {
        return i-j;
    }
}
class CalcVeryAdv extends CalcAdv
{
    public int multi(int i,int j)
    {
        return i*j;
    }
}
public class MultiInheritance {
    public static void main(String[] args)
    {
        CalcVeryAdv c1=new CalcVeryAdv();                    //Calc c1=new Calc();
        int result1=c1.add(5, 6);
        int result2=c1.sub(6, 2);
        int result3=c1.multi(2,3);
        
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        
    }
}
