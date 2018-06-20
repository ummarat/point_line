package prj1;

public abstract class CVechicle {
	private float price;
	private float speed;
	private int year;
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public CVechicle() {
		this.price = 0;
		this.speed = 0;
		this.year = 0;
	}
	
	public CVechicle(float price, float speed, int year) {
		this.price = price;
		this.speed = speed;
		this.year = year;
	}
	
	public abstract String move();
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(price);
		result = prime * result + Float.floatToIntBits(speed);
		result = prime * result + year;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CVechicle other = (CVechicle) obj;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		if (Float.floatToIntBits(speed) != Float.floatToIntBits(other.speed))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CVechicle [Price =" + getPrice() + ", Speed =" + getSpeed() + ", Year =" + getYear()
				+ "]";
	}
	
	
	
	

}
