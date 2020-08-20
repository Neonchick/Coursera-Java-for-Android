package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to manage a herd of snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class HerdManager
{
    /**
     * Reference to the output.
     */
    private OutputInterface mOut;
    
    /**
     * The input Gate object.
     */
    private Gate mEastGate;
    
    /**
     * The output Gate object.
     */
    private Gate mWestGate;
    
    /**
     * Maximum number of iterations to run the simulation.
     */
    private static final int MAX_ITERATIONS = 10;
    
    public static final int HERD = 24;
    
    /**
     * Constructor initializes the fields.
     */
    public HerdManager(OutputInterface out,
                       Gate westGate,
                       Gate eastGate)
    {
        mOut = out;
        
        mWestGate = westGate;
        mWestGate.open(Gate.IN);
        
        mEastGate = eastGate;
        mEastGate.open(Gate.OUT);
        
        mOut.println("East Gate: This gate is closed");
        mOut.println("West Gate: This gate is closed");
    }
    
    /**
     * Method for emulation of a pen for the snail.
     */
    public void simulateHerd(Random rand)
    {
        int inPen = HERD;
        for (int i = 0; i < MAX_ITERATIONS; i++)
        {
            mOut.println("There are currently " +
                         inPen + " snails in the pen and" +
                         (HERD - inPen) + " snails in the pasture");
            // If all the snails are in the pen.
            if (inPen == HERD)
            {
                inPen += mEastGate.thru(rand.nextInt(HERD) + 1);
                continue;
            }
            // If all the snails are out of the pen.
            if (inPen == 0)
            {
                inPen += mWestGate.thru(rand.nextInt(HERD) + 1);
                continue;
            }
            // If some snails are in the pen and some are not.
            if (rand.nextBoolean())
                inPen += mEastGate.thru(rand.nextInt(inPen) + 1);
            else
                inPen += mWestGate.thru(rand.nextInt(HERD - inPen) + 1);
        }
        mOut.println("There are currently " +
                     inPen + " snails in the pen and" +
                     (HERD - inPen) + " snails in the pasture");
    }
    
}
