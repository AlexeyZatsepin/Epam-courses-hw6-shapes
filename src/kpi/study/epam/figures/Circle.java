package kpi.study.epam.figures;


public class Circle extends Ellipse implements Cloneable{

    public Circle(Point centerCircle, double radius) {
        super(centerCircle,0,radius,radius);
    }

    @Override
    public double square() {
        return Math.PI*getA()*getA();
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*getA();
    }

    public Point getCenterCircle() {
        return getO();
    }

    public void setCenterCircle(Point centerCircle) {
         setO(centerCircle);
    }

    public double getRadius() {
        return getA();
    }

    public void setRadius(double radius) {
        setA(radius);
        setB(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "centerCircle=" + getO().toString() +
                ", radius=" + getA() +
                ", p=" + perimeter()+
                ", s=" + square()+
                '}';
    }


    @Override
    public Circle clone() {
        return (Circle)super.clone();
    }
}
