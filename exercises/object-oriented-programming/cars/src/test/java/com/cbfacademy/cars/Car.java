package com.cbfacademy.cars;

public class Car {

    private String make;
    private String model;
    private String colour;
    private int year;


    public Car(String make, String model, String colour, int year){
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.year = year;

    }

    //returns the car make
    public String getMake(){
        return make;
    }
    
    //returns the car model
    public String getModel(){
        return model;
    }

    //returns the year the car was made
    public int getYear(){
        return year;
    }
    
    //returns the colour of the car
    public String getColour(){
        return colour;
    }

    //sets the colour of the car
    public void setColour(String colour){
        this.colour = colour;
    }

    //returns the car details, including the make, model, colour and year
    public String getDetails(){

        return (this.colour + this.make + this.model + this.year);
    }

    public String toString(){

        return String.format("A %s %s from %s ", this.colour + this.make + this.model + this.year);
    }

//     public String getDetails(){

//         return String.format("A %s %s from %s ", this.colour + this.make + this.model + this.year);
//     }
}
