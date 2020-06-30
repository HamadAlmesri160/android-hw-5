package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Bundle b = getIntent().getExtras();
        TextView nameee= findViewById(R.id.namee);
        TextView ageee= findViewById(R.id.agee);
        TextView jobbb= findViewById(R.id.jobb);
        TextView nummm= findViewById(R.id.numm);
        TextView mailll= findViewById(R.id.maill);

        nameee.setText(b.getString("name1"));
        ageee.setText(b.getString("age1"));
        jobbb.setText(b.getString("job1"));
        nummm.setText(b.getString("num1"));
        mailll.setText(b.getString("mail1"));



        mailll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/html");
                intent.putExtra(Intent.EXTRA_EMAIL, "emailaddress@emailaddress.com");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
                intent.putExtra(Intent.EXTRA_TEXT, "Hi :)");

                startActivity(Intent.createChooser(intent, "Send Email"));
            }
        });

    }
}