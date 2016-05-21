package kpi.study.epam.figures;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Epam_homework_5_OOP2
 * Created 5/20/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public class Point implements Cloneable{

    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public Point clone()  {
        try {
            return (Point)super.clone();
        }catch( CloneNotSupportedException ex){
            return null;
        }
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static double distance(Point a,Point b){
        return sqrt(pow(a.getY()-b.getY(),2)+pow(a.getX()-b.getY(),2));
    }
}

