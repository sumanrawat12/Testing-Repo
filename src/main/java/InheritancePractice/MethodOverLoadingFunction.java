package InheritancePractice;

public class MethodOverLoadingFunction {
	public static void main(String args[])
	{
		System.out.println("First "+ addition(2,2));
		System.out.println("Second "+ addition(1,2,3));
		System.out.println("Third "+ addition(1,2,3));
		//System.out.println("Four "+ addition(1,2865,"suman"));
	}

	public static int addition(int a,int b)
	{
		return a+b;
	}

	public static int addition(int b,int c,int e)
	{
		return b*c+e;
	}

	double addition(double a,double b,double c) {
		return a+b+c;
	}

	/*NOT VALID OVERLOADING
	 * void addition (int a,double b,String s){ return ('a'+'b'+'s'); }
	 */
}
