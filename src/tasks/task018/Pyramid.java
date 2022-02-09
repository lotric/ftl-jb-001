package tasks.task018;

class Pyramid extends Shape{

    private double height;
    private double square;

    public Pyramid(double height, double square){
        super(height * square * 4 / 3);
        this.height = height;
        this.square = square;
    }

    public Pyramid(double volume) {
        super(volume);
    }

    @Override
    public double getVolume() {
        return super.getVolume();
    }
}
