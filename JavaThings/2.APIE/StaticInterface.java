//if we create a variable inside a interface it becomes a constant.
//Here we use static method in interface so that we dont need to create an object to call that static method
@FunctionalInterface
interface Ex
{
    int num=8;
    void abc();
    
    static void show()
    {
        System.out.println("Hii");
    }
}
class Example implements Ex
{
    public void abc()
    {
        num=9;
    }
}
public class StaticInterface {
    public static void main(String[] args)
    {
        Ex.show();
    }
}
