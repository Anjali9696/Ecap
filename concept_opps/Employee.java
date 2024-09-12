package concept_opps;

public class Employee {
	//variables
	int eid;
	String ename;
	String ejob;
	int sal;
	//methods
	 void display () {
		 System.out.println(eid);
		 System.out.println(ename);
		 System.out.println(ejob);
		 System.out.println(sal);
	 }
	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.eid=101;
		emp1.ename="Anjali";
		emp1.ejob="Tester";
		emp1.sal=20000;
		emp1.display();		
		
		Employee emp2=new Employee();
		emp2.eid=102;
		emp2.ename="Tejas";
		emp2.ejob="Tester";
		emp2.sal=50000;
		emp2.display();
	}
	
}