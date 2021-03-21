package uaslp.ingenieria.labs.shapes.triangles;
import uaslp.ingenieria.labs.shapes.Triangle;

public class ScaleneTriangle extends Triangle
{
    private int sideA;
    private int sideB;
    private int sideC;

    public ScaleneTriangle(int sideA,int sideB, int sideC)
    {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

    }

    @Override
    public String getName() {
        return "Triangulo Escaleno";
    }

    @Override
    public int getPerimeter() {
        int perimeter = (int)(sideA+ sideB + sideC);
        return perimeter;
    }

    @Override
    public double getArea()
    {
        int semiPerimeter = (int)((sideA + sideB + sideC)/2);
        double area = (double)(Math.sqrt(semiPerimeter*(semiPerimeter- sideA)
                        *(semiPerimeter- sideB)*(semiPerimeter- sideC)));

        return area;
    }
}
