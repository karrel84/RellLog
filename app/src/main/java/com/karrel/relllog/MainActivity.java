package com.karrel.relllog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.karrel.mylibrary.RLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testE();
        testI();
        testD();
    }

    private void testD() {
        RLog.d();
        RLog.d("hello I'm test d");
    }

    private void testI() {
        RLog.i();
        RLog.i("hello I'm test i");
    }

    private void testE() {
        RLog.e();
        RLog.e("hello I'm test e");
    }

}
