package kpi.study.epam.figures;

public abstract class Shape {
    public abstract double square();
    public abstract double perimeter();

    @Override
    public String toString() {
        return " perimeter = " + perimeter() +" square = " +square();
    }
}