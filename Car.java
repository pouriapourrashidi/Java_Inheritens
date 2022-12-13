package com.intermidiates.inheritens.cars;

public class Car {
    private String name;
    private String model;
    private int millage;
    Car(String name, String model, int millage){
        this.name=name;
        this.model=model;
        this.millage=millage;
    }

    public void startCar(){
        System.out.println("The engine has started");
    }
    
    public void description(){
        System.out.println(this.name+this.model+"with the millage of "+this.millage);
    }
}
