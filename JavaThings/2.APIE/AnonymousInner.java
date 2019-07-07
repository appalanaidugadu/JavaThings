class X
{
    public void show()
    {
        System.out.println("I am X");
    }
}
//class Y extends X
//class Y is replaced with anonymous class with class X object
public class AnonymousInner 
{
    public static void main(String[] args)
    {
        X obj=new X()
                        {
                            public void show()
                            {
                                System.out.println(".I am Y");
                            }
                        };
        obj.show();
    }
}