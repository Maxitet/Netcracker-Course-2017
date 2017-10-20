public class Demo {
    public static void main(String args[]) {
        MyPoint p = new MyPoint();
        MyPoint t = new MyPoint(14,8);

        p.setXY(5, 2);

        System.out.println(p.distance(t));

        System.out.println(t.distance(p));

        System.out.println(p.distance(10,4));

        System.out.println(t.distance());


    }
}
