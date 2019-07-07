import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListInterface 
{
    public static void main(String[] args)
    {
        List values=new ArrayList();
        values.add(4);
        values.add(9);
        values.add(6);
    // values.add(2,3);
     /* values.add("2");
        
        for(int i=0;i<values.size();i++)
        {
            System.out.println(values.get(i));
        }*/
  /*   Iterator it=values.iterator();
        while(it.hasNext())
        {
        System.out.println(it.next());
        
        } */
  for(Object o:values){
      System.out.println(o);
  }
    }
}
