package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class TriangleEquilatero extends Triangle {
    private int side;

    public TriangleEquilatero(int side)
    {
        this.side = side;
    }

    @Override
    public String getName()
    {
        return "Triangulo equilatero";
    }

    @Override
    public int getPerimeter() {
        int perimeter = (side * 3);
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = (double)((side *side)/2);
        return area;
    }
}
