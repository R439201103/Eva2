package com.example.eva2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity{
    EditText editTextName;
    Button clickButton;
    TextView TName;



    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextName=(EditText)findViewById(R.id.editTextName);
        clickButton=(Button)findViewById(R.id.clickButton);
        TName=(TextView)findViewById(R.id.TName);

        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                TName.setText("Hello " + name);


            }
        });
    }
}