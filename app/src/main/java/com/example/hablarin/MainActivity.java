package com.example.hablarin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText entrada, salida;
    Button convertir, limpiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entrada = (EditText)  findViewById(R.id.entrada);
        salida =(EditText) findViewById(R.id.salida);
        convertir =(Button) findViewById(R.id.hablarin);
        limpiar = (Button) findViewById(R.id.limpiar);

        convertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String entradaUno  = entrada.getText().toString();
                String salidaUno = "";
                for(int x = entrada.length()-1; x>=0; x--)
                {
                    salidaUno = salidaUno + entradaUno.charAt(x);
                }
                salida.setText(salidaUno);
            }
        });
        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entrada.setText("");
                salida.setText("");
            }
        });

    }
}
