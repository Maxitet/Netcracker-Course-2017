public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    Rectangle() {

    }

    Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    public String toString() {
        String response = "Rectangle[length=" + String.valueOf(length) + ", width=" + String.valueOf(width) + "]";
        return response;
    }
}
