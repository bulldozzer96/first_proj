package com.ua.RD.lesson10.service;

import com.ua.RD.lesson10.Car;

public class PaintService {
    public Car paint(Car car, String newColor){
        car.setColor(newColor);
        return car;
    }
}
