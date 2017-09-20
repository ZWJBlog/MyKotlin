package com.example.msi.mykotlin;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by MSI on 2017/9/20.
 */

public class MyFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.myview,
                null);
        Toast.makeText(getActivity(), "78944", Toast.LENGTH_SHORT).show();
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        TextView text = (TextView) view.findViewById(R.id.text);
        text.setText("hello,world!");
    }
}
