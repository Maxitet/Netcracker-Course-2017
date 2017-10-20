public class Demo {
    public static void main(String args[]) {
        Rectangle rectangle = new Rectangle(4.0f,8.0f);

        System.out.println(rectangle.getLength());

        System.out.println(rectangle.getWidth());

        rectangle.setLength(10.0f);

        rectangle.setWidth(5.0f);

        System.out.println(rectangle.getLength());

        System.out.println(rectangle.getWidth());

        System.out.println(rectangle.getArea());

        System.out.println(rectangle.getPerimeter());

        System.out.println(rectangle.toString());
    }
}
