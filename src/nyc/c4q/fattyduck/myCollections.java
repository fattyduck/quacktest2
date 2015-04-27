package nyc.c4q.fattyduck;
/**
 * Created by fattyduck on 4/26/15.
 */
import java.util.Collection;
import java.util.Iterator;

public class myCollections<E> implements Collection<E>
{
    Object[] myArray = new Object[0];

    public boolean add(E o){

        return false;
    }

    public boolean addAll(Collection c){
        return false;

    }

    public void clear() {

    }

    public boolean contains(Object o){
        boolean b = false;
        for(int i = 0; i<myArray.length; i++ )
        {
            if(myArray[i].equals(0)){
                b = true;
            }
        }
        return b;

    }

    public boolean containsAll(Collection o){


        return false;

    }

    public boolean equals(Object c){
        return myArray.equals(c);
    }

    public int hashcode(){
        return 0;
    }

    public boolean isEmpty(){
        return myArray.length==0;
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
        return myArray.length;
    }

    public Object[] toArray(){
        return null;

    }

    public Object[] toArray(Object[] a){
        return null;
    }


}

