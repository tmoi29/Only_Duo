
public interface Deque<P>
{
    public void addFirst( E e );

    public void addLast( E e );
   
    public Card removeFirst();

    public Card removeLast();

    public Card peekFirst();

    public Card peekLast();

    public boolean isEmpty();

}
