//When you create object of sub class it is calling constructor of subclass and it is also calling constructor of super class
class A{
    public A(){
        System.out.println("In A");
    }
    public A(int i)
    {
        System.out.println("In A int");
    }
}
class B extends A{
    public B(){
        super();    //super(5);    output will be "in A int  and in B"
        System.out.println("In B");
    }
     public B(int i)
    {   super(i);    
        System.out.println("In B int");
    }
}
public class SuperDemo {
    public static void main(String[] args)
    {
        B obj1=new B(5);        //B obj1=new B();
    }
}
