package com.calculadoravelt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonSuma;
    private Button buttonKmaM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonSuma = findViewById(R.id.buttonSuma );
        buttonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSuma( );
            }
        });
        buttonKmaM = findViewById(R.id.buttonKmaM );
        buttonKmaM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirConversionKm( );
            }
        });
    }
    private void abrirSuma() {
        Intent intent = new Intent( this , SumaActivity.class );
        startActivity( intent );
    }
    private void abrirConversionKm() {
        Intent intent = new Intent( this , KmActivity.class );
        startActivity( intent );
    }
}