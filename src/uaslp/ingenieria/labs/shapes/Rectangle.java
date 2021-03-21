package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Rectangle extends Shape {

    private int base;
    private int height;

    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String getName() {
        return "Rectangulo";
    }

    @Override
    public int getSidesCount() {
        return 4;
    }

    @Override
    public double getArea()
    {
        double area = (double)(base * height);
        return area;
    }

    @Override
    public int getPerimeter()
    {
        int perimeter = (int)(base * 2)+(height * 2);
        return perimeter;
    }
}
