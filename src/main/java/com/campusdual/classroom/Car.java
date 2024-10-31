package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car() {}

    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            System.out.println("Vehiculo encendido");
        } else {
            System.out.println("El vehiculo ya esta encendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehiculo apagado");
        } else {
            System.out.println("No se puede apagar el vehiculo, primero tiene que estar detenido");
        }
    }

    public void accelerate() {
        accelerate(10);
    }

    public boolean accelerate(int amount) {
        if (this.speedometer + amount > MAX_SPEED) {
            this.speedometer = MAX_SPEED;
            System.out.println("Velocidad máxima alcanzada.");
            return false;
        } else {
            this.speedometer += amount;
            return true;
        }
    }

    public void brake() {
        if (speedometer > 0) {
            this.speedometer -= 10;
            if (this.speedometer < 0) {
                this.speedometer = 0;
            }
        }
        if (this.speedometer > 0) {
            System.out.println(this.speedometer + " km/h" + "... ");
        } else {
            System.out.println("\nVehículo detenido");
        }
    }

    public void turnAngleOfWheels(int angle) {
        if (angle < -45 || angle > 45) {
            System.out.println("Este ángulo no está permitido");
            if (angle > 0) {
                wheelsAngle = 45;
            } else {
                wheelsAngle = -45;
            }
        } else {
            wheelsAngle = angle;
            System.out.println("El nuevo ángulo de las ruedas es: " + angle);
        }
    }

    public String showWheelsAngleDetail() {
        return "El ángulo es: " + this.wheelsAngle;
    }


    public boolean isReverse() {
        return reverse;
    }

    public void setReverse(boolean reverse) {
        if (speedometer == 0){
            this.reverse = reverse;
            if (reverse == true){
                this.gear = "R";
            }
            else{
                this.gear = "N";
            }
        }

    }

    public boolean isTachometerGreaterThanZero(){
        return this.tachometer > 0;
    }

    public boolean isTachometerEqualToZero() {
        return this.tachometer == 0;
    }

    public void showDetails() {
    }
}