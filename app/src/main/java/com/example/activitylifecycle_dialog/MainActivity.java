package com.example.activitylifecycle_dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // static String TAG = MainActivity.class.getName();
    static String TAG = "@!@";

    private Button mSecondActivityButton;
    private Button btn_dialog;
    private Button btn_frag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "[메인화면] onCreate() 호출됨");

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        mSecondActivityButton = findViewById(R.id.secondButton);
        mSecondActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });

        btn_dialog = findViewById(R.id.showDialog);
        btn_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //다이얼로그는 Activity가 아니라 Activity의 일부이기 때문에 아무런 함수가 출력되지 않는다.
                showDialog();
            }
        });

        btn_frag = findViewById(R.id.move_frag);
        btn_frag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.contents, new DialogFragment());
//                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

    }

    private void showDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("알림");
        builder.setMessage("확인하였습니까?");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "확인", Toast.LENGTH_LONG).show();
            }
        });
        builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "취소", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "[메인화면] onStart() 호출됨");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "[메인화면] onResume() 호출됨");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "[메인화면] onPause() 호출됨");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "[메인화면] onStop() 호출됨");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "[메인화면] onRestart() 호출됨");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "[메인화면] onDestroy() 호출됨");
    }

}