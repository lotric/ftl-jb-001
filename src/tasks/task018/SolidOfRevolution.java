package tasks.task018;

public class SolidOfRevolution extends Shape{

    private double radius;

    public SolidOfRevolution(double volume, double radius){
        super(volume);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public SolidOfRevolution(double volume) {
        super(volume);
    }

    @Override
    public double getVolume() {
        return super.getVolume();
    }
}
