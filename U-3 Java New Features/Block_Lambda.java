interface ICompare 
{
	String compare(int a, int b);
}
public class Block_Lambda
{
	public static void main(String[] args) 
	{
		ICompare compareNumbers = (a, b) -> {
			if (a > b) {
				return a + " is greater than " + b;
			} 
			else if (a < b) {
				return a + " is less than " + b;
			} 
			else {
				return a + " is equal to " + b;
			}
		};
		System.out.println(compareNumbers.compare(34, 56));
	}
}