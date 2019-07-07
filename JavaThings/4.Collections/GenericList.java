import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class GenericList 
{
    public static void main(String[] args)
    {
        List<Integer> values=new ArrayList<Integer>();
        values.add(4);
        values.add(9);
        values.add(6);

  for(Integer o:values){
      System.out.println(o);
  }
    }
}
