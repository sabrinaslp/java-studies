package entities;

public class Rectangle {
    public double width, height, area, perimeter, diagonal;

    public double calculeArea() {
        area = width * height;
        return area;
    }

    public double calculePerimeter() {
        perimeter = (width * 2) + (height * 2);
        return perimeter;
    }

    public double calculeDiagonal() {
        diagonal = Math.sqrt((width * width) + (height * height));
        return diagonal;
    }

}
