package com.devtides.androidarchitectures.mvp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.devtides.androidarchitectures.R;

public class MVPActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp);
        setTitle("MVP Activity");


    }

    public static Intent getIntent(Context context) {
        return new Intent(context, MVPActivity.class);
    }
}
