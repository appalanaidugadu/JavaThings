class I
{
    public void show()
    {
        System.out.println("in I");
    }
}
class J extends I
{
    public void show()
    {
        super.show();
        System.out.println("in J");
    }
}
public class MethodOverridingSuper {
    public static void main(String[] args)
    {
        J obj=new J();
        obj.show();
    }
}
