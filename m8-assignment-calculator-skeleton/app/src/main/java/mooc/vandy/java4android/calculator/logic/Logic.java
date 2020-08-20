package mooc.vandy.java4android.calculator.logic;

import java.util.AbstractMap;
import java.util.HashMap;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic
        implements LogicInterface
{
    
    /**
     * Constants for marking operations.
     */
    private static final int ADDITION = 1;
    
    private static final int SUBTRACTION = 2;
    
    private static final int MULTIPLICATION = 3;
    
    private static final int DIVISION = 4;
    
    /**
     * Map for storing objects of various operations.
     */
    private AbstractMap<Integer, Operation> operationMap;
    
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;
    
    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out)
    {
        mOut = out;
        
        // Create a new HashMap.
        operationMap = new HashMap();
    
        // Put in map all operations.
        operationMap.put(ADDITION, new Add());
        operationMap.put(SUBTRACTION, new Subtract());
        operationMap.put(MULTIPLICATION, new Multiply());
        operationMap.put(DIVISION, new Divide());
    }
    
    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation)
    {
        // Find the right operation.
        Operation mOperation = operationMap.get(operation);
    
        // Set arguments.
        mOperation.setArgumentOne(argumentOne);
        mOperation.setArgumentTwo(argumentTwo);
    
        // Print the result of the operation.
        mOut.print(mOperation.getResult());
    }
}
