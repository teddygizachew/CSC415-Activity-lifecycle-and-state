package com.nkufall2021.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivityOne(View view) {
        Log.d(TAG, "launchSecondActivityOne: button clicked");
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key", "one");
        startActivity(intent);

    }

    public void launchSecondActivityTwo(View view) {
        Log.d(TAG, "launchSecondActivityTwo: button clicked");
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key", "two");
        startActivity(intent);
    }

    public void launchSecondActivityThree(View view) {
        Log.d(TAG, "launchSecondActivityThree: button clicked");
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key", "three");
        startActivity(intent);
    }
}