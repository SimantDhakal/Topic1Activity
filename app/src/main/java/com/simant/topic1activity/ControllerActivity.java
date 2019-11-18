package com.simant.topic1activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class ControllerActivity extends AppCompatActivity {

    Spinner spinner;
    private AutoCompleteTextView autoCompleteTextView;
    private String[] language = {"C", "C++", "C#", "JAVA", "PYTHON"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controller);

        Spinner spinner = (Spinner) findViewById(R.id.country);
        autoCompleteTextView = findViewById(R.id.auto);

        List<String> spinnerArray =  new ArrayList<String>();
        spinnerArray.add("Kathmandu");
        spinnerArray.add("Bhaktapur");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, spinnerArray);

        adapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.select_dialog_item,
                language
        );
        autoCompleteTextView.setAdapter(stringArrayAdapter);
        autoCompleteTextView.setThreshold(1);

        // change

    }
}
