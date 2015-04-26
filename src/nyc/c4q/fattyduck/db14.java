package nyc.c4q.fattyduck;
/**
 * Created by fattyduck on 4/26/15.
 */
public class db14
{
    public static void main(String[] args){
        Animal generic = new Animal();
        System.out.println(generic.getName()+generic.favFood);

        Cat cat = new Cat("cat", "salmon", "balls");
        System.out.println();
        System.out.println(cat.getName());
        System.out.println(cat.favToy);
        System.out.println(cat.favFood);

        //Java on its own cannot find any fields outside of super class, so favToy "Tom" needs to be
        //casted before usage
        Animal jerry = new Cat("jerry", "cheese", "Tom");
        System.out.println();
        acceptAnimal(jerry);
        System.out.println();
        isCat(jerry);
    }

    public static void acceptAnimal(Animal rand){

        System.out.println(rand.getName());
        System.out.println(rand.favFood);
        rand.walk();
        Cat cat=(Cat) rand;
        System.out.println(((Cat) rand).favToy);
    }

    public static void isCat(Animal rand){
        if(rand instanceof Cat){
            System.out.println(rand.getName() + " is a Cat");
        }
    }
}
