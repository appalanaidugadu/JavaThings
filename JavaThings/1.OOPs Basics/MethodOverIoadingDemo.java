class Casio
{
	public void add(int i, int j)
	{
		System.out.println(i+j);
		}
	 public void add(int i, int j, int k)
	{
		System.out.println(i+j+k);
	}
	public void add(double i,double j)
	{
		System.out.println(i+j);
	}
	public void add(int i, int j,String op)
	{
	System.out.println(i+j+op);
	}
}
public class MethodOverIoadingDemo
{
	 public static void main(String[] args)
	 {
	 	Casio obj = new Casio();
	 	obj.add(5,2);
	 	obj.add(4,3,5);
	 	obj.add(4.5,3.8);
	 	obj.add(4,5,"add");
	 }
}