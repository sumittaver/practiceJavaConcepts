package string;

public class String_to_char_array_to_string {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String st = "sumit";
		System.out.println("String value is: "+st);
		char[] ch = st.toCharArray();
		String st2= new String(ch);
		System.out.println("Converted char array 'ch' to string: "+st2);
	}

}
