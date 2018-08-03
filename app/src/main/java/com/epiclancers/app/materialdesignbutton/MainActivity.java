package com.epiclancers.app.materialdesignbutton;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AppCompatButton button;
    AppCompatButton flatbtn;
    FloatingActionButton fab;

    public void play(View view){
        Toast.makeText(this, "Hi there", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.raised_btn);
        flatbtn = findViewById(R.id.flat_btn);
        fab = findViewById(R.id.fab_btn);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Floating Action Button", Toast.LENGTH_SHORT).show();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setText(R.string.done);
            }
        });
        flatbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flatbtn.setText(R.string.working);
            }
        });
    }
}
