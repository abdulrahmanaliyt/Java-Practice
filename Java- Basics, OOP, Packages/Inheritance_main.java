class Super
{
	int sup;
	
	void setSup(int sup)
	{
		this.sup = sup;
	}
	int getSup()
	{
		return sup;
	}
}
class Sub extends Super
{
	int sub;

	void setSub(int sub)
	{
		this.sub = sub;
	}
	int getSub()
	{
		return sub;
	}
}
class Inheritance_main
{
	public static void main(String args[])
	{
		Sub obj = new Sub();
		obj.setSup(97);
		System.out.println("Super Class Inheritance");
		System.out.println(obj.getSup());

		obj.setSub(98);
		System.out.println("Sub Class Inheritance");
		System.out.println(obj.getSub());
	}
}