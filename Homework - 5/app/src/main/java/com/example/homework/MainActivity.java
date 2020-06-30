package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText name = findViewById(R.id.name);
        final EditText age = findViewById(R.id.age);
        final EditText job = findViewById(R.id.job);
        final EditText num = findViewById(R.id.num);
        final EditText mail = findViewById(R.id.mail);





                final Button reset = findViewById(R.id.reset);
                final Button make = findViewById(R.id.make);

                make.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent hi = new Intent(MainActivity.this,MainActivity2.class);
                        hi.putExtra("name1",name.getText().toString());
                        hi.putExtra("age1",age.getText().toString());
                        hi.putExtra("job1",job.getText().toString());
                        hi.putExtra("num1",num.getText().toString());
                        hi.putExtra("mail1",mail.getText().toString());
                        startActivity(hi);
                    }
                });
                reset.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        name.setText(null);
                        age.setText(null);
                        job.setText(null);
                        num.setText(null);
                        mail.setText(null);
                    }
                });
    }
}

