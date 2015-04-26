package nyc.c4q.fattyduck;
/**
 * Created by fattyduck on 4/26/15.
 */
public class Vehicles implements driveable
{
    double speed = 0;
    int wheels = 2;

    double PI = 3.14;

    public int getWheel(){
        return wheels;
    }

    public void setWheel(int numOfWheel){
        this.wheels=numOfWheel;
    }

    public double getSpeed(){
        return speed;
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }

    public Vehicles() {

    }

    public Vehicles(int wheels, double speed){
        this.wheels=wheels;
        this.speed=speed;

    }




}
