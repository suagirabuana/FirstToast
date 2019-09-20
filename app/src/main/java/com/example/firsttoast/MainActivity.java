package com.example.firsttoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int x = 0;
    Button button_toast,button_count;
    TextView angka0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_toast = findViewById(R.id.button_toast);
        button_count = findViewById(R.id.button_count);
        angka0 = findViewById(R.id.angka0);

        button_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Hello Toast !", Toast.LENGTH_SHORT).show();
            }
        });

        button_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                x++;
                angka0.setText(Integer.toString(x));

            }
        });

    }
}
