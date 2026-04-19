import java.lang.annotation.*;

@Target(ElementType.TYPE) //TYPE mesns on Class
@interface ClassAnnotation
{
	int noFields( );
	int noMethods( );
	int noConstructors( );
}
@ClassAnnotation(noFields=2,noMethods=2,noConstructors=1)
class MyClass
{
	int attr1;
	int attr2;

	MyClass( int attr1, int  attr2)
	{
		this.attr1 = attr1;
		this.attr2 = attr2;
	}
	void display ()
	{
		System.out.println(attr1+ ": "+attr2);
	}
}
class Use_of_Target
{
	public static void main (String args [ ] )
	{
		MyClass obj = new MyClass (23,24 );
		obj.display( );
	}
}