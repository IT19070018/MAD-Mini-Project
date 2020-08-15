package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void onResume() {

        super.onResume();
        btn = findViewById(R.id.button1);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Vaccines1.class);
                startActivity(intent);

                Context context = getApplicationContext();
                CharSequence message = "You just clicked the OK button";

                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);

                toast.show();
                toast.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);

            }
        });
    }
}