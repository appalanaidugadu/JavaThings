//abstract-define,declare
//interface-declare in <1.7v 
//interface-declare,define in >1.8v
@FunctionalInterface    //with functional we can write 1 methos only but here we have different methods(abstract and default) so we can write both
interface Demo
{
    void abc();
    default void show()
    {
        System.out.println("in show");
    }
}
class DemoImp implements Demo
{
    public void abc()
    {
        System.out.println("in abc");
    }
    public void show()
    {
        System.out.println("in DemoImp show");
    }
}
public class DefaultInterface {
    public static void main(String[] args)
    {
        Demo obj=new DemoImp();
        obj.abc();
        obj.show();
        
    }
    
}
