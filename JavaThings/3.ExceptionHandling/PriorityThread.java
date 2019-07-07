//MultiThreading | Join | isAlive method
   public class PriorityThread {
   public static void main(String[] args) throws Exception
            {
        Thread t1=new Thread(() ->
                    {
                        for(int i=1;i<5;i++)
                        {
                            System.out.println("Hi");
                            try{Thread.sleep(1000);} catch(Exception e){}
                        }      });  
                    
            Thread t2 = new Thread(() ->
            {
                for(int i=1;i<5;i++)
                {
                    System.out.println("Hello");
                    try{Thread.sleep(1000);} catch(Exception e){}
                }    });
            
                t1.setPriority(Thread.MIN_PRIORITY);
                t2.setPriority(Thread.MAX_PRIORITY);
                /*t1.setPriority(1);
                t2.setPriority(10);
                System.out.println(t1.getPriority());
                System.out.println(t2.getPriority());
                */
                /*   t1.setName("Hi");
                t2.setName("Hello")
                
                System.out.println(t1.getName());
                System.out.println(t2.getName());
                */
                t1.start();
                try{Thread.sleep(10);} catch(Exception e){}
                t2.start();
                
                System.out.println(t1.isAlive());   //it checks the thread is alive or not
                
                t1.join();
                t2.join();
                
                System.out.println("Bye");
            }
                    ;
                }
                
