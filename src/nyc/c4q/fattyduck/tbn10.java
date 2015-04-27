/**
 * Created by Fattyduck on 4/27/2015.
 */
package nyc.c4q.fattyduck;
import java.util.*;
public class tbn10
{
    public static void main(String[] args){
        Character[] ray = {'p','w','n'};
        List<Character> l = Arrays.asList(ray);
        System.out.print("The list: ");
        output(l);

        Collections.reverse(l);
        System.out.println("After reverse");
        output(l);

        Character[] newRay = new Character[3];
        List<Character> listCopy = Arrays.asList(newRay);
        Collections.copy(listCopy, l);
        System.out.println("Copy of List: ");
        output(listCopy);

        Collections.fill(l, 'X');
        System.out.println("AFter fill: ");
        output(l);


    }

    private static void output(List<Character> list){
        for(Character c: list){
            System.out.printf("%s ", c);
        }
        System.out.println();
    }
}
