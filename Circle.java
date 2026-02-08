public class Circle {

    private double radius;
    private double originX;
    private double originY;

    public Circle(double radius, double originX, double originY) {
        setRadius(radius); 
        this.originX = originX;
        this.originY = originY;
    }

    public Circle(double radius) {
        this(radius, 0, 0); 
    }

    public Circle() {
        this(1, 0, 0); 
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        }
    }

    public double getOriginX() {
        return originX;
    }

    public void setOriginX(double originX) {
        this.originX = originX;
    }

    public double getOriginY() {
        return originY;
    }

    public void setOriginY(double originY) {
        this.originY = originY;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public void move(double dx, double dy) {
        originX += dx;
        originY += dy;
    }

    public void scale(double factor) {
        if (factor >= 0) {
            radius *= factor;
        }
    }

    public boolean isOverlappedWith(Circle c) {
        double dx = originX - c.getOriginX();
        double dy = originY - c.getOriginY();
        double distance = Math.sqrt(dx*dx + dy*dy);
        return distance < (this.radius + c.getRadius());
    }

    public boolean isEnclosedBy(Circle c) {
        double dx = originX - c.getOriginX();
        double dy = originY - c.getOriginY();
        double distance = Math.sqrt(dx*dx + dy*dy);
        return distance + this.radius <= c.getRadius();
    }

    public String toString() {
        return "Circle[x=" + originX + ",y=" + originY + ",r=" + radius + "]";
    }
}
