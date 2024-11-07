public class Rectangle extends Shape{


    private double length;

    private double width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return width*length;

    }

    @Override
    public double calculateCircumference() {
        return 2 * (length + width);
    }
}
