package ecap_string;

public class Example_string {

	public static void main(String[] args) {
        String str1="Anjali";
        String str2="Anjali";
        // if we have to compare two string  address we use == opertor
		//if(str1==str2)
			//to compare data we have  to use ".equals" method
        if(str1.equals(str2))
		{
			System.out.println("address is same");
		}else {
			System.out.println("address is different");
		}
		
	}

}
// as java is case sensitive language 
//even if we change the case it goes to the different address
