package rectangleArea;

import java.util.Scanner;

public class AreaOfRec {
public static int areaOfRectangle(int length,int breadth) {
		
		return length * breadth;
		
	}
	
	public static void main(String args[]) {
		
		int length;
		int breadth;
		Scanner s=new Scanner(System.in);
		length = s.nextInt();
		breadth=s.nextInt();
		System.out.println(areaOfRectangle(length,breadth));
		
		
		
		
	}
	
	

}
