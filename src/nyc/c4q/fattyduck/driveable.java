package nyc.c4q.fattyduck;
/**
 * Created by fattyduck on 4/26/15.
 */
public interface driveable
{
    //objects of the interface are public abstract by default
    //objects in a interface should end with ;
    //variables of the interface are final by default

    double PI = 3.14;

    int getWheel();

    void setWheel(int numOfWheel);

    double getSpeed();

    void setSpeed(double speed);



}
