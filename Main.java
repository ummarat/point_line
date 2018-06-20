package prj1;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		CPlane p1 = new CPlane();
		p1.setHeight(1500);
		p1.setNumPass(20);
		p1.setPrice(250000);
		p1.setSpeed(25);
		p1.setYear(2005);
		System.out.println(p1);
		
		CCar c1 = new CCar();
		c1.setPrice(150000);
		c1.setSpeed(200);
		c1.setYear(2016);
		System.out.println(c1);
		
		CShip sh1 = new CShip(60000, 80, 2017, 150, "Odessa");
		System.out.println(sh1);
		
		
		

	}

}
