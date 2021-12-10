package edu.miracostacollege.waterdoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PHTestDetailsActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_h_test_details);

        TextView pHNumber = findViewById(R.id.pHNumber);

        double phValue = getIntent().getDoubleExtra("TestResult", 0);

        pHNumber.setText(Double.toString(phValue));

    }

    public void goToFAQ(View v)
    {
        Intent intent = new Intent(this, FAQActivity.class);
        startActivity(intent);
    }
}
