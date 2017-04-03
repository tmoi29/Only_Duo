
public interface Deque<P>
{
    public void offerFirst( P p );

    public void offerLast( P p );
   
    public Card pollFirst();

    public Card pollLast();

    public Card peekFirst();

    public Card peekLast();

    public boolean isEmpty();

}
