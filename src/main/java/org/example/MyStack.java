package org.example;

import java.util.EmptyStackException;
import java.util.*;

public class MyStack<E> extends  ArrayList<E> {
    ArrayList<E> delegate;

    public MyStack() {
        delegate = this;
    }

    public void push(E e) {
        add(e);
    }

    public E pop() {
        if (isEmpty()) throw new EmptyStackException();
        E e = get(size() - 1);
        remove(size() -1 );
        return e;
    }


    /*public boolean add(E e)
    {
        delegate.add(e);
        return true;
    }*/
    public boolean isEmpty()
    {
        return delegate.isEmpty();
    }

    public int size()
    {
        return delegate.size();
    }

  /*  public E remove(int size)
    {
        return delegate.remove(size);
    }
*/
   /* public E get(int size) {
        return delegate.get(size);
    }*/


}
