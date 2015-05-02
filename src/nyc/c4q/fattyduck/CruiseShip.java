package nyc.c4q.fattyduck;
/**
 * Created by fattyduck on 5/2/15.
 */
public class CruiseShip extends Ship
{
    int maxPassanger = 100;

    public CruiseShip(String name, int maxPassanger){
        this.setName(name);
        this.maxPassanger=maxPassanger;
    }

    public void setMaxPassanger(int maxPassanger){
        this.maxPassanger=maxPassanger;
    }

    public int getMaxPassanger(){
        return this.maxPassanger;
    }
    @Override
    public String toString(){
        return this.getName()+" "+this.maxPassanger;
    }
}
