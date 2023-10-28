package ObservableBag;

public interface Bag {
    /** Add the string to the bag */
    public void add(String o);

    /** Remove the string s from the bag (if it is the bag). */
    public void remove(String o);

    /** Get the count of the string s in the bag. */
    public int getCount(String o);

}
