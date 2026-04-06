class String_Class_Demo
{
	public static void main(String  ... args )
	{
		String str = "Meerut";
		String str1 = new String();
		str1 = str;
		System.out.println(str1);
		String str2 = new String("Delhi");
		System.out.println(str2);

		char [ ] arr = {'P', 'U', 'N', 'E'};
		String str3 = new String(arr);
		System.out.println(str3);

		byte [ ] byteArr = { 65,91,66,92};
		String str4 = new String(byteArr );
		System.out.println(str4);
		//Meerut
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		System.out.println(str.substring(0,4));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		//str = str1
		String str5 = new String(str);
		System.out.println(str.equals(str));
		System.out.println(str==str5);
		str5= "meeRut";
		System.out.println(str.equalsIgnoreCase(str5));

		System.out.println(str.lastIndexOf("e"));
		System.out.println(str.startsWith("M"));
		System.out.println(str.endsWith("m"));
		System.out.println("    Abdul  ".trim());
		System.out.println("abdul Ramhan".replace('a','A'));

	}

}