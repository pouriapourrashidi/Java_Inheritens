package com.intermidiates.inheritens.cars;

public class DogeChallenger extends Car{

    DogeChallenger(String model, int millage){
        super("DogeChalenger",model,millage);

    }

    @Override
    public void startCar() {
        System.out.println("the beast is on right now.");
    }
}
