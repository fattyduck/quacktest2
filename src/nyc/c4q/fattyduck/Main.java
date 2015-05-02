package nyc.c4q.fattyduck;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Ship[] ships = new Ship[3];
        ships[0]= new CruiseShip("zero", 100);
        ships[1]= new CargoShip("one", 200);
        ships[2]  = new Ship();
        ships[2].setName("three");
        ships[2].setYear(1200);

        for(int i = 0; i < 3; i++ ){
            System.out.println(ships[i].toString());
        }
    }
}
