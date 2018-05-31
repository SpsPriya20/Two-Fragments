package com.priya.twofragments.fragment.fragment2;

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

import com.priya.twofragments.R;

public class Fragment2 extends Fragment {

    private Button button2;
    private RelativeLayout fragment2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view= inflater.inflate(R.layout.fragment2,container,false);
       button2=view.findViewById(R.id.GreenBt);
       fragment2=view.findViewById(R.id.fragmentRl);

       button2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               fragment2.setBackgroundColor(Color.GREEN);
           }
       });

        return view;
    }
}
