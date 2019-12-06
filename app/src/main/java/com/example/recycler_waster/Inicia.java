package com.example.recycler_waster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

public class Inicia extends AppCompatActivity {

    EditText correo2,contraseña;
    Toolbar tool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicia);

        correo2 = (EditText)findViewById(R.id.correo2);
        contraseña = (EditText)findViewById(R.id.contraseña);


    }




    public void regresar (View view){

        Intent regresar = new Intent(this, MainActivity.class);
        startActivity(regresar);


    }





//------------------------------------

    public void acceder1 (View view){


        String valor1 =correo2.getText().toString();
        String valor2 =contraseña.getText().toString();


//para acceder
        if(!valor1.isEmpty() && !valor2.isEmpty() ){

            Intent acceder1 = new Intent(this, menu.class);
            startActivity(acceder1);



            Toast.makeText(this, "EXITO AL INICIAR SESSION", Toast.LENGTH_LONG).show();
            finish();

        }else{
            if (valor1.isEmpty()){
                correo2.setError("INGRESAR CORREO ELECTRONICO VALIDO");
            }

            if (valor2.isEmpty()){
                contraseña.setError("INGRESAR CONTRASEÑA");
            }


            Toast.makeText(this, "ERROR AL INICIAR SESSION", Toast.LENGTH_LONG).show();
        }




    }
    }