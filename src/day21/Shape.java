package day21;

public abstract class Shape {

    private String color;

    public Shape() {}

    public Shape(String color) {
        this.color = color;
    }

    public abstract double area();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void display() {
        System.out.println("The value of color is: " + color);
    }
}