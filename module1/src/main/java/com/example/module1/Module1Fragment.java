package com.example.module1;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 */
public class Module1Fragment extends Fragment {


    public Module1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_module1, container, false);
        TextView tv = (TextView) rootView.findViewById(R.id.app_tv_text);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(Module1FragmentDirections.actionModule1FragmentToModule2Fragment("李四"));
            }
        });
        TextView tv2 = (TextView) rootView.findViewById(R.id.app_tv_text2);
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(Module1FragmentDirections.actionModule1FragmentToModule3Fragment(18));
            }
        });
        return rootView;
    }


}
