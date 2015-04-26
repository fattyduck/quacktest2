package nyc.c4q.fattyduck;
import java.util.List;

/**
 * Created by fattyduck on 4/26/15.
 */
public abstract class myList extends myCollections implements List
{

    public boolean addAll(List c){
        return false;

    }

    public boolean containsAll(List o){
        return false;

    }

    public boolean removeAll(List o){
        return false;
    }

    public boolean retainAll(List o){
        return false;
    }


}
