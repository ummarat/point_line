package prj1;

public class CPlane extends CVechicle{
	private int height;
	private int numPass;
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getNumPass() {
		return numPass;
	}
	public void setNumPass(int numPass) {
		this.numPass = numPass;
	}
	
	public CPlane() {
		super();
	}
	
	public CPlane(float price, float speed, int year, int height, int numPass) {
		super(price, speed, year);
		this.height = height;
		this.numPass= numPass;
	}
	
	
	public String move() {
		return "Самолет взлетел";
	}
	@Override
	public String toString() {
		return "CPlane [Height =" + getHeight() + ", NumPass =" + getNumPass() + ", move =" + move()
				+ ", toString =" + super.toString() + "]";
	}
	
	
	

}
