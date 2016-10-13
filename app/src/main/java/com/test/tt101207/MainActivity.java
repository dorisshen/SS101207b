package com.test.tt101207;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

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

        InputStream is = getResources().openRawResource(R.raw.mydata);
        InputStreamReader reader = null;
        StringBuilder sb = new StringBuilder();
        try {
            reader = new InputStreamReader(is, "UTF-8");
            char[] buffer = new char[1];
            while(reader.read(buffer) != -1)
            {
                sb.append(new String(buffer));
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Log.d("DATA", sb.toString());

    }
}
