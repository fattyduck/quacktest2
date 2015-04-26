package nyc.c4q.fattyduck;
/**
 * Created by fattyduck on 4/26/15.
 */
public class Cat extends Animal
{
    public String favToy = "Toy";

    public void walkAround(){
        System.out.println(this.getName() + " stalking around");
    }

    public Cat(){

    }

    public Cat(String name){

    }

    public Cat(String name, String favFood, String favToy){
        super(name, favFood);
        this.favToy = favToy;
    }
}
