package nyc.c4q.fattyduck;
/**
 * Created by fattyduck on 4/26/15.
 */
public abstract class Crashable
{
    boolean carDriveable = true;

    public void youCrashed(){
        carDriveable = false;
    }

    public abstract void setCarStrength(int carStrength);

    public abstract int getCarStrength();
}
