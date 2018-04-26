import java.util.Scanner;

public class Input
{
	public static void main(String args[])
	{
		final double PI = 3.1415926;
		double radius;
		double area;
		System.out.print("Enter the radius: ");
		
		Scanner input = new Scanner(System.in);
		radius = input.nextDouble();
		
		area = radius * radius * PI;
		
		System.out.println("The aresa of circle " + radius + " is " + area);
	}
}