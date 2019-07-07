//In interface we dont define the method, we just declare it.
interface Abc
{
    void show();
}
public class AnonymousInterface {
{
    public static void main(String[] args)
    {
        Abc obj=new Abc()
                        {
                            public void show()
                            {
                                System.out.println("I am Abc");
                            }
                        };
        obj.show();
    }
}
/*Types of interface
1.Normal -many methods
2.Single Abstract Method-single method- Functional Interface-Lambda Expression
3.Marker Interface-no methods
*/