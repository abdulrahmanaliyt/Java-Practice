import java.util.Base64;

class Base64_Encoder_Deoder
{
	public static void main (String args [])
	{
		Base64.Encoder encoder = Base64.getEncoder( );
		Base64.Decoder decoder = Base64.getDecoder( );

		String input = "LEMON";
		
		String encodedOutput = encoder.encodeToString(input.getBytes( ));
		System.out.println("Encoded Output: "+encodedOutput);
	
		byte[ ] bytes = decoder.decode(encodedOutput);
		String string = new String(bytes);

		System.out.println("Oringinal String: "+string);
	}
}