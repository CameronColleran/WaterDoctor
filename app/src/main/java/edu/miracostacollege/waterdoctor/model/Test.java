package edu.miracostacollege.waterdoctor.model;

public class Test
{
    // Member variables
    private String mName;
    private double mTestResult = -1000;
    private int mColorCode = 0; // color codes: 0 - default (no color), 1 - green (tests passed), 2 - red (tests failed)


    // Methods

    // Constructor(s)
    public Test(String mName)
    {
        this.mName = mName;
    }

    public Test(String mName, double mTestResult)
    {
        this.mName = mName;
        this.mTestResult = mTestResult;
    }

    public Test(String mName, double mTestResult, int mColorCode)
    {
        this.mName = mName;
        this.mTestResult = mTestResult;
        this.mColorCode = mColorCode;
    }

    // Getters/Setters
    public String getmName()
    {
        return mName;
    }

    public void setmName(String mName)
    {
        this.mName = mName;
    }

    public double getmTestResult()
    {
        return mTestResult;
    }

    public void setmTestResult(double mTestResult)
    {
        this.mTestResult = mTestResult;
    }

    public int getMColorCode()
    {
        return mColorCode;
    }

    public void setMColorCode(int mColorCode)
    {
        this.mColorCode = mColorCode;
    }
}
