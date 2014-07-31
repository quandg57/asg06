package oop.asg06B2;

/**
 * Created with IntelliJ IDEA.
 * User: GIAQUAN
 * Date: 23/07/2014
 * Time: 18:15
 * To change this template use File | Settings | File Templates.
 */
public class Numeral implements Expression {
    public int value;
    public Numeral(int num)
    {
        value=num;
    }
    public int evaluate()
    {
        return value;
    }
    public String toString()
    {
        return String.format("%s",value);
    }
}
