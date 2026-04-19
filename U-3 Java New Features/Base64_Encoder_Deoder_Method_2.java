import java.util.Base64;

class Base64_Encoder_Deoder_Method_2
{
	public static void main (String args [])
	{
		String input = "LEMON";
		
		String encodedOutput =  Base64.getEncoder( ).encodeToString(input.getBytes( ));
		System.out.println("Encoded Output: "+encodedOutput);
	
		byte[ ] bytes = Base64.getDecoder( ).decode(encodedOutput);
		String string = new String(bytes);

		System.out.println("Oringinal String: "+string);
	}
}