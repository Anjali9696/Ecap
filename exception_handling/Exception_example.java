package exception_handling;
import java.util.Scanner;
public class Exception_example {
	public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         System.out.println("Enter value for a");
         int a=scan.nextInt();
         System.out.println("Enter the value for b");
         int b=scan.nextInt();
         int c=a/b;//operation
         System.out.println("The result "+c);
         System.out.println("The program is terminated");
	}

}
