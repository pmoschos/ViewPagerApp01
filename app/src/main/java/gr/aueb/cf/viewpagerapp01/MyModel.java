package gr.aueb.cf.viewpagerapp01;

public enum MyModel {

    // defining colors
    RED(R.string.red, R.layout.view_red),
    BLUE(R.string.blue, R.layout.view_blue),
    GREEN(R.string.green, R.layout.view_green);

    private int mTitleID;
    private int mLayoutID;

    MyModel(int mTitleID, int mLayoutID) {
        this.mTitleID = mTitleID;
        this.mLayoutID = mLayoutID;
    }

    public int getmTitleID() {
        return mTitleID;
    }

    public void setmTitleID(int mTitleID) {
        this.mTitleID = mTitleID;
    }

    public int getmLayoutID() {
        return mLayoutID;
    }

    public void setmLayoutID(int mLayoutID) {
        this.mLayoutID = mLayoutID;
    }
}
