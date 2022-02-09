package tasks.task018;

public class Main {

    public static void main(String[] args){

        Ball ball = new Ball(3.5);
        Cylinder cylinder = new Cylinder(2.5,3.5);
        Pyramid pyramid = new Pyramid(50, 60);

        Box box = new Box(1000);

        System.out.println(ball);
        System.out.println(cylinder);
        System.out.println(pyramid);
    }
}
