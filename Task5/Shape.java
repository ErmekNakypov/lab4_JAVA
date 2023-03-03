package lab4.Task5;

public class Shape {
    private Integer length;
    private Integer width;

    public Shape() {
    }

    public Shape(Integer length, Integer width) {
        this.length = checkLength(length);
        this.width = checkWidth(width);
    }
    private Integer checkLength(Integer length) {
        if (length <= 0) {
            System.out.println("Invalid length");
            System.exit(1);
        }
        return length;
    }

    private Integer checkWidth(Integer width) {
        if (width <= 0) {
            System.out.println("Invalid width");
            System.exit(1);
        }
        return width;
    }

    public void getPer() {
        System.out.println("The perimeter: " + 2 * (width + length));
    }

    public void getArea() {
        System.out.println("The area: " + width * length);
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = checkLength(length);
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = checkWidth(width);
    }
}
