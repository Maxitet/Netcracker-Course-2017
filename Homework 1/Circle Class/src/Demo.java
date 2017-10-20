public class Demo {
    public static void main(String args[]) {
        Circle circle = new Circle(3.0,"Cian");

        System.out.println(circle);

        System.out.println(circle.getRadius());

        System.out.println(circle.getArea());

        circle.setRadius(7);

        circle.setColor("Grey");

        System.out.println(circle);
    }
}
