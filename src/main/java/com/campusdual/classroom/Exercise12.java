package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {

        Car myCar = new Car("Citroën", "Xsara", "Diésel");

        // 1.

        if (myCar.isTachometerEqualToZero()) {
            System.out.println("El tacómetro es 0.");
        } else {
            System.out.println("El tacómetro no es 0.");
        }

        //2.

        if (!myCar.isTachometerEqualToZero()) {
            System.out.println("No se puede encender el vehiculo, el tacometro no es 0");
        } else {
            System.out.println("Vehiculo encendido");
        }

        //3.
        myCar.start();
        myCar.start();


        //4.
        myCar.stop();
        myCar.speedometer = 0;
        if (myCar.isTachometerEqualToZero()) {
            System.out.println("El tacómetro es 0 después de apagar el coche.");
        }

        //5.

        myCar.accelerate(50);
        myCar.stop();

        //////6.

        int accelerationAmount = 30;
        myCar.accelerate(accelerationAmount);
        System.out.println("Velocidad actual: " + myCar.speedometer + " km/h.");

        //7.

        int secondAccelerationAmount = 80;
        if (myCar.accelerate(secondAccelerationAmount)) {
            System.out.println("Acelerando. Velocidad actual: " + myCar.speedometer + " km/h.");
        } else {
            System.out.println("No se puede superar la velocidad máxima de " + Car.MAX_SPEED + " km/h.");
        }

        //8

        myCar.brake();
        System.out.println("Velocidad después de frenar: " + myCar.speedometer + " km/h.");

        //9

        for (int i = 0; i < 6; i++) {
            myCar.brake();
        }

        System.out.println("Velocidad después de frenar: " + myCar.speedometer + " km/h.");

        myCar.brake();
        System.out.println("Velocidad después de intentar frenar más: " + myCar.speedometer + " km/h.");

        //10

        myCar.turnAngleOfWheels(20);
        System.out.println("El volante ha sido girado 20 grados.");

        //11

        System.out.println("Intentar girar el volante a 50 grados.");
        myCar.turnAngleOfWheels(50);

        System.out.println("Intentar girar el volante a -50 grados.");
        myCar.turnAngleOfWheels(-50);

        //12
        myCar.brake();
        myCar.brake();
        myCar.brake();
        myCar.brake();
        myCar.stop();
        if (myCar.speedometer == 0) {
            myCar.setReverse(true);
            System.out.println("El coche ha sido puesto en marcha atrás.");
        } else {
            System.out.println("No se puede poner en marcha atrás mientras el coche está en movimiento.");
        }

        //13
        myCar.start();
        myCar.accelerate(20);
        if (myCar.speedometer > 0) {
            System.out.println("Intentando poner marcha atrás mientras el coche está en movimiento.");
            String prevGear = myCar.gear;
            myCar.setReverse(true);
            if (myCar.gear.equals(prevGear)) {
                System.out.println("No se puede poner marcha atrás mientras el coche está en movimiento.");
            }
        }
}
}