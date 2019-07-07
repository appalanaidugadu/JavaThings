//We cant create object to Human class but we can create object for Man class
//When we define abstract method it is compulsory to define it in extended class

abstract class Human
{
    public abstract void eat(); //No need create abtract method everytime but if we create abstract method we must create abstract class.
    public void walk()
    {
        
    }
}
  class Man extends Human
  {
      public void eat()
      {
          
      }
  }

 public class AbstractDemo {
    public static void main(String[] args)
    {
        Human obj=new Man();    //We can create  object for Man using Human referance
        
    }
}
