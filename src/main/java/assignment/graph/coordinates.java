package assignment.graph;

public class Coordinates implements cloneable {
    Float x;
    Float y;

    Coordinates(Float x, Float y) {
        this.x = x;
        this.y = y;
    }

    boolean equals() {
        return x.equals(y);
    }

    Coordinates co() {
    	try{
    		return (Coordinates)super.clone();
    		
    	}
    	catch(CloneNotSupportedException e)
    	{
    		System.out.println("Clowning error");
    		return this;
    	}
    }
}

