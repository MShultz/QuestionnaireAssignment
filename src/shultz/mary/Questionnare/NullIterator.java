package shultz.mary.Questionnare;

import java.util.Iterator;

/**
 * Created by Mary on 5/15/2017.
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove(){
        throw new UnsupportedOperationException();
    }
}
