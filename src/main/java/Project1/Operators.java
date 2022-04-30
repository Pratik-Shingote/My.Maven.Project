package Project1;

public class Operators {
	public int add(int x,int y)
	{
		System.out.println("The addition of no :"+(x+y));
		return x;
	}
	public double sub(double a,double b)
	{
		System.out.println("Thw subtraction of no: "+(a-b));
		return a;
	}
	public double mul(double c,double d)
	{
		System.out.println("The multiplication of no :"+(c*d));
		return c;
	}
	public int div(int e,int f)
	{
		System.out.println("The division of no :"+(e/f));
		return e;
	}
	public static void main(String[] args) {
		
		Operators o=new Operators();
		o.add(20, 30);
		o.sub(555, 200);
		o.mul(500, 100);
		o.div(5, 5);
	}
}
