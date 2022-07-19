import java.lang.Math;

public class Selenium {

    double MphToKph = 1.609344;
    double constUnit = 5252;
    double torque;
    double maxSpeed;

    double setMaxSpeedMph(int horsePower ){
        maxSpeed = Math.cbrt(horsePower)*20;
        return maxSpeed;
        //System.out.println("Max speed for " + horsePower + " HP car is equal to " +  maxSpeed + " MPH ");

    }

    double setMaxSpeedKph(int horsePower ){
        maxSpeed = Math.cbrt(horsePower)*20*MphToKph;
        return maxSpeed;
        //System.out.println("Max speed for " + horsePower + " HP car is equal to " +  maxSpeed + " KPH ");

    }
    double setMaxTorque(int horsepower, double rpm ){
        torque = horsepower * constUnit / rpm;
        return torque;
        //System.out.println("Horsepower is equal to " + horsepower + "\n" + "Rpm is equal to " + rpm + "\n" + "Torque is equal to " + torque);

    }



}
