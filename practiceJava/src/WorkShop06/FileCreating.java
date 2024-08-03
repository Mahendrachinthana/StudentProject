package WorkShop06;

import java.io.File;
import java.io.IOException;

public class FileCreating {

	public static void main(String[] args) throws IOException {
		System.out.println("this is method");
		
		File f = new File("c:\\Users\\mahen\\OneDrive\\Desktop\\mahijava\\hello.pdf  ");
		boolean status = f.mkdir();
		if(! f.exists()) {
					boolean status =f.createNewFile();
					if(status) {
						System.out.println(" file create sucsussfully");
					}
		}else {
			System.out.println("file alredy creare!!");
			
		}
		
	}

}
 