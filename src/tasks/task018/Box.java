package tasks.task018;

import java.util.ArrayList;

class Box extends Shape{

    private ArrayList<Shape> shapes = new ArrayList<>();
    private double access;

    public Box(double access){
        super(access);
        this.access = access;
    }

    public boolean add(Shape shape){
        if(access >= shape.getVolume()){
            shapes.add(shape);
            access -= shape.getVolume();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getVolume() {
        return super.getVolume();
    }
}
