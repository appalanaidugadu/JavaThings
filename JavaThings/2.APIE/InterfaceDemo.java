//When a method does nothing rather than defining we can simply declare it using abstract method
//We use extends in Inheritance but in Interface we use implements
//We cant create object with interface we can only create reference to the object
//In interface we cant define methods but in abstract we can define and declare. 
//But after java 1.8 version we can define methods in java.
interface Writer    //abstract class Writer
{
    public abstract void write();   
}
class Pen implements Writer    //class Pen extends Writer
{
    public void write()
    {
        System.out.println("Im a Pen ");
    }
}
class Pencil implements Writer    //class Pencil extends Writer
{
    public void write()
    {
        System.out.println("Im a Pencil ");
    }
}
class Kit
{
    public void doSomething(Writer p)
    {
        p.write();
    }
}
public class InterfaceDemo
{
    public static void main(String[] args)
    {
        Kit k=new Kit();
        Writer p=new Pen();
        Writer pc=new Pencil();
        k.doSomething(pc);
    }
}