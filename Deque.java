
public interface Deque<E>
{
    public void addFirst( E e );

    public void addLast( E e );
   
    public E removeFirst();

    public E removeLast();

    public E peekFirst();

    public E peekLast();

    public boolean isEmpty();

}
