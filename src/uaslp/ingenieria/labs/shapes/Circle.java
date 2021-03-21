package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Circle extends Shape {
    private int radio;

    public Circle(int radio)
    {
        this.radio = radio;
    }

    // Re-definir el método en una clase hija: SOBRE-ESCRITURA -> OVERWRITING

    // Sobrecarga = Overloading // polimorfismo

    // Polimorfismo: Enviar un mensaje a un objeto y que este responda de diferentes maneras

    @Override
    public String getName() {
        return "Circulo";
    }

    @Override
    public int getPerimeter() {
        int perimeter =(int)(3.1416 * (radio * 2));
        return perimeter;
    }

    @Override
    public double getArea()
    {
        double area = (double)(3.1416 * Math.sqrt(radio));
        return area;
    }
}
