package prj1;

public class CShip extends CVechicle{
	private int numPass;
	private String port;
	
	public int getNumPass() {
		return numPass;
	}
	public void setNumPass(int numPass) {
		this.numPass = numPass;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	
	public CShip() {
		super();
	}
	
	public CShip(float price, float speed, int year, int numPass, String port) {
		super(price, speed, year);
		this.numPass= numPass;
		this.port = port;
	}
	
	public String move() {
		return "Корабль идет";
	}
	@Override
	public String toString() {
		return "CShip [NumPass =" + getNumPass() + ", Port =" + getPort() + ", move =" + move()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
