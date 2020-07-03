package com.example.calculatex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    double firstVal, secondVal;
    boolean checkAdd, checkSub, checkMul, checkDiv;
    public void clearText(View view){
        EditText editText = findViewById(R.id.editTextTextPersonName);
        editText.setText("");
        TextView textView = findViewById(R.id.textView);
        textView.setText("");
        Toast.makeText(this, "Input Cleared", Toast.LENGTH_SHORT).show();
    }
    public void one(View view){
        EditText editText = findViewById(R.id.editTextTextPersonName);
        editText.setText(editText.getText()+"1");
    }
    public void two(View view){
        EditText editText = findViewById(R.id.editTextTextPersonName);
        editText.setText(editText.getText()+"2");
    }
    public void three(View view){
        EditText editText = findViewById(R.id.editTextTextPersonName);
        editText.setText(editText.getText()+"3");
    }
    public void four(View view){
        EditText editText = findViewById(R.id.editTextTextPersonName);
        editText.setText(editText.getText()+"4");
    }
    public void five(View view){
        EditText editText = findViewById(R.id.editTextTextPersonName);
        editText.setText(editText.getText()+"5");
    }
    public void six(View view){
        EditText editText = findViewById(R.id.editTextTextPersonName);
        editText.setText(editText.getText()+"6");
    }
    public void seven(View view){
        EditText editText = findViewById(R.id.editTextTextPersonName);
        editText.setText(editText.getText()+"7");
    }
    public void eight(View view){
        EditText editText = findViewById(R.id.editTextTextPersonName);
        editText.setText(editText.getText()+"8");
    }
    public void nine(View view){
        EditText editText = findViewById(R.id.editTextTextPersonName);
        editText.setText(editText.getText()+"9");
    }
    public void zero(View view){
        EditText editText = findViewById(R.id.editTextTextPersonName);
        editText.setText(editText.getText()+"0");
    }
    public void addBtn(View view){
        EditText editTex = findViewById(R.id.editTextTextPersonName);
        if(editTex.getText()==null) {
            editTex.setText("");
        }else{
            checkAdd = true;
            firstVal = Double.parseDouble(editTex.getText().toString());
            TextView textView = findViewById(R.id.textView);
            textView.setText(String.valueOf((int)firstVal)+" +");
            editTex.setText("");
        }
    }
    public void subBtn(View view){
        EditText editTex = findViewById(R.id.editTextTextPersonName);
        if(editTex.getText()==null) {
            editTex.setText("");
        }else{
            checkSub = true;
            firstVal = Double.parseDouble(editTex.getText().toString());
            TextView textView = findViewById(R.id.textView);
            textView.setText(String.valueOf((int)firstVal)+" -");
            editTex.setText("");
        }
    }
    public void mulBtn(View view){
        EditText editTex = findViewById(R.id.editTextTextPersonName);
        if(editTex.getText()==null) {
            editTex.setText("");
        }else{
            checkMul = true;
            firstVal = Double.parseDouble(editTex.getText().toString());
            TextView textView = findViewById(R.id.textView);
            textView.setText(String.valueOf((int)firstVal)+" x");
            editTex.setText("");
        }
    }
    public void divBtn(View view){
        EditText editTex = findViewById(R.id.editTextTextPersonName);
        if(editTex.getText()==null) {
            editTex.setText("");
        }else{
            checkDiv = true;
            firstVal = Double.parseDouble(editTex.getText().toString());
            TextView textView = findViewById(R.id.textView);
            textView.setText(String.valueOf((int)firstVal)+" /");
            editTex.setText("");
        }
    }
    public void equalTo(View view){
        EditText editText = findViewById(R.id.editTextTextPersonName);
        if(checkAdd==true){
            secondVal = Double.parseDouble(editText.getText().toString());
            editText.setText(String.valueOf((int)(firstVal+secondVal)));
            TextView textView = findViewById(R.id.textView);
            textView.setText("");
            checkAdd = false;
        }
        else if(checkSub==true){
            secondVal = Double.parseDouble(editText.getText().toString());
            editText.setText(String.valueOf((int)(firstVal-secondVal)));
            TextView textView = findViewById(R.id.textView);
            textView.setText("");
            checkSub = false;
        }
        else if(checkMul==true){
            secondVal = Double.parseDouble(editText.getText().toString());
            editText.setText(String.valueOf((int)(firstVal*secondVal)));
            TextView textView = findViewById(R.id.textView);
            textView.setText("");
            checkMul = false;
        }
        else if(checkDiv==true){
            secondVal = Double.parseDouble(editText.getText().toString());
            if(secondVal==0) {
                checkSub = false;
                editText.setText("Error!");
                TextView textView = findViewById(R.id.textView);
                textView.setText("");
                Toast.makeText(this, "Not Divisible by zero", Toast.LENGTH_SHORT).show();
            }
            else {
                editText.setText(String.valueOf(firstVal / secondVal));
                TextView textView = findViewById(R.id.textView);
                textView.setText("");
            }
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}