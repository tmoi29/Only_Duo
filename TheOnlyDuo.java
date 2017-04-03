import java.util.ArrayList;

public class TheOnlyDuo<T> implements Deque<T>{

    //Instance vars
    private int _size;
    private ArrayList<T> _deque;

    //Default constructor
    public TheOnlyDuo(){
	_deque = new ArrayList<T>();
	_size = 0;
    }

    //Adds element to front
    public void addFirst(T x){
	_deque.add(0,x);
    }

    //Adds element to back
    public void addLast(T x){
	_deque.add(_size,x);
    }

    //Removes element from front
    public T removeFirst(){
	T x = _deque.remove(0);
	_size--;
	return x;
    }

    //Removes element from back
    public T removeLast(){
	T x = _deque.remove(_size-1);
	_size--;
	return x;
    }

    //Returns element at front
    public T peekFirst(){
        return _deque.get(0);

    }

    //Returns element at back
    public T peekLast(){
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
