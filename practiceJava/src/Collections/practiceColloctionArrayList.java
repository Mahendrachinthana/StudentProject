package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class practiceColloctionArrayList {

	public static void main(String[] args) {
		 Collection <String> student=new ArrayList<>();
		 
		 student.add("mahendra");
		 student.add("lokesh");
		 student.add("karimmulla");
		 student.add("manoj");
		 student.add("manohar");
		 student.add("malakondaiah");
		 Collection <String> girls=new ArrayList<>();
		 girls.add("ramya");
		 girls.add("pravalika");
		 girls.add("nandhu");
		 girls.add("lavanya");
		 girls.add("siresha");
		 girls.add("vani");
		 Collection<String>boys=new ArrayList<>();
		 student .clear();
		 boys.addAll(student);
		 boys.addAll(girls);
		 boys.remove(student);

		 System.out.println(boys);
		 System.out.println(girls);
		 Collection<String>cheldrans=new ArrayList<>();
		 cheldrans.add("chintu");
		 cheldrans.add("bujji");
		 
		 
		 if (boys. containsAll(boys)) {
			 System.out.println("this name is found");
		 }else {
			 System.out.println("this  is not found");
		 }
	}

	
	
}
