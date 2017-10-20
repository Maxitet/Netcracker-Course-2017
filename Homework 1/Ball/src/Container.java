public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width;
        this.y2 = y + height;
    }

    int getX() {
        return x1;
    }

    int getY() {
        return y1;
    }

    int getWidth() {
        return x2;
    }

    int getHeight() {
        return y2;
    }

    boolean collides(Ball ball) {
        float ballLeft = ball.getX() - ball.getRadius();
        float ballRight = ball.getX() + ball.getRadius();
        float ballUp = ball.getY() - ball.getRadius();
        float ballDown = ball.getY() + ball.getRadius();

        if(ballLeft < 0 || ballRight > x2) return false;

        if(ballUp < 0 || ballDown > y2) return  false;

        return true;
    }

    @Override
    public String toString() {
        return "Container[" +
                "(x1=" + x1 +
                ", y1=" + y1 +
                "), (x2=" + x2 +
                ", y2=" + y2 +
                ")]";
    }
}
