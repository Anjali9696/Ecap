package concept_opps;
     class Parent{
    	 void display(int a)
    	 {
    		 System.out.println(a);
    	 }
     }
     class Child1 extends Parent
     {
    	 void print(int b)
    	 {
    		 System.out.println(b);
    	 }
     }
     class Child2 extends Parent
     {
    	 void show(int c)
    	 {
    		  System.out.println(c);
    	 }
     }
public class Hierarchy {

	public static void main(String[] args) {
		Child1 c1=new Child1();
		c1.display(10);
		c1.print(20);
		Child2 c2=new Child2();
		c2.display(30);
		c2.show(50);

	}

}
