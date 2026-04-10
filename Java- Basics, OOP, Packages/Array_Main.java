class Array_Main 
{
	public static void main( String [ ] args ) 
	{
		int arr [ ] = { 1,2,3,4,5};
		int sum =0;
		for (int i = 0 ; i<=arr.length-1; i++)
		{
			sum +=arr[i];
		}
		System.out.println("Sum of Arrays is = "+sum);
	}
}