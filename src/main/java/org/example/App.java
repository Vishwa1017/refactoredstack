package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MyStack myStack = new MyStack();
        myStack.push(1);
        System.out.println(myStack.pop());
    }
}
