package com.example.activitylifecycle_dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MyDialogFragment extends DialogFragment{
    static String TAG = MyDialogFragment.class.getName();

    MyDialogFragment dialogFragment;

    public static MyDialogFragment newInstance() {
        return new MyDialogFragment();
    }


    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("다이얼로그 제목")
                .setMessage("다이얼로그 내용")
                .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // 다이얼로그에서 확인 버튼을 클릭했을 때의 처리
//                        dismiss();
////                        MyDialogFragment.this.dismiss();
//                        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
//                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                        fragmentTransaction.remove(MyDialogFragment.this);
//                        fragmentTransaction.commit();

                        dismissDialog();

                    }
                })
                .setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // 다이얼로그에서 취소 버튼을 클릭했을 때의 처리
                    }
                });
        return builder.create();
    }
    public void dismissDialog() {
        if (dialogFragment != null) {
            dialogFragment.dismiss();
            dialogFragment = null; // 다이얼로그 프래그먼트를 null로 설정하여 더 이상 참조하지 않음
        }
    }


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(TAG, "onAttach() 호출");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate() 호출");
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.d(TAG, "onViewStateRestored() 호출");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() 호출");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() 호출");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() 호출");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() 호출");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState() 호출");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView() 호출");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() 호출");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach() 호출");
    }

    @Override
    public void onDismiss(@NonNull DialogInterface dialog) {
        super.onDismiss(dialog);
    }

}
