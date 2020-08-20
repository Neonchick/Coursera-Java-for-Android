package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add
        extends Operation
{
    /**
     * Constructor without parameters.
     */
    public Add() {}
    
    /**
     * Constructor.
     */
    public Add(int argumentOne, int argumentTwo)
    {
        super(argumentOne, argumentTwo);
    }
    
    /**
     * Method for getting the addition result.
     */
    @Override
    public String getResult()
    {
        Integer result = getArgumentOne() + getArgumentTwo();
        return result.toString();
    }
}
