// An application to create and manipulate rectangles
public class RectangleApp {
    //To be excutable, need a main method
    public static void main(String[] args) {
        System.out.println("Creating myRect1");
        
        Rectangle myRect1; 
        myRect1 = new Rectangle(20.0, 8.0, 30, 30); 
        
        // static field
        System.out.println("Rectangle has " + Rectangle.NUMBER_OF_SIDES + " sides");
        // instance fields via getters
        System.out.println("Width: " + myRect1.getWidth() + ", Height: " + myRect1.getHeight());
        System.out.println("Origin is: " + myRect1.getOriginX() + "," + myRect1.getOriginY());
        // calling methods
        System.out.println("Area: " + myRect1.getArea());
        
        System.out.println("\nMoving myRect1");
        myRect1.move(0, 10);
        System.out.println("Origin is: " + myRect1.getOriginX() + "," + myRect1.getOriginY());

        System.out.println("Changing width of myRect1");
        myRect1.setWidth(16);
        System.out.println("Width: " + myRect1.getWidth() + ", Height: " + myRect1.getHeight());

        System.out.println("Creating myRect2");
        Rectangle myRect2 = new Rectangle(20.0, 8.0);
        System.out.println("Width: " + myRect2.getWidth() + ", Height: " + myRect2.getHeight());
        System.out.println("Origin: " + myRect2.getOriginX() + "," + myRect2.getOriginY());

        System.out.println("Creating myRect3");
        Rectangle myRect3 = new Rectangle(); 
        System.out.println("Width: " + myRect3.getWidth() + ", Height: " + myRect3.getHeight());
        System.out.println("Origin: " + myRect3.getOriginX() + "," + myRect3.getOriginY());

        System.out.println("\n--- Ratio & square tests ---");
        System.out.println("myRect3 ratio: " + myRect3.calcRatio());
        System.out.println("myRect3 is square: " + myRect3.isSquare());

        myRect1.scale(0.5);     
        myRect2.scale(1, 3);     
        myRect3.scale(15, 10);   

        Rectangle myRect4 = new Rectangle(30.0, 5.0, 10, 10);
        Rectangle myRect5 = new Rectangle(50.0, 20.0, 0, 0);
        Rectangle myRect6 = new Rectangle(20.0, 40.0, 500, 500);

        System.out.println("myRect4 overlaps myRect5: " + myRect4.isOverlappedWith(myRect5));
        System.out.println("myRect5 overlaps myRect4: " + myRect5.isOverlappedWith(myRect4));
        System.out.println("myRect4 overlaps myRect6: " + myRect4.isOverlappedWith(myRect6));
        System.out.println("myRect6 overlaps myRect4: " + myRect6.isOverlappedWith(myRect4));

        System.out.println("\nCheck class prevents negative widths");

        Rectangle myRect7 = new Rectangle(30.0, 5.0, 10, 10); 
        System.out.println("Width: " + myRect7.getWidth() + ", Height: " + myRect7.getHeight());
        
        myRect7.setWidth(40); 
        System.out.println("Width: " + myRect7.getWidth() + ", Height: " + myRect7.getHeight());
        
        myRect7.setWidth(-10); 
        System.out.println("Width: " + myRect7.getWidth() + ", Height: " + myRect7.getHeight());

		System.out.println("\nObject reference tests:");

		Rectangle r1 = new Rectangle(10.0, 5.0);
		Rectangle r2 = new Rectangle(10.0, 5.0);
		Rectangle r3 = r2;

		System.out.println("r1: " + r1);
		System.out.println("r2: " + r2);
		System.out.println("r3: " + r3);

		r2.scale(0.5);
		System.out.println("After scaling r2 by 0.5:");
		System.out.println("r2 width: " + r2.getWidth());
		System.out.println("r3 width: " + r3.getWidth());
    }
}
