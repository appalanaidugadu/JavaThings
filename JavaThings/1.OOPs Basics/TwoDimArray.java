public class TwoDimArray 
{
    public  static void main(String[] args)
    {
         int d[][]={
             {1,2,4,9,5},
             {3,5,7,2},
             {4,2,2}
         };
         for(int i=0;i<d.length;i++)
         {
             for(int j=0;j<d[i].length;j++)
             {
                 System.out.println(" "+d[i][j]);
             }
             System.out.println();
         }
    }
   
}
