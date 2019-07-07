class Student
{
   private  int rollno;
   String name;
    //Getters and Setters are used to get and set values
    public void setRollno(int r)
    {
        rollno=r;
    }
    public int getRollno()
    {
        return rollno;
    }
}
public class EncapsulationDemo {
    public static void main(String[] args)
    {
        Student s1=new Student();
        s1.setRollno(2);
        s1.name="Navin";
        
        System.out.println(s1.getRollno());
    }
}
