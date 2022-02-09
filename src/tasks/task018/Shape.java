package tasks.task018;

interface Shape extends Comparable<Shape>{

    double getVolume();

    @Override
    default int compareTo(Shape other){
        return Double.compare(getVolume(), other.getVolume());
    }
}
