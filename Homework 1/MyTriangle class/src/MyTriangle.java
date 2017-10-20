public class MyTriangle extends MyPoint {
    private MyPoint v1 = new MyPoint();
    private MyPoint v2 = new MyPoint();
    private MyPoint v3 = new MyPoint();

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }


    MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) { ;
        v1.x = x1;
        v1.y = y1;
        v2.x = x2;
        v2.y = y2;
        v3.x = x3;
        v3.y = y3;
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1=(" + v1.x + "," + v1.y +
                "), v2=(" + v2.x + "," + v2.y +
                "), v3=(" + v3.x + v3.y +
                ")]";
    }

    double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    String getType() {
        double ab = v1.distance(v2);
        double bc = v2.distance(v3);
        double ac = v1.distance(v3);

        if(ab == bc && ab == ac && bc == ac) {
            return "Equilateral";
        }
        else if (ab == bc || ab == ac || ac == bc) {
            return "Isosceles";
        }
        else
            return "Scalene";
    }


}
