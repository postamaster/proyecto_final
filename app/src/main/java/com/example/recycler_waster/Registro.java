package com.example.recycler_waster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {
    EditText nombre,correo,contraseña,contraseña2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        correo = (EditText)findViewById(R.id.correo);
        contraseña = (EditText)findViewById(R.id.contraseña);
        contraseña2= (EditText)findViewById(R.id.contraseña2);

    }


    public void regresar (View view){

        Intent regresar = new Intent(this, MainActivity.class);
        startActivity(regresar);

    }

//------------------------------------

    public void acceder1 (View view){

        adminBD admin = new adminBD (this, "administracion", null, 1);
        SQLiteDatabase BaseDD = admin.getWritableDatabase();

            //String valor1 =nombre.getText().toString();
            String valor2 =correo.getText().toString();
            String valor3 =contraseña.getText().toString();
            String valor4 =contraseña2.getText().toString();


//para acceder
            if(!valor2.isEmpty() && !valor3.isEmpty()  && !valor4.isEmpty()){
              if (valor3.equals(valor4))

              {
//al acceder

                  ContentValues acceder1 = new ContentValues();
                 // acceder1.put("nombre",valor1);
                  acceder1.put("correo",valor2);
                  acceder1.put("contraseña",valor3);

                  long id_resultado = BaseDD.insert("usuarios",null, acceder1);
                  Toast.makeText(this,"ID_INGRESADO: " + id_resultado,Toast.LENGTH_LONG).show();
                  BaseDD.close();

                  Intent iniciar = new Intent(this, menu.class);
                  startActivity(iniciar);
finish();

              }
              //en caso de que no rellenemos bien el formulario pasa esto

              else{
                  Toast.makeText(this, "las contraseñas no coinciden", Toast.LENGTH_LONG).show();
              }



            }else{


                if (valor2.isEmpty()){
                    correo.setError("falta correo");
                }

                if (valor3.isEmpty()){
                    contraseña.setError("falta contraseña");
                }

                if (valor4.isEmpty()){
                    contraseña2.setError("falta la verificacion de contraseña");
                }

                Toast.makeText(this, "error al registrar", Toast.LENGTH_LONG).show();
            }




}
    }