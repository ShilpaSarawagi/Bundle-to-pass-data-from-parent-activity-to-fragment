package com.ricoh.sopapps.myapplication;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    FragmentManager manager = getFragmentManager();
    private EditText etFirstNumber, etSecondNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getFragmentManager();
        etFirstNumber = (EditText) findViewById(R.id.etFirstNumber);
        etSecondNumber = (EditText) findViewById(R.id.etSecondNumber);
    }

    public void sendDataToFragment(View view) {
        int firstNumber = Integer.valueOf(etFirstNumber.getText().toString());
        int secondNumber = Integer.valueOf(etSecondNumber.getText().toString());

        Bundle bundle = new Bundle();
        bundle.putInt("first_number", firstNumber);
        bundle.putInt("second_number", secondNumber);

        FragmentA fragmentA = new FragmentA();
        fragmentA.setArguments(bundle);
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.containerFragmentA ,fragmentA, "fragA");
        transaction.commit();


    }
}
