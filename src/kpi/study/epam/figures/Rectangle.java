package kpi.study.epam.figures;

/**
 * Epam_homework_5_OOP2
 * Created 5/21/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public class Rectangle extends Shape implements Cloneable{
    private Point leftTop;// = new Point();
    private Point rightBottom;// = new Point();

    public Rectangle(Point leftTop, Point rightBottom) {
        this.leftTop = leftTop;
        this.rightBottom = rightBottom;
    }

    public Rectangle(double left, double top, double right
            , double bottom){
        this.leftTop = new Point(left,top);
        this.rightBottom = new Point( right , bottom );
    }

    @Override
    public double perimeter() {
        return 2.*(Math.abs(rightBottom.getX() - leftTop.getX()) +
                Math.abs(rightBottom.getY() - leftTop.getY()));
    }

    @Override
    public double square() {
        return Math.abs((rightBottom.getX() - leftTop.getX())*
                (rightBottom.getY() - leftTop.getY()));
    }

    public Point getRightBottom() {
        return rightBottom;
    }

    public void setRightBottom(Point rightBottom) {
        this.rightBottom = rightBottom;
    }

    public Point getLeftTop() {
        return leftTop;
    }

    public void setLeftTop(Point leftTop) {
        this.leftTop = leftTop;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "leftTop=" + leftTop +
                ", rightBottom=" + rightBottom +
                ", p=" + perimeter()+
                ", s=" + square()+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (leftTop != null ? !leftTop.equals(rectangle.leftTop) : rectangle.leftTop != null) return false;
        return rightBottom != null ? rightBottom.equals(rectangle.rightBottom) : rectangle.rightBottom == null;

    }

    @Override
    public int hashCode() {
        int result = leftTop != null ? leftTop.hashCode() : 0;
        result = 31 * result + (rightBottom != null ? rightBottom.hashCode() : 0);
        return result;
    }

    @Override
    public Rectangle clone(){
        try{
            Rectangle temp= (Rectangle) super.clone();
            temp.setLeftTop(this.leftTop.clone());
            temp.setRightBottom(this.getRightBottom().clone());
            return temp;
        }catch (CloneNotSupportedException e){
            e.getStackTrace();
            return null;
        }
    }
}
