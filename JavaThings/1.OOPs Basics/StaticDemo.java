/* Static variables are same for all objects. But non-static are different for all  objects. 
Cannot use non-static variable in static block */

class Emp
{
    int eid;
    int salary;
    static String ceo;
    
    static{
        ceo="Larry";
    }
    public Emp()
    {
        eid=1;
        salary=5000;
    }
    public void show()
    {
        System.out.println(eid+":"+salary+":"+ceo);
    }
}
public class StaticDemo {
    public static void main(String[] args)
    {
        Emp navin=new Emp();
        navin.eid=8;
        navin.salary=6000;
        Emp.ceo="Mahesh";
        
        Emp rahul=new Emp();
        rahul.eid=9;
        rahul.salary=7000;
        Emp.ceo="Mahesh";
        
        Emp prasad=new Emp();
        
        Emp.ceo="Nikhita";
        
        navin.show();
        rahul.show();
        prasad.show();
    }
}
