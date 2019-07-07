/*
Code for how to create reference of super class and object of sub class.
*/
class A1
{
    public void show()
    {
        System.out.println("in A1");
    }
}
class A2 extends A1
    {
    public void show()
    {
        System.out.println("in A2");
    }

}
class A3 extends A2
    {
    public void show()
    {
        System.out.println("in A3");
    }
}
public class DynamicMethodDispatch 
{
    public static void main(String[] args)
    {
        A1 obj=new A2();
        obj.show();
        
        obj=new A3();
        obj.show();
    }
}
//To achieve dynamic method dispatch we have to follow runtime polymorpism 