package com.cs407.lab2milestone2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){
        EditText first_field = (EditText)findViewById(R.id.first_input);
        EditText second_field = (EditText)findViewById(R.id.second_input);
        try {
            int first_input = Integer.parseInt(first_field.getText().toString());
            int second_input = Integer.parseInt(second_field.getText().toString());
            if (view.getId() == R.id.add_button) {
                String str = String.valueOf(first_input + second_input) + ".0";
                goToActivity(str);
            }
            if (view.getId() == R.id.subtract_button) {
                String str = String.valueOf(first_input - second_input) + ".0";
                goToActivity(str);
            }
            if (view.getId() == R.id.mult_button) {
                String str = String.valueOf(first_input * second_input) + ".0";
                goToActivity(str);
            }
            if (view.getId() == R.id.div_button) {
                if (second_input == 0) {
                    String str = "Error: Cannot divide by 0";
                    goToActivity(str);
                }
                float flt = (float)first_input / (float)second_input;
                String str = Float.toString(flt);
                goToActivity(str);
            }
        } catch (Exception e) {
            Toast.makeText(MainActivity.this, "Error: Both entries must be integers", Toast.LENGTH_LONG).show();
        }
    }

    public void goToActivity(String s) {
        Intent intent = new Intent(this, CalculatorActivity.class);
        intent.putExtra("result", s);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}