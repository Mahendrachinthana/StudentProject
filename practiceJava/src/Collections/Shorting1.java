package Collections;

public class Shorting1 {

	private int Ram;
	private String compenyname;
	private int pyment;

	@Override
	public String toString() {
		return "Shorting1 [ram=" + Ram + ", compenyname=" + compenyname + ", pyment=" + pyment + ", getRam()="
				+ getRam() + ", getCompenyname()=" + getCompenyname() + ", getPyment()=" + getPyment() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Shorting1(int ram, String compenyname, int pyment) {
		super();
		this.Ram = Ram;
		this.compenyname = compenyname;
		this.pyment = pyment;
	}

	public int getRam() {
		return Ram;
	}

	public void setRam(int ram) {
		this.Ram = Ram;
	}

	public String getCompenyname() {
		return compenyname;
	}

	public void setCompenyname(String compenyname) {
		this.compenyname = compenyname;
	}

	public int getPyment() {
		return pyment;
	}

	public void setPyment(int pyment) {
		this.pyment = pyment;
	}

}
