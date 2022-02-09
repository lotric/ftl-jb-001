package tasks.task018;

class Cylinder extends SolidOfRevolution{

    private double height;

    public Cylinder(double radius, double height){
        super(Math.PI * radius * radius * height, radius);
        this.height = height;
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    public Cylinder(double volume) {
        super(volume);
    }

    @Override
    public double getVolume() {
        return super.getVolume();
    }
}
