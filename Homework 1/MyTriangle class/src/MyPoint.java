class MyPoint {
    protected int x = 0;
    protected int y = 0;

    MyPoint() {

    }

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    void setX(int x) {
        this.x = x;
    }

    int getY() {
        return y;
    }

    void setY(int y) {
        this.y = y;
    }

    int[] getXY() {
        int[] array = {x, y};
        return array;
    }

    void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        String response = "(" + x + "," + y + ")";
        return response;
    }

    double distance(int newX, int newY) {
        // sqrt((x2-x1)^2+(y2-y1)^2)
        double distance = Math.sqrt(Math.pow(newX-x,2)+Math.pow(newY-y,2));
        return distance;
    }

    double distance(MyPoint another) {
        double distance = Math.sqrt(Math.pow(another.x-x,2)+Math.pow(another.y-y,2));
        return distance;
    }

    double distance() {
        double distance = Math.sqrt(Math.pow(0-x,2)+Math.pow(0-y,2));
        return distance;
    }
}