package mooc.vandy.java4android.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage
        extends House
{
    
    private boolean mSecondFloor;
    
    /**
     * Constructor.
     */
    public Cottage(int dimension, int lotLength, int lotWidth)
    {
        super(dimension, dimension, lotLength, lotWidth);
        mSecondFloor = false;
    }
    
    /**
     * Constructor.
     */
    public Cottage(int dimension, int lotLength, int lotWidth, String owner,
                   boolean secondFloor)
    {
        super(dimension, dimension, lotLength, lotWidth, owner);
        mSecondFloor = secondFloor;
    }
    
    public boolean hasSecondFloor() {return mSecondFloor;}
    
    public String toString()
    {
        String ans = super.toString();
        if (mSecondFloor)
            ans += "; is a two story cottage";
        return ans;
    }
    
}

