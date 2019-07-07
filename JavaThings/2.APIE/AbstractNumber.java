class AnyNum
{
    public void show(Number i)  //When we use Number keyword we can print any number
    {
        System.out.println(i);
    }
}
public class AbstractNumber {
    public static void main(String[] args)
    {
        AnyNum obj=new AnyNum();
        obj.show(5.4);
    }
    
}
/* Abstract class example
abstract class Writer
{
}
class Pen extends Writer
{
}
class Pencil extends Writer
{
}
*/