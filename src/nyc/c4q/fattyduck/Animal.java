package nyc.c4q.fattyduck;
/**
 * Created by fattyduck on 4/26/15.
 */
public class Animal
{
    /*This is encapsulation
    *Private means only within class(in this case only Animal Class) can see and use the String name
    *Public means it is accessible by everyone
    * Protected means that only sub classes can use it
    * If you use final it means there is no change/override permitted
    */
    private String name = "Animal";
    public String favFood = "Food";

    protected final void setName(String newName){
        this.name = newName;
    }

    protected final String getName(){
        return this.name;
    }

    public void eatFood(){
        System.out.println("Yum "+favFood);
    }

    public void walk(){
        System.out.println(this.name+" is walking around");
    }

    public Animal(){

    }

    public Animal(String name){
        this.name = name;
    }

    public Animal(String name, String favFood){
        this.name = name;
        this.favFood =  favFood;
    }
}
