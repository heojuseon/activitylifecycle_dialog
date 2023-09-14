package com.example.activitylifecycle_dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    Button btn_finish;

//    static String TAG = SecondActivity.class.getName();
    static String TAG = "@!@";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.d(TAG,"[Second] onCreate() 호출됨");

        btn_finish = findViewById(R.id.finish);
        btn_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();   //Second 액티비티 종료
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"[Second] onStart() 호출됨");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"[Second] onResume() 호출됨");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"[Second] onPause() 호출됨");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"[Second] onStop() 호출됨");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"[Second] onRestart() 호출됨");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"[Second] onDestroy() 호출됨");
    }
}