package com.example.moduletest;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.blankj.utilcode.util.ToastUtils;


/**
 * A simple {@link Fragment} subclass.
 */
public class AppFragment extends Fragment {


    public AppFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_app, container, false);
        View tv = (TextView) rootView.findViewById(R.id.app_tv_text);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtils.showShort("被点击了");
                Navigation.findNavController(v).navigate(AppFragmentDirections.actionAppFragmentToModule1Navigation());
            }
        });
        return rootView;
    }


}
