package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office
        extends Building
{
    
    private String mBusinessName;
    
    private int mParkingSpaces;
    
    private static int sTotalOffices = 0;
    
    /**
     * Constructor.
     */
    public Office(int length, int width, int lotLength, int lotWidth)
    {
        super(length, width, lotLength, lotWidth);
        mBusinessName = null;
        mParkingSpaces = 0;
        sTotalOffices++;
    }
    
    /**
     * Constructor.
     */
    public Office(int length, int width, int lotLength, int lotWidth,
                  String businessName)
    {
        this(length, width, lotLength, lotWidth);
        mBusinessName = businessName;
    }
    
    /**
     * Constructor.
     */
    public Office(int length, int width, int lotLength, int lotWidth,
                  String businessName,
                  int parkingSpaces)
    {
        this(length, width, lotLength, lotWidth, businessName);
        mParkingSpaces = parkingSpaces;
    }
    
    public String getBusinessName() {return mBusinessName;}
    
    public int getParkingSpaces() {return mParkingSpaces;}
    
    public void setBusinessName(String businessName)
    {
        mBusinessName = businessName;
    }
    
    public void setParkingSpaces(int parkingSpaces)
    {
        mParkingSpaces = parkingSpaces;
    }
    
    public String toString()
    {
        String ans = "Business: ";
        if (mBusinessName == null)
            ans += "unoccupied";
        else
            ans += mBusinessName;
        if (mParkingSpaces != 0)
            ans += "; has " + mParkingSpaces + " parking spaces";
        return ans + " (total offices: " + sTotalOffices + ")";
    }
    
    public boolean equals(Object other)
    {
        if (other instanceof Office)
            return (calcBuildingArea() == ((Office)other).calcBuildingArea() &&
                    mParkingSpaces == ((Office)other).mParkingSpaces);
        else
            return false;
    }
}
