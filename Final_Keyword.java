class MyClass {
	final int attr;

	MyClass (int attr){
		this.attr = attr;
	}
	void myMethod(int param)
	{
		int localVar = 3;
		localVar = 6; // Regular variables can change
	//	attr =7; // This would still be an error because it's final
		param=8;
		
		System.out.print("localVar = " +localVar);
		System.out.print("\nparam = " +param);
		System.out.print("\nattr = " +attr);
	}
}
class Final_Keyword {
	public static void main (String [] args ) {
		MyClass obj = new MyClass(10);
		obj.myMethod(4);
	}
}