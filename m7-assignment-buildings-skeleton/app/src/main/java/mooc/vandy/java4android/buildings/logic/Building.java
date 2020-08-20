package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building
{
    private int mLength;
    
    private int mWidth;
    
    private int mLotLength;
    
    private int mLotWidth;
    
    /**
     * Constructor.
     */
    public Building(int length, int width, int lotLength, int lotWidth)
    {
        mLength = length;
        mWidth = width;
        mLotLength = lotLength;
        mLotWidth = lotWidth;
    }
    
    public int getLength() { return mLength; }
    
    public int getWidth() { return mWidth; }
    
    public int getLotLength() { return mLotLength; }
    
    public int getLotWidth() { return mLotWidth; }
    
    public void setLength(int value) { mLength = value; }
    
    public void setWidth(int value) { mWidth = value; }
    
    public void setLotLength(int value) { mLotLength = value; }
    
    public void setLotWidth(int value) { mLotWidth = value; }
    
    public int calcBuildingArea() { return mWidth * mLength; }
    
    public int calcLotArea() { return mLotWidth * mLotLength; }
    
    public String toString()
    {
        return "BuildingArea: " + calcBuildingArea() +
               "LotArea: " + calcLotArea();
    }
}
