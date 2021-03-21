package uaslp.ingenieria.labs.shapes.triangles;
import uaslp.ingenieria.labs.shapes.Triangle;

public class IsoscelesTriangle extends Triangle
{
    private int base;
    private int sides;

    public IsoscelesTriangle(int base, int sides)
    {
        this.base = base;
        this.sides = sides;
    }

    @Override
    public String getName()
    {
        return "Triangulo Isosceles";
    }

    @Override
    public int getPerimeter() {
        int perimeter = (int)((sides*2) + base);
        return  perimeter;
    }

    @Override
    public double getArea() {
        int height = (int) (Math.sqrt(Math.pow(base / 2,2) + Math.pow(sides,2)));
        double area = (double)(height * base)/2;
        return area;
    }
}
