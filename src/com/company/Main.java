package com.company;

import com.company.L013.SwitchExample;
import com.company.L019.StringExample;
import com.company.L020.TypeConversion;
import com.company.L026.FileExample;
import com.company.L027.ThreadExample;
import com.company.L028.House;
import com.company.animals.*;

import java.awt.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception {
//        HelloWorld.run();
//        POJO.run();
//
//
//        Cat catVar = new Cat();
//        catVar.voice();
//
//        com.company.L004.Cat catL004 = new com.company.L004.Cat();
//        catL004.voice();

        Cat cat = new Cat("Barsik", new Animal.AnimalWeight(20,Animal.AnimalWeight.WeightType.KG));
        System.out.println(cat.jumpHeight());
        cat.voice();


        Dog dog = new Dog();


        dog.goToStick(14);
        dog.whereTheDog();

        dog.goToStick(20);
        dog.whereTheDog();

        dog.goToStick(5);
        dog.whereTheDog();

        dog.voice();

        Dog homelessDog = Dog.ofHomeless(new Animal.AnimalWeight(100,Animal.AnimalWeight.WeightType.KG));
        homelessDog.voice();

        Duck duck = new Duck();
        duck.voice();

        duck.takeOf();
        duck.isTheBirdFlying();
        duck.showSpeed();

        duck.landing();
        duck.isTheBirdFlying();
        duck.showSpeed();
        
        List<Dog> dogs = Dog.randomArray();
        for (int i = 0; i < dogs.size(); i++) {
            System.out.println(dogs.get(i));
        }
        
        List<Dog> dogsHomeless = Arrays.asList(new Dog[]{
                Dog.ofHomeless(new Animal.AnimalWeight(3,Animal.AnimalWeight.WeightType.KG)),
                Dog.ofHomeless(new Animal.AnimalWeight(1,Animal.AnimalWeight.WeightType.KG)),
                Dog.ofHomeless(new Animal.AnimalWeight(5,Animal.AnimalWeight.WeightType.KG))
        });
        System.out.println(dogsHomeless.size());
        for(Dog dogItem : dogsHomeless){
            System.out.println(dogItem);
            dogItem.setName(String.valueOf((new Random()).nextLong()));
            System.out.println(dogItem.getName());
        }

        List<Dog> dogsLinkedList = new LinkedList<>();
        dogsLinkedList.add(Dog.ofHomeless(new Animal.AnimalWeight(10,Animal.AnimalWeight.WeightType.KG)));
        dogsLinkedList.add(Dog.ofHomeless(new Animal.AnimalWeight(10,Animal.AnimalWeight.WeightType.KG)));
        dogsLinkedList.add(Dog.ofHomeless(new Animal.AnimalWeight(10,Animal.AnimalWeight.WeightType.KG)));
        dogsLinkedList.add(Dog.ofHomeless(new Animal.AnimalWeight(10,Animal.AnimalWeight.WeightType.KG)));
        dogsLinkedList.add(Dog.ofHomeless(new Animal.AnimalWeight(10,Animal.AnimalWeight.WeightType.KG)));

        int indexLinkedList = 0;
        while (indexLinkedList < dogsLinkedList.size()){
            System.out.println(dogsLinkedList.get(indexLinkedList));
            indexLinkedList++;
        }

        for(int i = 0; i < 100; i++){
//            SwitchExample.run();
        }

        System.out.println(duck.getMoveType());
        System.out.println(dog.getMoveType().getValue());

        if(dog.getMoveType() == MoveType.WALK){
            System.out.println("Can walk!");
        }

        StringExample.run();
        TypeConversion.run();

        dog.setWeight(new Animal.AnimalWeight(10, Animal.AnimalWeight.WeightType.KG));
        try {
            dog.getWeight().setValue(-10);
        }catch (Animal.WeightException ignore){
        }

        FileExample.run();
        ThreadExample.run();

        House house = new House.Builder()
                .optHasSwimmingPool(true)
                .build();
        System.out.println(house.toString());

        House houseFull = new House.Builder()
                .optHasGarage(true)
                .optHasFancyStatues(true)
                .optHasSwimmingPool(true)
                .optHasGarden(true)
                .build();
        System.out.println(houseFull.toString());
    }
}
