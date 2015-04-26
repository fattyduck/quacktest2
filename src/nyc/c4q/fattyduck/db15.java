package nyc.c4q.fattyduck;
/**
 * Created by fattyduck on 4/26/15.
 */
public class db15
{
    public static void main(String[] args){
        Vehicles car = new Vehicles(4,160);
        Vehicles motorcycle = new Vehicles(2, 120);

        car.setCarStrength(10);

        System.out.println(car.getCarStrength());
        System.out.println(motorcycle.getCarStrength());
    }
}
