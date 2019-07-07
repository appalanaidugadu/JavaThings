class P
{
    public void show()
    {
        System.out.println("in P");
    }
}
class Q extends P
{
    public void show()
    {
        System.out.println("in Q");
    }
}
public class MethodOverriding {
    public static void main(String[] args)
    {
        Q obj=new Q();
        obj.show();
    }
}

/*
Based on the parameters-Method Overloading
Based on the objects-Method Overidding
Both of the above methods comes under polymorphism.
Same name is behaving differently at different times.(Polymorphism)
*/