package com.example.moy.trobaalteubesso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Besso extends AppCompatActivity implements View.OnClickListener {
    ImageView alemania;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_besso);
        alemania = (ImageView) findViewById(R.id.alemania);

        alemania.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        if (v==findViewById(R.id.alemania)){
            intent= new Intent(this, alemania.class);
            
        }
        startActivity(intent);
    }
}
