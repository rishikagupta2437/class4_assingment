
import java.util.Scanner;

public class calculatearea {
	
		static int  length;
		static int breadth;
		static int calculateArea(int a, int b){
		
		int area=length*breadth;
		return area;
		}
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			calculatearea cal = new calculatearea();
			System.out.print("enter the length:");
			cal.length=scan.nextInt();
			System.out.print("enter the breadth:");
			cal.breadth=scan.nextInt();
			System.out.println("area of rectangle is:"+calculateArea (cal.length,cal.breadth));
		}
			
			
		}
		
		
		


