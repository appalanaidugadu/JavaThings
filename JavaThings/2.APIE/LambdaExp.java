/*
Interface are 3 types
1.Normal
2.Singal abstract method
3.Method
*/
//Now create obj of interface in one line
//And this possible for only interfaces which has only one method
interface Abc1
{
    void show();
}        
public class LambdaExp {
 public static void main(String[] args)
 {
     Abc1 obj=()->System.out.println("This is output for one line object");
     obj.show();
 }
}
