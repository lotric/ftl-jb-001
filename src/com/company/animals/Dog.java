package com.company.animals;

public class Dog extends Animal{
    public Dog(String name, Integer weight) {
        super(name, weight);
    }

    public Dog() {
    }

    public static Dog[] randomArray(){
        Dog[] dogs = new Dog[3];

        dogs[0] = Dog.of("Sharik", 3);
        dogs[1] = Dog.of("Bobik", 1);
        dogs[2] = Dog.of("Tuzic", 5);

        return dogs;
    }


    /**
     * Идем до позиции палки. Чтобы дойти до палки, нужно определить разницу между текущей позицией и позицией палки.
     * @param stickPosition - позиция палки
     */
    public void goToStick(Integer stickPosition){
        Integer delta = stickPosition - this.currentPosition;
        this.runForward(delta);
    }

    public void whereTheDog(){
        System.out.println(this.currentPosition);
    }

    public static Dog of(String name, Integer weight){
        return new Dog(name, weight);
    }

    public static Dog ofHomeless(Integer weight){
        Dog dog = new Dog();
        dog.weight = weight;
        return dog;
    }

    @Override
    public void voice() {
        System.out.println("woof!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", currentPosition=" + currentPosition +
                '}';
    }
}
