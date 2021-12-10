package edu.miracostacollege.waterdoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import edu.miracostacollege.waterdoctor.model.Test;

public class MainActivity extends AppCompatActivity
{

    private List<Test> mTests;
    private ListView mTestListView;
    private TestListAdapter mTestListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTests = new ArrayList<>();

        mTests.add(new Test("pH"));
        mTests.add(new Test("Conductance"));
        mTests.add(new Test("Temperature"));
        mTests.add(new Test("Turbidity"));
        mTests.add(new Test("Dissolved Oxygen"));

        mTestListAdapter = new TestListAdapter(this, R.layout.test_list_item, mTests);
        mTestListView = findViewById(R.id.testsListView);

        mTestListView.setAdapter(mTestListAdapter);

    }

    public void mockTestsRun(View v)
    {
        TextView jumbotronTestResult = findViewById(R.id.jumbotronTestResult);

        jumbotronTestResult.setText(R.string.good);
        jumbotronTestResult.setTextColor(Color.GREEN);


        // Updating ph
        mTests.get(0).setmTestResult(7.4);
        mTests.get(0).setMColorCode(1);

        // Updating conductance
        mTests.get(1).setmTestResult(384);
        mTests.get(1).setMColorCode(1);

        // Updating temp
        mTests.get(2).setmTestResult(22.3);
        mTests.get(2).setMColorCode(1);

        // Updating turbidity
        mTests.get(3).setmTestResult(0.8);
        mTests.get(3).setMColorCode(1);

        // Updating Dissolved Oxygen
        mTests.get(4).setmTestResult(94);
        mTests.get(4).setMColorCode(1);

        mTestListAdapter.notifyDataSetChanged();


    }

    public void viewTestDetails(View v)
    {
        Test selectedTest = (Test) v.getTag();
        Intent intent = null;

        if(selectedTest.getmName().equals("pH"))
        {
            intent = new Intent(this, PHTestDetailsActivity.class);
        }

        intent.putExtra("TestResult", selectedTest.getmTestResult());
        startActivity(intent);
    }

    public void goToMapActivity(View v)
    {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);

    }

}
