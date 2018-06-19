package ua.univer.figures;

public class Triangl {
	Point apexA, apexB, apexC;
	Line sideAB, sideBC, sideAC;
	
	public Triangl(Point apexA, Point apexB, Point apexC) {
		super();
		this.apexA = apexA;
		this.apexB = apexB;
		this.apexC = apexC;
	}
		
	public Point getApexA() {
		return apexA;
	}

	public void setApexA(Point apexA) {
		this.apexA = apexA;
	}

	public Point getApexB() {
		return apexB;
	}

	public void setApexB(Point apexB) {
		this.apexB = apexB;
	}

	public Point getApexC() {
		return apexC;
	}

	public void setApexC(Point apexC) {
		this.apexC = apexC;
	}

	public Line getSideAB(){
		if(sideAB == null){
			sideAB = new Line(apexA, apexB);
		}
		return sideAB;
	}
	public Line getSideBC(){
		if(sideBC == null){
			sideBC = new Line(apexB, apexC);
		}
		return sideBC;
	}
	public Line getSideAC(){
		if(sideAC == null){
			sideAC = new Line(apexA, apexC);
		}
		return sideAC;
	}

	@Override
	public String toString() {
		return "Triangl [apexA=" + apexA + ", apexB=" + apexB + ", apexC=" + apexC + ", sideAB=" + getSideAB() + ", sideBC="
				+ getSideBC() + ", sideAC=" + getSideAC() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	

}
