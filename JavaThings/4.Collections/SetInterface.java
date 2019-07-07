import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
//In set we cant add duplicate elements
//HashSet will not give you the elements in sequence
//If we want to store in ascending order we can use TreeSet
public class SetInterface
{
    public static void main(String[] args)
    {
       // Set<Integer> values=new HashSet<>();
        Set<Integer> values=new TreeSet<>();
        
        System.out.println(values.add(87));
        System.out.println(values.add(97));
        System.out.println(values.add(32));
        System.out.println(values.add(93));
        for(int i:values)
        {
            System.out.println(i);
        }
    }
}
