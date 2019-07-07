import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Stud implements Comparable<Stud>
{
    int rollno,marks;
    String name;
    
    public Stud(int rollno, String name, int marks)
    {
        super();
        this.rollno=rollno;
        this.marks=marks;
        this.name=name;
    }
    @Override
    public String toString(){
        return "Stud[rollno="+ rollno +",marks="+marks+",name="+name+"]";
    }
    public int compareTo(Stud s)
    {
        return name.length()>s.name.length()?1:-1;
    }
}
public class ComparableInterface {
    public static void main(String[] args)
    {
        List<Stud>studs=new ArrayList<>();
        studs.add(new Stud(23,"Mahesh",55));
        studs.add(new Stud(25,"Mahesh",65));
        studs.add(new Stud(27,"Mahesh",51));
        studs.add(new Stud(22,"Mahesh",59));
        
        Collections.sort(studs,(i,j)->i.marks>j.marks?1:-1);
        
        for(Stud s: studs)
        {
            System.out.println(s);
        }
    }
}
