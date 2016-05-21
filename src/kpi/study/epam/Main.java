package kpi.study.epam;

import kpi.study.epam.figures.*;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Shape[] shapes=new Shape[]{
                new Circle(new Point(0,0),5),
                new Ellipse(new Point(0,0),5,7,2),
                new Rectangle(0,0,1,1)
        };
        showShapes(shapes);

        Ellipse ellipse = new Ellipse(new Point(0,0),5,7,2);
        System.out.println(ellipse);
        System.out.println(shapes[1].equals(ellipse));
        System.out.println("----------");

        Ellipse ellipse1 = ellipse;
        ellipse1.setO(new Point(1,1));
        System.out.println(ellipse);
        System.out.println(ellipse1);
        System.out.println("----------");

        ellipse1 = ellipse.clone();
        ellipse1.setO(new Point(2,2));
        System.out.println(ellipse);
        System.out.println(ellipse1);






    }
    static void showShapes (Shape ... shapes){
        for (Shape item: shapes) {
            System.out.println(item);
        }
    }
}
