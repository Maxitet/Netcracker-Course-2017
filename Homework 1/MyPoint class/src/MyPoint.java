public class MyPoint {
    private int x = 0;
    private int y = 0;

    MyPoint() {

    }

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] array = {x, y};
        return array;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        String response = "(" + x + "," + y + ")";
        return response;
    }

    public double distance(int newX, int newY) {
        double distance = Math.sqrt(Math.pow(newX-x,2)+Math.pow(newY-y,2));
        return distance;
    }

    public double distance(MyPoint another) {
        double distance = Math.sqrt(Math.pow(another.x-x,2)+Math.pow(another.y-y,2));
        return distance;
    }

    public double distance() {
        double distance = Math.sqrt(Math.pow(0-x,2)+Math.pow(0-y,2));
        return distance;
    }
}
