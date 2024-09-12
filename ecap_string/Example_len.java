package ecap_string;

public class Example_len {

	public static void main(String[] args) {
    //calculate the length
		String str1="Anjali";
		String str2="Chinchole";
		System.out.println(str1.length());
		//convert to upper-case
		System.out.println(str1.toUpperCase());
		//convert to lower-case
		System.out.println(str1.toLowerCase());
		//to concat two string or combine +
		System.out.println( str1+"  "+str2);
		System.out.println(str1.concat(" ").concat(str2));

	}

}
