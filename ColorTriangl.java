package ua.univer.figures;

public class ColorTriangl extends Triangl{
	private String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public ColorTriangl(Point apexA, Point apexB, Point apexC, String color) {
		super(apexA, apexB, apexC);
		this.color = color;
	}

	@Override
	public String toString() {
		return "ColorTriangl [Color =" + getColor() + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
