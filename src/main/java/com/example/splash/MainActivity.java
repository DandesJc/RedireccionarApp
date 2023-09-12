package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String nombre, cedula, fechaNacimiento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent enviarDatos = new Intent(MainActivity.this, Resultado.class);
        //datos a enviar
        enviarDatos.putExtra("nombre", nombre);
        enviarDatos.putExtra("nombre", nombre);
        enviarDatos.putExtra("nombre", nombre);

        , "cedula", cedula, "fechaNacimiento", fechaNacimiento

    }
}