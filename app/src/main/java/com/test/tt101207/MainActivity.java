package com.test.tt101207;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        File f1 = getFilesDir();
        Log.d("FILE", f1.toString());
        File f2 = getCacheDir();
        Log.d("FILE", f2.toString());
        File f3 = getExternalCacheDir();
        Log.d("FILE", f3.toString());
        File f4 = Environment.getExternalStorageDirectory();
        Log.d("FILE", f4.toString());

    }
}
