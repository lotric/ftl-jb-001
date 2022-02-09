package tasks.task018;

class Ball extends SolidOfRevolution{

    public Ball(double radius){
        super(Math.PI * Math.pow(radius, 3) * 4 / 3, radius);
    }

    public Ball(double volume, double radius) {
        super(volume, radius);
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    @Override
    public double getVolume() {
        return super.getVolume();
    }
}
