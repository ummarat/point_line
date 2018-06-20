package prj1;

public class CCar extends CVechicle{
	
	public CCar() {
		super();
	}
	
	public CCar(float price, float speed, int year) {
		super(price, speed, year);
	}
	
	public String move() {
		return "Автомобиль едет";
	}

	@Override
	public String toString() {
		return "CCar [move =" + move() + ", toString()=" + super.toString() + "]";
	}
	
	

}
