package com.calculadoravelt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonSuma;
    private Button buttonKmaM;
    private Button buttonResta;
    private Button buttonHorasAseg;
    private Button buttonDivision;
    private Button buttonft;
    private Button buttonMultiplicacion;
    private Button buttoncmaft;

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
        buttonResta = findViewById(R.id.buttonResta );
        buttonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirResta( );
            }
        });
        buttonHorasAseg = findViewById(R.id.buttonHorasAseg);
        buttonHorasAseg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirHoras( );
            }
        });
        buttonDivision = findViewById(R.id.buttonDivision );
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirDivision( );
            }
        });
        buttonft = findViewById(R.id.buttonft );
        buttonft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirft( );
            }
        });
        buttonMultiplicacion = findViewById(R.id.buttonMultiplicacion );
        buttonMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirMultiplicacion( );
            }
        });
        buttoncmaft= findViewById(R.id.buttoncmaft );
        buttoncmaft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirConversion( );
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
    private void abrirResta() {
        Intent intent = new Intent( this , RestaActivity.class );
        startActivity( intent );
    }
    private void abrirHoras() {
        Intent intent = new Intent( this , HorasActivity.class );
        startActivity( intent );
    }
    private void abrirDivision() {
        Intent intent = new Intent( this , DivisionActivity.class );
        startActivity( intent );
    }
    private void abrirft() {
        Intent intent = new Intent( this , FtActivity.class );
        startActivity( intent );
    }
    private void abrirMultiplicacion() {
        Intent intent = new Intent( this , MultiplicacionActivity.class );
        startActivity( intent );
    }
    private void abrirConversion() {
        Intent intent = new Intent( this , FtaCmActivity.class );
        startActivity( intent );
    }

}