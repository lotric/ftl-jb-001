package tasks.task018;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args){

        Ball ball = new Ball(3.5);
        Cylinder cylinder = new Cylinder(2.5,3.5);
        Pyramid pyramid = new Pyramid(50, 60);

        Box box = new Box(1000);

        System.out.println(box.add(ball));
        System.out.println(box.add(cylinder));
        System.out.println(box.add(pyramid));

        ArrayList<Shape> shapes = box.getShapes();
        Collections.sort(shapes);
    }
}
