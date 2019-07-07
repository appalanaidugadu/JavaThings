public class EnhancedForTwoDimArray {
        public  static void main(String[] args)
    {
         int d[][]={
             {1,2,4,9,5},
             {3,5,7,2},
             {4,2,2}
         };
        for(int k[]:d)                
         {
             for(int l: k)
             {
                 System.out.println(" "+l);
             }
             System.out.println();
         }
    }
   
}
