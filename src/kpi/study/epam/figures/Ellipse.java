package kpi.study.epam.figures;

/**
 * Epam_homework_5_OOP2
 * Created 5/20/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public class Ellipse extends Shape implements Cloneable{
    private Point o;
    private double c; // focal length
    private double a; // semimajor axis
    private double b; // semiminor axis

    public Ellipse(Point o, double c, double a, double b) {
        setO(o);
        setC(c);
        setB(b);
        setA(a);
    }

    @Override
    public double square() {
        return getA()*getB()*Math.PI;
    }

    @Override
    public double perimeter() {
        return 4*(square()+Math.pow(a-b,2))/(a+b);
    }



    public double getEccentricity(){
        return getC()/getA();
    }

    public double getEllipticity(){
        return getA()/getB();
    }

    public double getFocalparametr(){
        return getA()*(1-getEccentricity());
    }


    @Override
    public boolean equals(Object o1) {
        if (this == o1) return true;
        if (o1 == null || getClass() != o1.getClass()) return false;

        Ellipse elips = (Ellipse) o1;

        if (Double.compare(elips.c, c) != 0) return false;
        if (Double.compare(elips.a, a) != 0) return false;
        if (Double.compare(elips.b, b) != 0) return false;
        return o != null ? o.equals(elips.o) : elips.o == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = o != null ? o.hashCode() : 0;
        temp = Double.doubleToLongBits(c);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(b);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "o=" + getO().toString() +
                ", c=" + getC() +
                ", a=" + getA() +
                ", b=" + getB() +
                ", p=" + perimeter()+
                ", s=" + square()+
                '}';
    }

    @Override
    public Ellipse clone(){
        try{
            Ellipse temp = (Ellipse) super.clone();
            temp.setO(this.getO().clone());
            return temp;
        }catch ( CloneNotSupportedException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    /*
                getters and setters block
                 */
    public Point getO() {
        return o;
    }
    public void setO(Point o) {
        this.o = o;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if(a>getC()){
            this.a = a;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
