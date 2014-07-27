package oop.asg06;

/**
 * Created with IntelliJ IDEA.
 * User: GIAQUAN
 * Date: 23/07/2014
 * Time: 18:19
 * To change this template use File | Settings | File Templates.
 */
 abstract public class BinaryExpression extends Expression {
    Expression left;
    Expression right;
    public Expression left()
    {
        return left;
    }
    public Expression right()
    {
        return right;
    }
}
