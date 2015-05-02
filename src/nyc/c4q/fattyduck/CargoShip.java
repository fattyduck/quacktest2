package nyc.c4q.fattyduck;
/**
 * Created by fattyduck on 5/2/15.
 */
public class CargoShip extends Ship
{
    int maxCargo = 100;

    public CargoShip(String name, int maxCargo){
        this.setName(name);
        this.maxCargo=maxCargo;
    }

    public void setMaxCargo(int maxCargo){
        this.maxCargo=maxCargo;
    }

    public int getMaxCargo(){
        return this.maxCargo;
    }

    @Override
    public String toString(){
        return this.getName()+" "+this.maxCargo;
    }
}
