package Ch19_JavaGenerics;

import java.util.ArrayList;

// wrapping
public class DummyArray<E> {
    private ArrayList<E> al;
    private final int SIZE = 10;

    DummyArray(){
        al = new ArrayList<>();
        al.ensureCapacity(SIZE);
    }

    public E get(int index) throws IndexOutOfBoundsException{
        if (index > al.size())
            throw new IndexOutOfBoundsException();
        else
            return al.get(index);
    }

    public void add(E element) throws Exception{
        if (al.size() == SIZE)
            throw new Exception("Array is full");
        else{
            al.add(element);
        }
    }

    @Override
    public String toString() {
        return "DummyArray{" +
                "al=" + al +
                ", SIZE=" + SIZE +
                '}';
    }
}
