package assignment.graph;
import java.util.*;
public class Coordinate 
{
	 public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter x-Coordonate");
	        Float x = sc.nextFloat();
	        System.out.println("Enter y-coordinate");
	        Float y = sc.nextFloat();

	        Coordinates in = new Coordinates(x, y);
	        Coordinates is = in.co();
	        System.out.println(is.equals());
}
}
