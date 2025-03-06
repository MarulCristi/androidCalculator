package com.example.androidcalculator;

import static java.lang.Math.round;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText firstNumberInput;
    private EditText secondNumberInput;
    private TextView textOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    // Declare variables as the id of them
        firstNumberInput = findViewById(R.id.inputFirstNumber);
        secondNumberInput = findViewById(R.id.inputSecondNumber);
        textOutput = findViewById(R.id.textResult);



    }

    // Calculations
    public void addNumbers(View view) {
        textOutput.setTextSize(30);
        if (firstNumberInput.getText().toString().isEmpty() || secondNumberInput.getText().toString().isEmpty()) {
            textOutput.setText("No numbers entered");
            return;
        }

        try {
            Integer.parseInt(firstNumberInput.getText().toString());
            Integer.parseInt(secondNumberInput.getText().toString());
            textOutput.setText(String.valueOf(Integer.parseInt(firstNumberInput.getText().toString()) + Integer.parseInt(secondNumberInput.getText().toString())));
            return;
        } catch (NumberFormatException e) {
            textOutput.setText(String.valueOf(Float.parseFloat(firstNumberInput.getText().toString()) + Float.parseFloat(secondNumberInput.getText().toString())));
        }
    }

    public void subtractNumbers(View view) {
        textOutput.setTextSize(30);
        if (firstNumberInput.getText().toString().isEmpty() || secondNumberInput.getText().toString().isEmpty()) {
            textOutput.setText("No numbers entered");
            return;
        }
        try {
            Integer.parseInt(firstNumberInput.getText().toString());
            Integer.parseInt(secondNumberInput.getText().toString());
            textOutput.setText(String.valueOf(Integer.parseInt(firstNumberInput.getText().toString()) - Integer.parseInt(secondNumberInput.getText().toString())));
            return;
        } catch (NumberFormatException e) {
            textOutput.setText(String.valueOf(Float.parseFloat(firstNumberInput.getText().toString()) - Float.parseFloat(secondNumberInput.getText().toString())));
        }
    }

    public void multiplyNumbers(View view) {
        textOutput.setTextSize(30);
        if (firstNumberInput.getText().toString().isEmpty() || secondNumberInput.getText().toString().isEmpty()) {
            textOutput.setText("No numbers entered");
            return;
        }
        try {
            Integer.parseInt(firstNumberInput.getText().toString());
            Integer.parseInt(secondNumberInput.getText().toString());
            textOutput.setText(String.valueOf(Integer.parseInt(firstNumberInput.getText().toString()) * Integer.parseInt(secondNumberInput.getText().toString())));
            return;
        } catch (NumberFormatException e) {
            textOutput.setText(String.valueOf(Float.parseFloat(firstNumberInput.getText().toString()) * Float.parseFloat(secondNumberInput.getText().toString())));
        }
    }

    public void divideNumbers(View view) {
        textOutput.setTextSize(30);
        if (firstNumberInput.getText().toString().isEmpty() || secondNumberInput.getText().toString().isEmpty()) {
            textOutput.setText("No numbers entered");
            return;
        }
        textOutput.setText(String.valueOf(Float.parseFloat(firstNumberInput.getText().toString()) / Float.parseFloat(secondNumberInput.getText().toString())));
    }
}
