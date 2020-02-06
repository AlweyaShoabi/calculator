package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText editText1;
    EditText editText2;

    Button btnadd, btnsub, btnmul, btndiv;

    float result_num;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result=findViewById(R.id.result);
        editText1=findViewById(R.id.editText1);
        editText2=findViewById(R.id.editText2);

        btnadd=findViewById(R.id.btnadd);
        btnsub=findViewById(R.id.btnsub);
        btndiv=findViewById(R.id.btndiv);
        btnmul=findViewById(R.id.btnmul);

        btnadd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(editText1.getText().toString());
                num2=Integer.parseInt(editText2.getText().toString());
                result_num=num1+num2;
                result.setText(String.valueOf(result_num));
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(editText1.getText().toString());
                num2 = Integer.parseInt(editText2.getText().toString());
                result_num = num1 - num2;
                result.setText(String.valueOf(result_num));
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(editText1.getText().toString());
                num2 = Integer.parseInt(editText2.getText().toString());
                result_num = num1 / num2;
                result.setText(String.valueOf(result_num));
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(editText1.getText().toString());
                num2 = Integer.parseInt(editText2.getText().toString());
                result_num = num1 * num2;
                result.setText(String.valueOf(result_num));
            }
        });

    }
}
