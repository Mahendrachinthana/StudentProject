package appsongproject;

public class Song {
	String titile;
	double duration;
	 public Song(String titile ,double duration) {
		 this.titile=titile;
		 this.duration=duration;
		 

	 }
	 public Song() {
		 
		 
	 }
	 public String gettitile() {
		 return titile;
	 }
	 //public void setname(String name) {
		 
		 
	// }
	 public double getduration() {
		 return  duration;
	 }
	// public void setduration(double duration) {
		 
	// }
	 public String toString() {
		return "song{"+"titile ="+titile+"duration="+duration+"}";
		 
	 }
	 
	 	
	 
}
	 	
