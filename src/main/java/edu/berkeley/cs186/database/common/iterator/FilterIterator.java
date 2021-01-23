package edu.berkeley.cs186.database.common.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

// Don't want to bring in a whole lib just to use a class, so simply copy from:
// https://commons.apache.org/proper/commons-collections/jacoco/org.apache.commons.collections4.iterators/FilterIterator.java.html
public class FilterIterator<E> implements Iterator<E> {

    /** The iterator being used */
    private final Iterator<E> iterator;
    /** The predicate being used */
    private final Predicate<E> predicate;
    /** The next object in the iteration */
    private E nextObject;
    /** Whether the next object has been calculated yet */
    private boolean nextObjectSet = false;

    public FilterIterator(Iterator<E> iterator, Predicate<E> predicate) {
        super();
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
