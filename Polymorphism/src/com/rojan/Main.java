package com.rojan;

class Car {
    private String name;
    private int Cylinder;
    private int Wheels;
    private boolean Engine;
    private String Model;

    public Car(String name, int cylinder, int wheels, boolean engine, String model) {
        this.name = name;
        Cylinder = cylinder;
        Wheels = wheels;
        Engine = engine;
        Model = model;
    }
    public void StartEngine()
    {
        System.out.println("Car--> Started" );
    }
    public void Accelerate()
    {
        System.out.println("Car--> Accelerated.");
    }

    public String getName() {
        return name;
    }
}
class Honda extends Car {
    public Honda()
    {
        super("Honda", 4,4,true,"B30");
    }

    @Override
    public void StartEngine() {
        System.out.println("Honda Engine Started.");
    }

    @Override
    public void Accelerate()
    {
        System.out.println("Honda Accelerated");
    }
}
class Skoda extends Car{
    public Skoda()
    {
        super("Skoda",6,6,false,"33C");
    }
    //No Engine started and accelerated
//    public void StartEngine()
//    {
//        System.out.println("Skoda Rapid Started.");
//    }
//    public void Accelerate ()
//    {
//        System.out.println("Skoda Accelerated.");
//    }
}
class Suzuki extends Car{
    public Suzuki()
    {
        super("Swift",3,4,true,"770GH");
    }

    @Override
    public void StartEngine() {
        System.out.println("Swift Started");
    }

    @Override
    public void Accelerate() {
        System.out.println("Swift Accelerated.");
    }
}
class Kia extends Car{
    public Kia()
    {
        super("Kia Model 3",0,4,true,"Model-3");
    }

    @Override
    public void StartEngine() {
        System.out.println("Kia Started");
    }

    @Override
    public void Accelerate() {
        System.out.println("Kia accelerated");
    }
}
class Tesla extends Car {
    public Tesla()
    {
        super("Tesla",0,6,false,"X");
    }
    //No engine stated and Accelerated

}
    public class Main {
    public static Car RandomCar()
    {
        int RandomNumber = (int) ((Math.random())*5) +1;
        System.out.println("\nRandom number generated: " + RandomNumber);
        switch (RandomNumber)
        {
            case 1:
                return new Honda();
            case 2:
                return new Skoda();
            case 3:
                return new Suzuki();
            case 4:
                return new Kia();
            case 5:
                return new Tesla();
        }
        return null;
    }

    public static void main(String[] args) {
        for (int i=0;i<10;i++)
        {
            Car car = RandomCar();
            System.out.println("Car# " + car.getName() );
            car.StartEngine();
            car.Accelerate();
        }

    }
}
