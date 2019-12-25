package string;

public class String_stringbuffer_stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="sumit";
		System.out.println("value of 'st' is: "+st);
		st.concat("kumar");
		System.out.println("after concat 'taver' in st: "+st);
		st=st.concat("kumar");
		System.out.println("after assign value 'taver' in st: "+st);
		
		System.out.println("## Stringbuffer and String builder can change string object as well.");
		String s1="sumit";
		System.out.println("value of s1 is: "+s1);
		StringBuilder sb=new StringBuilder(s1.concat("kumar"));
		System.out.println("value of sb is: "+sb+" stringbuilder can access one thread at a time.");
		StringBuffer sbf=new StringBuffer(s1.concat("taver"));
		System.out.println("value of sbf is: "+sbf+" stringbuffer can access multiple thread and provide thread safety.");
		System.out.println("## Converting Stringbuffer to string back");
		String strb_to_str = sbf.toString();
		System.out.println("## After Converting: "+strb_to_str);
	}

}
