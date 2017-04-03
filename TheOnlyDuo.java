import java.util.ArrayList;

public class TheOnlyDuo<E> implements Deque<E>{

    //Instance vars
    private int _size;
    private ArrayList<E> _deque;

    //Default constructor
    public TheOnlyDuo(){
	_deque = new ArrayList<E>();
	_size = 0;
    }

    //Adds element to front
    public void addFirst(E x){
	_deque.add(0,x);
    }

    //Adds element to back
    public void addLast(E x){
	_deque.add(_size,x);
    }

    //Removes element from front
    public E removeFirst(){
	E x = _deque.remove(0);
	_size--;
	return x;
    }

    //Removes element from back
    public E removeLast(){
	E x = _deque.remove(_size-1);
	_size--;
	return x;
    }

    //Returns element at front
    public E peekFirst(){
        return _deque.get(0);

    }

    //Returns element at back
    public E peekLast(){
	return _deque.get(_size-1);
    }

    //Returns true/false whether queue is empty or not
    public boolean isEmpty(){
	return _deque.get(0) == null;
    }

    //Returns number of meaningful elements in queue
    public int size(){
	return _size;
    }

    //For testing purposes
    public static void main(String[] args){

    }
}
