package oop.asg06B1;
/**
 * Created with IntelliJ IDEA.
 * User: GIAQUAN
 * Date: 23/07/2014
 * Time: 18:43
 * To change this template use File | Settings | File Templates.
 */
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestExpression {

    @Test
    public void testNumeralEvaluate() {
        Expression two = new Numeral(2);
        assertEquals(2, two.evaluate());
    }

    @Test
    public void testNumeralToString() {
        Expression two = new Numeral(2);
        assertEquals("2", two.toString());
    }

    @Test
    public void testSquareEvaluate() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        assertEquals(4, twoSquare.evaluate());
    }

    @Test
    public void testSquareToString() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        assertEquals("2^2", twoSquare.toString());
    }

    @Test
    public void testAdditionEvaluate() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        Expression twoPlusTwoSquare = new Addition(two, twoSquare);
        assertEquals(6, twoPlusTwoSquare.evaluate());
    }
    @Test
    public void testAdditionToString() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        Expression twoPlusTwoSquare = new Addition(two, twoSquare);
        assertEquals("(2 + 2^2)", twoPlusTwoSquare.toString());
    }

    @Test
    public void testAdditionWithParenthesesToString() {
        Expression one = new Numeral(1);
        Expression threeSquare = new Square(new Numeral(3));
        Expression threeSquarePlusOne = new Addition(threeSquare, one);
        Expression theBigSquare = new Square(threeSquarePlusOne);
        assertEquals("(3^2 + 1)^2", theBigSquare.toString());
    }
    @Test
     public void testSubtractionevaluate(){
        Expression two = new Numeral(2);
        Expression  oneSquare = new Square(new Numeral(1));
        Expression add = new Addition(two,oneSquare);
        Expression sub = new Subtraction(add,two);
        assertEquals(1,sub.evaluate());
    }
    @Test
    public void testSubtractiontoString(){
        Expression two = new Numeral(2);
        Expression  oneSquare = new Square(new Numeral(1));
        Expression add = new Addition(two,oneSquare);
        Expression sub = new Subtraction(add,two);
        assertEquals("((2 + 1^2)-2)",sub.toString());
    }
    @Test
    public void testMultiplicationevaluate(){
        Expression two = new Numeral(2);
        Expression  oneSquare = new Square(new Numeral(1));
        Expression add = new Addition(two,oneSquare);
        Expression sub = new Multiplication(add,two);
        assertEquals(6,sub.evaluate());
    }
    @Test
    public void  testMultiplicationtoString(){
        Expression two = new Numeral(2);
        Expression  oneSquare = new Square(new Numeral(1));
        Expression add = new Addition(two,oneSquare);
        Expression sub = new Multiplication(add,two);
        assertEquals("((2 + 1^2)*2)",sub.toString());
    }
}

