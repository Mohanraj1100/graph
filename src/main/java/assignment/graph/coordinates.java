package assignment.graph;

public class coordinates implements Cloneable {
    Float x;
    Float y;

    coordinates(Float x, Float y) {
        this.x = x;
        this.y = y;
    }

    boolean equals() {
        return x.equals(y);
    }

    coordinates co() {
    	try{
    		return (coordinates)super.clone();
    		
    	}
    	catch(CloneNotSupportedException e)
    	{
    		System.out.println("Clowning error");
    		return this;
    	}
    }
}

