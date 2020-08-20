package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide
        extends Operation
{
    /**
     * Constructor without parameters.
     */
    public Divide() {}
    
    /**
     * Constructor.
     */
    public Divide(int argumentOne, int argumentTwo)
    {
        super(argumentOne, argumentTwo);
    }
    
    /**
     * Method for getting the addition result.
     */
    @Override
    public String getResult()
    {
        // Сhecking division by zero.
        if (getArgumentTwo() == 0)
            return "ERROR: Division by zero.";
        
        //We get the integer part and the remainder of the division.
        Integer result = getArgumentOne() / getArgumentTwo();
        Integer remainder = getArgumentOne() % getArgumentTwo();
    
        // Combine them in result.
        return result + " R: " + remainder;
    }
}
