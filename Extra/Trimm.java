package Extra;

public class Trimm {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 String original = "  content sd ";
		 String withoutWhitespace = original.trim();
		 System.out.println(withoutWhitespace);
		 
		 String s = "   this has spaces at the beginning and at the end      ";
		 String result = s.replaceAll("\\s+$", "");
		 System.out.println(result);   

	}

}
