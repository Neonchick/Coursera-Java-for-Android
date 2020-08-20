package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract
        extends Operation
{
    /**
     * Constructor without parameters.
     */
    public Subtract() {}
    
    /**
     * Constructor.
     */
    public Subtract(int argumentOne, int argumentTwo)
    {
        super(argumentOne, argumentTwo);
    }
    
    /**
     * Method for getting the addition result.
     */
    @Override
    public String getResult()
    {
        Integer result = getArgumentOne() - getArgumentTwo();
        return result.toString();
    }
}
