package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Square extends Shape {
    private int side;

    public Square(int side)
    {
        this.side = side;
    }

    @Override
    public String getName()
    {
        return "Cuadrado";
    }

    @Override
    public int getSidesCount() {
        return 4;
    }

    @Override
    public int getPerimeter() {
        int perimeter = (int)(side * 4);
        return perimeter;

    }

    @Override
    public double getArea()
    {
        double area = (double)(side * side);
        return area;
    }
}
