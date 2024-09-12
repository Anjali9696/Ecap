package ecap_string;

public class UsingNewCompAddr {

	public static void main(String[] args) {
         String str1=new  String("Anjali");
         String str2=new String("Anjali");
         if(str1==str2) {//comparing the address
        	 System.out.println(" address is different");
         }else {
        	 System.out.println("address is same");
         }
	}

}
