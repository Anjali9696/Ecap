package ecap_methods;

 class Calculator{
	 void add() {// not acccptes input neither return anything
		 int num1,num2,sum;
		 num1=30;
		 num2=20;
		 sum=num1+num2;
		 System.out.println("The sum is"+"  "+sum);
	 }
 } 
	 public class No_Ip_No_Return {

	public static void main(String[] args) {
		Calculator c= new Calculator();
		c.add();
	}

}