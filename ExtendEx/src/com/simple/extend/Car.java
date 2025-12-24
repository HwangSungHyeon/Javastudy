package com.simple.extend;

public class Car extends Vehicle {
    protected int wheelCount;

    public Car(String brand, int wheelCount) {
        super(brand);
        //new Vehicle(brand);  이것보다 super()를 써야한다.
        this.wheelCount = wheelCount;
        System.out.println("자동차 생성됨");
    }

    public void honk() {
        System.out.println(brand+" 빵빵!");
    }
}
