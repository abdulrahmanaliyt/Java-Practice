package com.example.myproject;
class MyClass 
{
	int attr;
	void setAttr (int attr)
	{
		this.attr = attr;
	}
	int getAttr()
	{
		return attr;
	}
}
class Packages
{
	public static void main (String args[ ] )
	{
	MyClass obj = new MyClass();
	obj.setAttr(34);
	System.out.println(obj.getAttr());
	}
}
