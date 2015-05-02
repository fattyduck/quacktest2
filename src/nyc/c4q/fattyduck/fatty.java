/**
 * Created by Fattyduck on 4/26/2015.
 */
package nyc.c4q.fattyduck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fatty {
    public void digest(food x){
        x.eat();
    }

    public static List wordsWithoutList(String[] words, int len) {
        List<String> l = new ArrayList<String>();
        for(int i=0; i<words.length; i++)
        {
            if(words[i].length()!=len)
            {
                l.add(words[i]);

            }
        }
        return l;
    }

    public static void main(String[] args){
        String[] a = {"a", "bb", "b", "ccc"};
        System.out.println(wordsWithoutList(a, 1));
        wordsWithoutList(a,3);
        wordsWithoutList(a,4);
    }

}
