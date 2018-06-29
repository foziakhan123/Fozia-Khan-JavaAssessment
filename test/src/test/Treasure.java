package test;

public class Treasure extends Features {
	 
	private String toy;
	private String box; // Here i am displaying the treasures in which i will have
	
	public Treasure(String toy, String box) {
		super();
		this.toy = toy;
		this.box = box;
	} // building the actual treasures

	
	@Override
	public String toString() {
	return "Treasure [toy=" + toy + ", box=" + box + "]";
	} // enabling a ToString method 
	
	
	public String getToy() {
		return toy;
	}

	public void setToy(String toy) {
		this.toy = toy;
	}

	public String getBox() {
		return box;
	}

	public void setBox(String box) {
		this.box = box;
	}

	
	
	
		

}
