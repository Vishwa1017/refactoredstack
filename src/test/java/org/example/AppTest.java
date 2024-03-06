package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.EmptyStackException;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    public void testInitalFunctionalities()
    {
        MyStack myStack = new MyStack();
        myStack.push(5);
        myStack.push(6);
        assertEquals(6,myStack.pop());
    }

    public void testAfterDelegationVariable()
    {
        MyStack myStack = new MyStack();
        myStack.push(5);
        myStack.push(8);
        assertEquals(8,myStack.pop());
    }
}
