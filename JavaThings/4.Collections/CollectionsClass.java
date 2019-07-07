import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class CollectionsClass
{
    public static void main(String[] args)
    {
        List<Integer> values=new ArrayList<Integer>();
        values.add(408);
        values.add(997);
        values.add(615);
        values.add(754);
       Comparator<Integer> c=(i,j)->i%10>j%10?1:-1;     //This line is  replaced with the below long comments
    /*    Comparator<Integer> c=new Comparator<Integer>()
        {
            public int compare(Integer i, Integer j) 
            {
                if(i%10>j%10)
                    return 1;
                else
                    return -1;
            }
        };
        */
        Collections.sort(values,c); //Here the comparator is used to implement custom sorting technique
   /*  Collections.sort(values);
        Collections.reverse(values);    //To reverse the list
        Collections.shuffle(values);
        */
  for(Integer o:values){    
      System.out.println(o);
  }
    }
}
