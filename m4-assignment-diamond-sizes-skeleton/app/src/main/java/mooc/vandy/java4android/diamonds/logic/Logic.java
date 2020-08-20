package mooc.vandy.java4android.diamonds.logic;

import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
        implements LogicInterface
{
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();
    
    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;
    
    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out)
    {
        mOut = out;
    }
    
    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size)
    {
        horizontalLine(size);
        upperPart(size);
        middlePart(size);
        bottomPart(size);
        horizontalLine(size);
    }
    
    /**
     * This is the method that will print upper and bottom border.
     *
     * @param size Size of diamond.
     */
    public void horizontalLine(int size)
    {
        mOut.print('+');
        printChars(2 * size, '-');
        mOut.println('+');
    }
    
    /**
     * This is the method that will print upper part of diamond.
     *
     * @param size Size of diamond.
     */
    public void upperPart(int size)
    {
        for (int i = 0; i < size - 1; i++)
        {
            mOut.print('|');
            printChars(size - i - 1, ' ');
            mOut.print('/');
            if (i % 2 == 0)
                printChars(2 * i, '=');
            else
                printChars(2 * i, '-');
            mOut.print('\\');
            printChars(size - i - 1, ' ');
            mOut.println('|');
        }
    }
    
    /**
     * This is the method that will print bottom part of diamond.
     *
     * @param size Size of diamond.
     */
    public void bottomPart(int size)
    {
        for (int i = 0; i < size - 1; i++)
        {
            mOut.print('|');
            printChars(i + 1, ' ');
            mOut.print('\\');
            if ((size - i) % 2 == 0)
                printChars(2 * (size - i - 2), '=');
            else
                printChars(2 * (size - i - 2), '-');
            mOut.print('/');
            printChars(i + 1, ' ');
            mOut.println('|');
        }
    }
    
    /**
     * This is the method that will print middle part of diamond.
     *
     * @param size Size of diamond.
     */
    public void middlePart(int size)
    {
        mOut.print('|');
        mOut.print('<');
        if (size % 2 == 0)
            printChars(size * 2 - 2, '-');
        else
            printChars(size * 2 - 2, '=');
        mOut.print('>');
        mOut.println('|');
    }
    
    /**
     * This is the method that will print some chars.
     * @param size Count of chars.
     * @param ch Char for print.
     */
    public void printChars(int size, char ch)
    {
        for (int i = 0; i < size; i++)
            mOut.print(ch);
    }
}
