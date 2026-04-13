interface IMathOps 
{
	double doOp(double num);
}
public class MethodReference_Static_method
{
	static double square(double num) 
	{
		return num*num;
	}
	static double performOperation(IMathOps ref, double n) 
	{
		return ref.doOp(n);
	}
	public static void main(String[] args) 	
	{
		double resultSqrt, resultCbrt, resultSquare;
		resultSqrt = performOperation(Math::sqrt, 16);
		resultCbrt = performOperation(Math::cbrt, 27);
		resultSquare = performOperation(MethodReference_Static_method::square, 5);
		System.out.println("Square Root of 16: "+resultSqrt);
		System.out.println("Cube Root of 27: "+resultCbrt);
		System.out.println("Square of 5: "+resultSquare);
	} 
}
