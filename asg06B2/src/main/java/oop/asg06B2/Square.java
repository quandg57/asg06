package oop.asg06B2;

/**
 * Created with IntelliJ IDEA.
 * User: GIAQUAN
 * Date: 23/07/2014
 * Time: 18:17
 * To change this template use File | Settings | File Templates.
 */
public class Square implements Expression {
    Expression expression;
    public Square(Expression expression1)
    {
        expression=expression1;
    }
    public int evaluate()
    {
        return expression.evaluate()*expression.evaluate();
    }
    public String toString()
    {
        return String.format("%s^2",expression)   ;
    }
}
