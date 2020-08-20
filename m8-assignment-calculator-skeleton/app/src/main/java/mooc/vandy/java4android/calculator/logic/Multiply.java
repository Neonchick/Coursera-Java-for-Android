package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply
        extends Operation
{
    /**
     * Constructor without parameters.
     */
    public Multiply() {}
    
    /**
     * Constructor.
     */
    public Multiply(int argumentOne, int argumentTwo)
    {
        super(argumentOne, argumentTwo);
    }
    
    /**
     * Method for getting the addition result.
     */
    @Override
    public String getResult()
    {
        Integer result = getArgumentOne() * getArgumentTwo();
        return result.toString();
    }
}
