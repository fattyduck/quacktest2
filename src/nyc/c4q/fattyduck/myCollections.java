package nyc.c4q.fattyduck;
/**
 * Created by fattyduck on 4/26/15.
 */
import java.util.Collection;
import java.util.Iterator;

public class myCollections<E> implements Collection<E>
{

    public boolean add(E o){

        return false;
    }

    public boolean addAll(Collection c){
        return false;

    }

    public void clear() {

    }

    public boolean contains(Object o){
        return false;

    }

    public boolean containsAll(Collection o){
        return false;

    }

    public boolean equals(Object c){
        return false;
    }

    public int hashcode(){
        return 0;
    }

    public boolean isEmpty(){
        return false;
    }

    public Iterator iterator(){
        return null;

    }

    public boolean remove(Object o){
        return false;
    }

    public boolean removeAll(Collection o){
        return false;
    }

    public boolean retainAll(Collection o){
        return false;
    }

    public int size(){
        return 1;
    }

    public Object[] toArray(){
        return null;

    }

    public Object[] toArray(Object[] a){
        return null;
    }


}

