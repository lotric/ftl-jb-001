package tasks.task018;

import java.util.ArrayList;

class Box implements Shape{

    private ArrayList<Shape> shapes = new ArrayList<>();
    private double access;
    private double volume;

    public Box(double access){

        this.access = access;
        this.volume = volume;
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
        return volume;
    }

    public ArrayList<Shape> getShapes(){
        return shapes;
    }
}
