package ua.univer.figures;

public class Programm {

	public static void main(String[] args) {
		Point.setId(100);
		Point p1 = new Point(1, 1);
		Point p2 = new Point(1, 2);
		Point p3 = new Point(5, 7);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.equals(p2));
		System.out.println("lola".hashCode());
		ColorPoint cp1 = new ColorPoint(2, 2,"RED");
		System.out.println(cp1);
		Line line1 = new Line(p1, p2);
		Line line2 = new Line(3, 3, 4, 4);
		Line line3 = new Line(new Point(5, 5), new Point(6,6));
		Point p31 = line2.getStart();
		Point p32 = line2.getEnd();
		System.out.println(line1);
		System.out.println(line2);
		System.out.println(line3);
		System.out.println(p31);
		System.out.println(p32);
		ColorLine cl1 = new ColorLine(p1, p2, "GREEN");
		System.out.println(cl1);
		Triangl t1 = new Triangl(p1, p2, p3);
		System.out.println(t1);
		ColorTriangl ct1 = new ColorTriangl(p1, p2, p3, "BLUE");
		System.out.println(ct1);
		
		//массив объектов разных типов		
		Object obj1[] = new Object[7];
		obj1 [0] = new Point(1, 3);
		obj1 [1] = new ColorPoint(1, 2, "RED");
		obj1 [2] = new ColorPoint(1, 3, "GREEN");
		obj1 [3] = new Line(p1, p2);
		obj1 [4] = new ColorLine(1, 3, 2, 5, "BLACK");
		obj1 [5] = new Triangl(p1, p2, p3);
		obj1 [6] = new ColorTriangl(p1, p3, p2, "BLUE");
		
		System.out.println(obj1[0].toString());
		System.out.println(obj1[5].toString());
		System.out.println(obj1[6].toString());
		System.out.println(obj1[3].equals(obj1[4]));
		

	}

}
