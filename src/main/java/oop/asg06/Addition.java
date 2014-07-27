package oop.asg06;

/**
 * Created with IntelliJ IDEA.
 * User: GIAQUAN
 * Date: 23/07/2014
 * Time: 18:21
 * To change this template use File | Settings | File Templates.
 */
public class Addition extends BinaryExpression{
    Expression left;
    Expression right;
    public Addition (Expression _left, Expression _right)
    {
        left=_left;
        right=_right;
    }
    public int evaluate()
    {
        return left.evaluate()+right.evaluate();
    }
    public String toString()
    {
        return String.format("(%s + %s)",left,right);
    }
}
