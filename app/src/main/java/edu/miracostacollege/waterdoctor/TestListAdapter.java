package edu.miracostacollege.waterdoctor;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.Arrays;
import java.util.List;

import edu.miracostacollege.waterdoctor.model.Test;

public class TestListAdapter extends ArrayAdapter<Test>
{
    private Context mContext;
    private List<Test> mTestsList;
    private int mResourceId;

    public TestListAdapter(Context c, int rId, List<Test> tests)
    {
        super(c, rId, tests);
        mContext = c;
        mResourceId = rId;
        mTestsList = tests;
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public View getView(int pos, View convertView, ViewGroup parent)
    {
        final Test selectedTest = mTestsList.get(pos);

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(mResourceId, null);



        LinearLayout testListLinearLayout = view.findViewById(R.id.testListLinearLayout);
        testListLinearLayout.setTag(selectedTest);


        TextView testName = view.findViewById(R.id.testName);
        TextView testResult = view.findViewById(R.id.testResult);

        testName.setText(selectedTest.getmName());
        // If anything other than default, set the "test result" text to result value, otherwise leave as "N/A"
        if (selectedTest.getmTestResult() != -1000)
        {
            if (selectedTest.getmName().equals("pH"))
                testResult.setText(Double.toString(selectedTest.getmTestResult()));
            else if (selectedTest.getmName().equals("Conductance"))
                testResult.setText(Double.toString(selectedTest.getmTestResult()) + " μS/cm");
            else if (selectedTest.getmName().equals("Temperature"))
                testResult.setText(Double.toString(selectedTest.getmTestResult()) + " °C");
            else if (selectedTest.getmName().equals("Turbidity"))
                testResult.setText(Double.toString(selectedTest.getmTestResult()) + " NTU");
            else if (selectedTest.getmName().equals("Dissolved Oxygen"))
                testResult.setText(Double.toString(selectedTest.getmTestResult()) + " %");
        }


        // Determining what color to make text
        if (selectedTest.getMColorCode() == 1)
        {
            testName.setTextColor(Color.GREEN);
            testResult.setTextColor(Color.GREEN);
        }
        else if (selectedTest.getMColorCode() == 2)
        {
            testListLinearLayout.setBackgroundColor(Color.RED);
        }


        return view;
    }
}
