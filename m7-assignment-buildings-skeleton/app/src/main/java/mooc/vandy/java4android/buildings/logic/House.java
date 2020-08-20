package mooc.vandy.java4android.buildings.logic;

import java.security.acl.Owner;

/**
 * This is the House class file that extends Building.
 */
public class House
        extends Building
{
    
    private String mOwner;
    
    private boolean mPool;
    
    /**
     * Constructor.
     */
    public House(int length, int width, int lotLength, int lotWidth)
    {
        super(length, width, lotLength, lotWidth);
        mOwner = null;
        mPool = false;
    }
    
    /**
     * Constructor.
     */
    public House(int length, int width, int lotLength, int lotWidth,
                 String owner)
    {
        this(length, width, lotLength, lotWidth);
        mOwner = owner;
    }
    
    /**
     * Constructor.
     */
    public House(int length, int width, int lotLength, int lotWidth,
                 String owner, boolean pool)
    {
        this(length, width, lotLength, lotWidth, owner);
        mPool = pool;
    }
    
    public String getOwner() {return mOwner;}
    
    public boolean hasPool() {return mPool;}
    
    public void setOwner(String owner) {mOwner = owner;}
    
    public void setPool(boolean pool) {mPool = pool;}
    
    public String toString()
    {
        String ans = "Owner: ";
        if (mOwner == null)
            ans += "n/a";
        else
            ans += mOwner;
        if (mPool)
            ans += "; has a pool";
        if (calcLotArea() > calcBuildingArea())
            ans += "; has a big open space";
        return ans;
    }
    
    public boolean equals(Object other)
    {
        if (other instanceof House)
            return (calcBuildingArea() == ((House)other).calcBuildingArea() &&
                    mPool == ((House)other).mPool);
        else return false;
    }
}
