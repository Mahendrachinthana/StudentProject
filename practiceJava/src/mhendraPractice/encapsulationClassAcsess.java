package mhendraPractice;

public class encapsulationClassAcsess {
	int empi=103;
	String empn="mahendra";
	double emps=100000.0;
		

	public static void main(String[] args) {
	
		EncapsulationDemo n=new EncapsulationDemo();
		n.setempn("mahendra");
		n.setempi(1002);
		n.setemps(10000.00);
		//System.out.println("this is empid number : "+n.empi);
		//System.out.println("this is emp name : "+n.empn);
		//System.out.println("this is emp salary : "+n.emps);
		
		
		System.out.println("this is uged method id "+n.getempi());
		System.out.println("this is uge of method em name"+n.getempn());
		System.out.println("this is uge for mehtod em salary : "+n.getemps());
		
		

	}

}
