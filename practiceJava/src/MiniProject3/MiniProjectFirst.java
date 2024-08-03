package MiniProject3;

public class MiniProjectFirst {
	private String titile;
	private String Description;
	private boolean status;

	public void MiniProject(String titile, String Description) {
		this.titile = titile;
		this.Description = Description;
		this.status = false;
	}

	public String gettitile() {
		return titile;
	}

	public void setTitile(String titile) {
		this.titile = titile;
	}

	public String getDescription() {
		return Description;

	}

	public void setDescription(String Description) {
		this.Description = Description;
	}

}
