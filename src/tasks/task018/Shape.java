package tasks.task018;

abstract class Shape {

    private double volume;

    public Shape(double volume) {
        this.volume = volume;
    }

    public double getVolume(){
        return volume;
    }
}
