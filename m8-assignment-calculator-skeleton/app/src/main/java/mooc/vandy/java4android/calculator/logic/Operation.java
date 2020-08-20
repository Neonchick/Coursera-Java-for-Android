package mooc.vandy.java4android.calculator.logic;

/**
 * Class of abstract operation.
 */
public abstract class Operation
{
    /**
     * Field of the first argument.
     */
    private int mArgumentOne;
    
    /**
     * Field of the second argument.
     */
    private int mArgumentTwo;
    
    /**
     * Constructor without parameters.
     */
    public Operation()
    {
        mArgumentOne = 0;
        mArgumentTwo = 0;
    }
    
    /**
     * Constructor.
     */
    public Operation(int argumentOne, int argumentTwo)
    {
        mArgumentOne = argumentOne;
        mArgumentTwo = argumentTwo;
    }
    
    /**
     * Getter of the first argument.
     */
    public int getArgumentOne() { return mArgumentOne; }
    
    /**
     * Getter of the second argument.
     */
    public int getArgumentTwo() { return mArgumentTwo; }
    
    /**
     * Setter of the first argument.
     */
    public void setArgumentOne(int argumentOne) { mArgumentOne = argumentOne; }
    
    /**
     * Setter of the second argument.
     */
    public void setArgumentTwo(int argumentTwo) { mArgumentTwo = argumentTwo; }
    
    /**
     * Method for getting the operation result.
     */
    public abstract String getResult();
}
