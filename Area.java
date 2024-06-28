package Area;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     A program to calculate the area of a triangle
		Scanner scanner = new Scanner(System.in);
		double height;
		double base;
		System.out.print("Enter the height of the triangle: ");
		height = scanner.nextDouble();
		System.out.print("Enter the base of the triangle: ");
		base = scanner.nextDouble();
//		Implementing the logic
		double area = .5*(base*height);
		System.out.print("The area of the triangle is " + area);
		scanner.close(); 
	}

}
