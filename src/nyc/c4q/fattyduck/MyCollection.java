import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/**
 * Created by Fattyduck on 4/26/2015.
 */
public class MyCollection implements Collection {

   public Object[] array = new Object[0];

    public MyCollection(Object[] array){
        this.array = array;
    }
    @Override
    public int size() {
        return this.array.length;
    }
    @Override
    public boolean isEmpty() {
        return this.array.length==0;
    }
    @Override
    public boolean contains(Object o) {
        boolean b = false;
        for(Object object: this.array){
            if(object.equals(o)){
                b=true;
            }    
        }
        return b;
    }
    @Override
    public Iterator iterator() {
        return iterator();
    }
    @Override
    public Object[] toArray() {
        return this.array;
    }
    @Override
    public boolean add(Object o) {
        Object[] newArray = new Object[this.array.length+1];
        for(int i = 0; i<this.array.length;i++){
            newArray[i] = this.array[i];
        }
        newArray[this.array.length] = o;
        this.array=newArray;
        return false;
    }
    @Override
    public boolean remove(Object o) {
        return false;
    }
    @Override
    public boolean addAll(Collection c) {
        return false;
    }
    @Override
    public void clear() {

    }
    @Override
    public boolean retainAll(Collection c) {
        return false;
    }
    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
