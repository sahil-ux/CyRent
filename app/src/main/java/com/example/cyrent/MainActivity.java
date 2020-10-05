package com.example.cyrent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
// driver == lender, customer == rider
public class MainActivity extends AppCompatActivity {
    private Button mLender, mRider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLender = (Button) findViewById(R.id.lender);
        mRider = (Button) findViewById(R.id.rider);

        mLender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LenderLoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });
        mRider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RiderLoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
}