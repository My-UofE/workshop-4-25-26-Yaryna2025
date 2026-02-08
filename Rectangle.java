// A Rectangle class
public class Rectangle {

    // 4 instance attributes
    private double width;        
    private double height;      
    private double originX = 0.0; 
    private double originY = 0.0; 

    // 1 static attribute
    public static final int NUMBER_OF_SIDES = 4;

    // main constructor
    public Rectangle(double width, double height, double originX, double originY) {
        this.width = width;
        this.height = height;
        this.originX = originX;
        this.originY = originY;
    }

    // second constructor
    public Rectangle(double width, double height) {
        this(width, height, 0, 0);
    }

    // second constructor
    public Rectangle() {
        this(1, 1, 0, 0);
    }

    // for each attribute provide getter method
    public double getWidth() { return width; } 
    public void setWidth(double width) {      
        if (width >= 0) this.width = width;   
    }

    public double getHeight() { return height; } 
    public void setHeight(double height) {      
        if (height >= 0) this.height = height;   
    }

    public double getOriginX() { return originX; } 
    public void setOriginX(double originX) {       
        this.originX = originX;                     
    }

    public double getOriginY() { return originY; } 
    public void setOriginY(double originY) {       
        this.originY = originY;                     
    }

    // method: move the rectangle
    public void move(double dx, double dy) {
        originX += dx;
        originY += dy;
    }

    // scale width and height separately
    public void scale(double scaleX, double scaleY) {
        width = width * scaleX;
        height = height * scaleY;
    }

    // scale width and height by the same factor
    public void scale(double scaleFactor) {
        scale(scaleFactor, scaleFactor);
    }

    // method: compute the area of the rectangle
    public double getArea() {
        return width * height;
    }

    // method: compute the perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean isOverlappedWith(Rectangle r) {
        double thisLeft   = getOriginX();
        double thisRight  = getOriginX() + getWidth();
        double thisBottom = getOriginY();
        double thisTop    = getOriginY() + getHeight();

        double rLeft   = r.getOriginX();
        double rRight  = r.getOriginX() + r.getWidth();
        double rBottom = r.getOriginY();
        double rTop    = r.getOriginY() + r.getHeight();

        if (thisRight <= rLeft || thisLeft >= rRight ||
            thisTop <= rBottom || thisBottom >= rTop) {
            return false;
        }

        return true;
    }

    public static boolean areOverlapping(Rectangle r1, Rectangle r2) {
        return r1.isOverlappedWith(r2);
    }

    public double calcRatio() {
        return width / height;
    }

    public boolean isSquare() {
        double ratio = calcRatio();
        return ratio >= 0.999 && ratio <= 1.001;
    }
}