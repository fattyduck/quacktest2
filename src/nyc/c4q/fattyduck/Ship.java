package nyc.c4q.fattyduck;
/**
 * Created by fattyduck on 5/2/15.
 */
public class Ship
{
    private String name = "name";
    private int year = 1990;

    public Ship(){

    }

    public void setName(String name){
        this.name = name;
    }

    public void setYear(int year){
        this.year=year;
    }

    public String getName(){
        return this.name;
    }

    public int getYear(){
        return this.year;
    }

    public String toString(){

        return this.getName()+" "+this.getYear();
    }

}
