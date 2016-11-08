package com.ricoh.sopapps.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by ssarawagi on 11/7/2016.
 */

public class FragmentA extends Fragment {

    private Button btnAdd;
    private TextView txvResult;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        btnAdd = (Button) view.findViewById(R.id.btnAdd);
        txvResult = (TextView) view.findViewById(R.id.txvResult);
        Bundle bundle = getArguments();
        final int firstNum = bundle.getInt("first_number", 0);
        final int secondNum = bundle.getInt("second_number", 0);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTwoNumbers(firstNum, secondNum);
            }
        });
        return view;
    }

    private void addTwoNumbers(int firstNum, int secondNum) {

        int result = firstNum +secondNum;
        txvResult.setText("Result"+ result);
    }


}
