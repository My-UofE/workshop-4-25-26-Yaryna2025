public class CircleApp {
    public static void main(String[] args) {

        Circle c1 = new Circle(5, 0, 0);
        Circle c2 = new Circle(3, 4, 0);
        Circle c3 = new Circle(); 

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);

        System.out.println("c1 area: " + c1.getArea());
        System.out.println("c1 circumference: " + c1.getCircumference());

        c3.move(1, 2);
        System.out.println("c3 after move: " + c3);

        c2.scale(2);
        System.out.println("c2 after scale: " + c2);

        System.out.println("c1 overlaps c2: " + c1.isOverlappedWith(c2));

        System.out.println("c3 is enclosed by c1: " + c3.isEnclosedBy(c1));
        System.out.println("c1 is enclosed by c2: " + c1.isEnclosedBy(c2));
    }
}
