package com.priya.twofragments.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.priya.twofragments.R;

public class fragment1  extends Fragment{

    private Button button1;
    private RelativeLayout frragment1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment1,container,false);
        getActivity().getSupportFragmentManager().findFragmentById(R.id.fragment1Rl);

        button1=view.findViewById(R.id.RedBt);
        frragment1=view.findViewById(R.id.fragment1Rl);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frragment1.setBackgroundColor(Color.RED);
            }
            public void setColor(int color){
                frragment1.setBackgroundColor(color);
            }
        });




        return view;
    }
}