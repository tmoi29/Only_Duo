
public interface Deque<P>
{
    public void addFirst( P p );

    public void addLast( P p );
   
    public Card removeFirst();

    public Card removeLast();

    public Card peekFirst();

    public Card peekLast();

    public boolean isEmpty();

}
