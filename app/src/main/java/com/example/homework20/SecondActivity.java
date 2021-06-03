package com.example.homework20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private EditText et_title;
    private Button btn_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        et_title = findViewById(R.id.et_title);
        btn_title = findViewById(R.id.btn_second_title);

        btn_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this, et_title.getText().toString(),Toast.LENGTH_LONG).show();
                Intent secondIntent = new Intent(SecondActivity.this, MainActivity.class);
                secondIntent.putExtra("text", et_title.getText().toString());
                startActivity(secondIntent);
            }
        });
    }
}