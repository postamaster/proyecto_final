package com.example.recycler_waster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
//Toolbar tooll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*tooll=(Toolbar)findViewById(R.id.tool);

        String  appname =getResources().getString(R.string.app_name);
        tooll.setTitle (appname);*/

    }


    public void iniciar (View view){

        Intent iniciar = new Intent(this, Inicia.class);
        startActivity(iniciar);
        Toast.makeText(this, "Inicia sesion por favor", Toast.LENGTH_LONG).show();


    }
    public void registro (View view){

        Intent registro = new Intent(this, Registro.class);
        startActivity(registro);
        Toast.makeText(this, "Por favor registrate ", Toast.LENGTH_LONG).show();


    }




}
