package com.example.intentexplicitparcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText namaanda = (EditText) findViewById(R.id.namaandaEt);
        final EditText umuranda = (EditText) findViewById(R.id.umurandaEt);

        Button lanjutkanbutton = (Button) findViewById(R.id.lanjutkanBtn);

        lanjutkanbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Biodata biodata = new Biodata(namaanda.getText().toString(),
                        umuranda.getText().toString());

                Intent intent = new Intent(MainActivity.this, MainActivity1.class);
                intent.putExtra("Biodata", biodata);
                startActivity(intent);
            }
        });
    }
}