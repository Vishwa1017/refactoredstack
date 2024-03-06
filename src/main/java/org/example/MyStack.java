package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<E> extends ArrayList<E> {
    ArrayList<E> delegate;

    public MyStack() {
        delegate = new ArrayList<>();
    }

    public void push(E e) {
        delegate.add(e);
    }

    public E pop() {
        if (delegate.isEmpty()) throw new EmptyStackException();
        E e = delegate.get(size() - 1);
        delegate.remove(size() -1 );
        return e;
    }

    public boolean add(E e)
    {
        delegate.add(e);
        return true;
    }
    public boolean isEmpty()
    {
        return delegate.isEmpty();
    }

    public int size()
    {
        return delegate.size();
    }

    public E remove(int size)
    {
        return delegate.remove(size);
    }

}
