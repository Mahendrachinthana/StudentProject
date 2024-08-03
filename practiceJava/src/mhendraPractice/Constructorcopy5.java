package mhendraPractice;

public class Constructorcopy5 {
	int sid;
	String sname;
	Constructorcopy5(){
		System.out.println("no args");
		
	}
    Constructorcopy5(int sid,String sname)	{
		 this.sid=sid;
		 this.sname=sname;
    }
    Constructorcopy5(Constructorcopy5 n){
    	sid=n.sid;
    	sname=n.sname;
    }
    	

		public static void main(String []args) {
			Constructorcopy5 m=new Constructorcopy5(58,"mahi");
			System.out.println(m.sid);
			System.out.println(m.sname);
			Constructorcopy5 m1=new Constructorcopy5(m);
			System.out.println(m1.sid);
			System.out.println(m1.sname);
			
			
			
		}
			
		}
			
		

