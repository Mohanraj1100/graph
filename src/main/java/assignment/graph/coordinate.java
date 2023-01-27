package assignment.graph;
import java.util.*;
import java.io.*;
public class coordinate 
{
	 public static void main(String[] args) throws CloneNotSupportedException {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter x-Coordonate");
	        Float x = sc.nextFloat();
	        System.out.println("Enter y-coordinate");
	        Float y = sc.nextFloat();

	        coordinates in = new coordinates(x, y);
	        coordinates is = in.co();
	        System.out.println(is.equals());
}
}
