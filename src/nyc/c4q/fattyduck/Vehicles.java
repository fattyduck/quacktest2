package nyc.c4q.fattyduck;
/**
 * Created by fattyduck on 4/26/15.
 */
public class Vehicles
{
    double speed = 0;
    int wheels = 2;

    double PI = 3.14;

    int getWheel(){
        return wheels;
    }

    void setWheel(int numOfWheel){
        this.wheels=numOfWheel;
    }

    double getSpeed(){
        return speed;
    }

    void setSpeed(double speed){
        this.speed = speed;
    }




}
