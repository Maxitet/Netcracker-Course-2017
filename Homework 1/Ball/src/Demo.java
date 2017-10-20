public class Demo {
    public static void main(String[] args) {
        Ball ball = new Ball(10,10,2,30,-450);

        Container container = new Container(0,0,70,70);

        System.out.println(container);
        System.out.println(ball);

        ball.move();
        System.out.println(container.collides(ball)); // true: (x,y):31,31

        ball.move();
        System.out.println(container.collides(ball)); // true: (x,y):52,52

        ball.move();
        System.out.println(container.collides(ball)); // false: (x,y):73,73

        ball.reflectHorizontal();
        ball.move();
        System.out.println(container.collides(ball)); // false: (x,y):52,94

        ball.reflectVertical();
        ball.move();
        ball.move();
        System.out.println(container.collides(ball)); // true: (x,y):10,52

    }
}
