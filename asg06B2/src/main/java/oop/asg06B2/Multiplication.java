package oop.asg06B2;

/**
 * Created with IntelliJ IDEA.
 * User: GIAQUAN
 * Date: 23/07/2014
 * Time: 19:00
 * To change this template use File | Settings | File Templates.
 */
public class Multiplication implements BinaryExpression {
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
    public Multiplication(Expression _left,Expression _right)
    {
        left=_left;
        right=_right;
    }
    public int evaluate()
    {
     return left.evaluate()*right.evaluate();
    }
    public String toString()
    {
        return String.format("(%s*%s)",left,right);
    }
}
