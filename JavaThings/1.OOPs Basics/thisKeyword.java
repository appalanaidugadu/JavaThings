class Calc3
{
    int num1;
    int num2;
    int result;
  
    public Calc3(int num1,int num2)
    {
        this.num1=num1;
        this.num2=num2;   
    }
public class thisKeyword{
    public void main(String[] args)
    {
        Calc3 obj=new Calc3(9,8);
        System.out.println(obj.num1);
        System.out.println(obj.num2);
    }
    
}
}
