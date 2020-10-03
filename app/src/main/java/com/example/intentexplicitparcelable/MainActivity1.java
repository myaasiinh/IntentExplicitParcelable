package com.example.intentexplicitparcelable;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity1  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        TextView detailnama = (TextView) findViewById(R.id.detailnamaTv);
        TextView detailumur = (TextView) findViewById(R.id.detailumurTv);

        Intent intent = getIntent();
        Biodata biodata = intent.getParcelableExtra("Biodata");

        detailnama.setText("Nama:" + biodata.getNama());
        detailumur.setText("Umur:" + biodata.getUmur());

    }
}