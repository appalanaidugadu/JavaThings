
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface 
{
    public static void main(String[] args)
    {
        Map map=new HashMap();
        map.put("myName", "Naidu");
        map.put("actor","pspk");
        map.put("Ceo", "Pichai");
        map.put("actor", "Stark");
        System.out.println(map);
     //System.out.println(map.get("actor"));
        Set<String>  keys=map.keySet();
        for(String key:keys)
        {
            System.out.println(key+" "+map.get(key));
        }     
    }
}
