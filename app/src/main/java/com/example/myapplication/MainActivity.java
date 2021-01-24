package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText edit_1;
    private EditText edit_2;
    private EditText edit_3;
    private Button button_hitung;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_1 = findViewById(R.id.edit_1);
        edit_2 = findViewById(R.id.edit_2);
        edit_3 = findViewById(R.id.edit_3);
        button_hitung = findViewById(R.id.button_hitung);
        result = findViewById(R.id.result);

        button_hitung.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        //buttonHitung
        if (v.getId() == R.id.button_hitung){
            String panjang = edit_1.getText().toString().trim();//trim untuk menghiraukan spasi
            String lebar = edit_2.getText().toString().trim();
            String tinggi = edit_3.getText().toString().trim();

            //testing
            double keliling = Double.valueOf(panjang) * Double.valueOf(lebar) * Double.valueOf(tinggi);
            result.setText(String.valueOf(keliling));
        }
    }
}