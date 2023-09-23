package com.cs407.lab2milestone2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_activity);
        textView = (TextView)findViewById(R.id.textView);
        Intent intent = getIntent();
        String str= intent.getStringExtra("result");
        textView.setText(str);
    }
}