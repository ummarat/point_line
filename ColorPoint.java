package ua.univer.figures;

public class ColorPoint extends Point{
	private String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ColorPoint(int x, int y, String color){
		super(x, y);
		setColor(color);
	}

	@Override
	public String toString() {
		return "ColorPoint [Color =" + getColor() + ", toString()=" + super.toString() + "]";
	}
	

}
