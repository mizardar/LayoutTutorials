package com.quicknexpert.layouttutorials;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.quicknexpert.layouttutorials.R;

public class HelloWorldActivity extends AppCompatActivity implements View.OnClickListener {


    //    create object of each component
    TextView textView;
    Button button;
    Button button1;
    ToggleButton toggleButton;
    CheckBox checkBox;
    RadioGroup radioGroup;
    RadioButton radioButton;
    RadioButton radioButton1;
    ProgressBar progressBar;
    SeekBar seekBar;
    Switch switch1;
    EditText editText;
    EditText editText2;
    AutoCompleteTextView autoCompleteTextView;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);

        //find view using it's id
        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);
        button1 = (Button) findViewById(R.id.button1);
        toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        checkBox = (CheckBox) findViewById(R.id.checkBox);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioButton = (RadioButton) findViewById(R.id.radioButton);
        radioButton1 = (RadioButton) findViewById(R.id.radioButton1);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        switch1 = (Switch) findViewById(R.id.switch1);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);


        //create click listener for button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //creating a toast message
                Toast.makeText(HelloWorldActivity.this, "Hello", Toast.LENGTH_SHORT).show();

                //changing text and text color of a text view
                textView.setTextColor(Color.RED);
                textView.setText("Button 1 Pressed ");
            }
        });

        //create click listener for button1 and implement it by HelloWorldActivity class
        button1.setOnClickListener(this);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                //if b is true then toggle is on else off
                Toast.makeText(getApplicationContext(), b ? "ON" : "OFF", Toast.LENGTH_SHORT).show();


//                get the text value from editText2 and convert into integer to perform requierd operations

                String str= editText2.getText().toString();
                if (str.length()==0){
                    int val = Integer.parseInt(str);
                    Log.i("value of editText2",String.valueOf(val));
                }
            }
        });

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                //if b is true then check box is checked else unchecked
                Toast.makeText(getApplicationContext(), b ? "Checked" : "Unchecked", Toast.LENGTH_SHORT).show();
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                //i is id of selected radio button

                if (i == R.id.radioButton) {

                    Toast.makeText(getApplicationContext(), "Radio button  checked", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Radio button 1 checked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                //i is progress value of seekbar
                textView.setText("Progress = " + i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                //if b is true then swich is on else off
                Toast.makeText(getApplicationContext(), b ? "switched on " : "switched off", Toast.LENGTH_SHORT).show();
            }
        });
        //To get edit text value in a string
        String text = editText.getText().toString();


        //To track edit text change add Text watcher
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                Toast.makeText(getApplicationContext(),editable.toString(),Toast.LENGTH_SHORT).show();

                //to print in android Monitor
                Log.e("e stands for error",editable.toString());
                Log.d("d stands for debug",editable.toString());
                Log.v("v stands for verbose",editable.toString());
                Log.i("i stands for info",editable.toString());
                Log.w("w stands for warn",editable.toString());

            }
        });



    }

    @Override
    protected void onResume() {
        super.onResume();


    }

    @Override
    public void onClick(View view) {

        //get the click event for button1
        if (view.getId() == R.id.button1) {
            Toast.makeText(HelloWorldActivity.this, "Hello from button 2", Toast.LENGTH_SHORT).show();
            textView.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
            textView.setText("Button 2 Pressed ");
        }

    }
}
