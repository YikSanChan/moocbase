package edu.berkeley.cs186.database.common.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class FilterIterator<E> implements Iterator<E> {

    private final Iterator<E> iterator;
    private final Predicate<E> predicate;
    /** The next object in the iteration */
    private E nextObject;
    /** Whether the next object has been calculated yet */
    private boolean nextObjectSet = false;

    public FilterIterator(Iterator<E> iterator, Predicate<E> predicate) {
        this.iterator = iterator;
        this.predicate = predicate;
    }

    @Override
    public boolean hasNext() {
        return nextObjectSet || setNextObject();
    }

    @Override
    public E next() {
        if (!nextObjectSet && !setNextObject()) {
            throw new NoSuchElementException();
        }
        nextObjectSet = false;
        return nextObject;
    }

    /**
     * Set nextObject to the next object. If there are no more
     * objects then return false. Otherwise, return true.
     */
    private boolean setNextObject() {
        while (iterator.hasNext()) {
            final E object = iterator.next();
            if (predicate.test(object)) {
                nextObject = object;
                nextObjectSet = true;
                return true;
            }
        }
        return false;
    }
}
