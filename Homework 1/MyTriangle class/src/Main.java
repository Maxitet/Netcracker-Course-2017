public class Main {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(0,0);
        MyPoint p2 = new MyPoint(5,10);
        MyPoint p3 = new MyPoint(7,8);

        MyTriangle triangle1 = new MyTriangle(p1,p2,p3);

        MyTriangle triangle2 = new MyTriangle(-5,2,-4,3,-5,3);

        System.out.println("Периметр triangle1 = " + triangle1.getPerimeter());
        System.out.println("Периметр triangle2 = " + triangle2.getPerimeter());

        System.out.println("Тип triangle1: " + triangle1.getType());
        System.out.println("Тип triangle2: " + triangle2.getType());

        System.out.println(triangle1);
    }
}
