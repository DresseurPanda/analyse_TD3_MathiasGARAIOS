package com.iutblagnac.r303trace;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
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
     * Test the return with empty parameter
     */
    public void testHelloEmptyParameter()
    {
        assertEquals("Hello World!", App.hello());
    }

    /**
     * Test the return with a parameter
     */
    public void testHelloParameter()
    {
        assertEquals("Hello JMB!", App.hello("Hello JMB!"));
    }

    public void testPersonneConstructeurParDefaut()
    {
        Personne p = new Personne();
        assertEquals("Bob", p.prenom);
        assertEquals("Pascal", p.nom);
    }
    public void testPersonneConstructeur()
    {
        Personne p = new Personne("Jean", "Michel");
        assertEquals("Jean", p.nom);
        assertEquals("Michel", p.prenom);
    }

    public void testTravail()
    {
        Personne p = new Personne("Jean", "Michel");
        
        p.travailler();
        assertEquals(true, p.travail);
    }

    public void testPresenterQuandTravail() {
    Personne p = new Personne();
    p.travailler();

    String expected = "Me déranger pas je bricole, -_-" ;
    assertEquals(expected, p.presenter());
    }

    public void testPresenterQuandPasTravail() {
        Personne p = new Personne("Jean", "Michel");

        String expected = "Je suis " + "Michel" + "\n" + //
                            "Je suis " + "Michel" + "\n" + //
                            "Je suis " + "Michel" + ", je suis " + "Michel" + " " + "Jean";
        assertEquals(expected, p.presenter());
    }
}
