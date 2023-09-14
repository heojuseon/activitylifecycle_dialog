package com.example.activitylifecycle_dialog;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class DialogFragment extends Fragment {
    private boolean dialogShown = false;
Button frag_dialog;

    static String TAG = DialogFragment.class.getName();


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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView() 호출");
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_dialog, container, false);

        frag_dialog = view.findViewById(R.id.flag_button);
        frag_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, "onViewCreated() 호출");
    }

    //다이얼로그 생성
    public void showDialog(){
        //다시 메인 프레그먼트로 돌아올 경우 다이얼로그 창 안보이게 하기 위함
        if (!dialogShown){
        MyDialogFragment dialogFragment = MyDialogFragment.newInstance();
        dialogFragment.show(requireActivity().getSupportFragmentManager(), "dialog");
        dialogShown = true;
        }else dialogShown = false;
    }


    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.d(TAG, "onViewStateRestored() 호출");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "D_onStart() 호출");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "D_onResume() 호출");
    }

    @Override
    public void onPause() {
        super.onPause();
        showDialog();
        Log.d(TAG, "D_onPause() 호출");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "D_onStop() 호출");
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
}