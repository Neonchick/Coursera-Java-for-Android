package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to fill the corral with snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class FillTheCorral
{
    /**
     * Reference to the OutputInterface.
     */
    private OutputInterface mOut;
    
    /**
     * Constructor initializes the field.
     */
    FillTheCorral(OutputInterface out)
    {
        mOut = out;
    }
    
    /**
     * Method will randomly set each gate to swing IN, OUT, or leave it CLOSED.
     */
    public void setCorralGates(Gate[] gate, Random selectDirection)
    {
        for (Gate curGate : gate)
            curGate.setSwing(selectDirection.nextInt(3) - 1);
    }
    
    /**
     * Method that checks whether the array has a gate with the IN direction.
     */
    public boolean anyCorralAvailable(Gate[] corral)
    {
        for (Gate curGate : corral)
            if (curGate.getSwingDirection() == Gate.IN)
                return true;
        return false;
    }
    
    /**
     * Method gets the number of attempts that were
     * required to corral all the snails.
     */
    public int corralSnails(Gate[] corral, Random rand)
    {
        mOut.println("Initial gate setup:");
        for (int i = 0; i < corral.length; i++)
            switch (corral[i].getSwingDirection())
            {
                case Gate.IN:
                    mOut.println("Gate " + i +
                                 ": This gate is open and swings " +
                                 "to enter the pen only");
                    break;
                case Gate.OUT:
                    mOut.println("Gate " + i +
                                 ": This gate is open and swings " +
                                 "to exit the pen only");
                    break;
                case Gate.CLOSED:
                    mOut.println("Gate " + i +
                                 ": This gate is close");
                    break;
            }
        
        int countOut = 5;
        int attempts = 0;
        do
        {
            attempts++;
            int snails = rand.nextInt(countOut);
            int gate = rand.nextInt(corral.length);
            countOut -= corral[gate].thru(snails);
            mOut.println(snails + " are trying to move through corral " + gate);
        }
        while (countOut != 0);
        mOut.println("It took " + attempts +
                     " attempts to corral all of the snails.");
        
        return attempts;
    }
}
