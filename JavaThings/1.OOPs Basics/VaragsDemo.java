class Calc2
{
    public int add(int ... n)   //Here it takes {2,3,4,5,6,7}
    {
        int sum=0;
        for(int i: n)
        {
            sum=sum+i;
        }
        return sum;
    }
}
public class VaragsDemo
{
    public static void main(String[] args)
    {
        Calc2 obj=new Calc2();
        System.out.println(obj.add(2,3,4,5,6,7,8));
    }
}