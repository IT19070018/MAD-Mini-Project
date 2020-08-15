package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Vaccines1 extends AppCompatActivity {

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaccines1);
    }

    protected void onResume() {

        super.onResume();
        btn1 = findViewById(R.id.vacFloatingActionButton);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vaccines1.this, vaccines2.class);
                startActivity(intent);

                Context context = getApplicationContext();
                CharSequence message = "Loading page...";

                int duration = Toast.LENGTH_SHORT;
                Toast toast1 = Toast.makeText(context, message, duration);

                toast1.show();
                toast1.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);

            }
        });

    }
}