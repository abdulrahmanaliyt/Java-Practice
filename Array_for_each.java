class Array_for_each
{
	public static void main( String [ ] args ) 
	{
		//int arr [ ] = { 1,2,3,4,5};
		//int sum =0;

		int arr [ ] = new int [5];
		for (int i = 0 ; i<arr.length; i++)
		{
			arr[i] = i+1;
		}
		int sum =0;
		
	//for each loop
		for (int num:arr)
		{
			sum +=num;
		}
		/*for (int i = 0 ; i<=arr.length-1; i++)
		{
			sum +=arr[ i ];
					 
		}*/
		
		System.out.println("Sum of Arrays is = "+sum);
	}
}