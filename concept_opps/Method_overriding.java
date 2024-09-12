package concept_opps;
        class Bank
        {
        	int getROI()// defination//signature
        	{
        		return 0;
        	}
        }
        class SBI extends Bank
        {
        	int getROI()
        	{
        		return 100;
        	}
        }
        class ICICI extends Bank
        {
        	int getROI()
        	{
        		return 15;
        	}
        }
             public class Method_overriding {
	public static void main(String[] args) {
		SBI sbiobj=new SBI ();
		System.out.println(sbiobj.getROI());
		ICICI iciciobj=new ICICI ();
		System.out.println(iciciobj.getROI());
		Bank ban=new Bank();
		System.out.println(ban.getROI());
		
	}

}
