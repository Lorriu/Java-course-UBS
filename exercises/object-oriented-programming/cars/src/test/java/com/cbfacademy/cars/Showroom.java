package com.cbfacademy.cars;

import java.util.ArrayList;
import java.util.List;

public class Showroom {

    public List<Car> getCars(){

        List<Car> cars = new ArrayList<>();
           
           
            cars.add(new Car("Volvo", "V20", "blue", 2012));

            cars.add(new Car("Porsche", "Panamera", "red", 2009));
            
            cars.add(new Car("Audi", "A3", "grey", 2018));

            return cars;


    }
    
}
