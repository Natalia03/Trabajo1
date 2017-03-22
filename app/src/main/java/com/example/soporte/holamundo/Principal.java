package com.example.soporte.holamundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {
    //Declaramos variables
    private EditText cajaNombre;
    private EditText cajaApellido;
    private EditText cajaApellido1;
    private EditText cajaApellido2;
    private EditText cajaEdad;
    private EditText cajaSexo;
    private Intent i;
    private Bundle b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        //Capturamos las cajas
        cajaNombre = (EditText)findViewById(R.id.txtNombre);
        cajaApellido = (EditText)findViewById(R.id.txtApellido);
        cajaApellido1 = (EditText)findViewById(R.id.txtApelli);
        cajaApellido2 = (EditText) findViewById(R.id.txtapelli2);
        cajaEdad = (EditText) findViewById(R.id.txtEdad);
        cajaSexo = (EditText) findViewById(R.id.txtSexo);
        //Creamos el objeto intent que sirve para pasar de una actividad a otra
        i = new Intent(this,Saludo.class);
        //Creamos el objeto Bundle que sirve para encapsular datos
        b = new Bundle();

    }


    public void saludar(View v){
        String nomb, apell, apell1, apell2, edad, sexo;
      if(validar()) {
            //Tomo el valor que la persona ingresó tanto en nombre como en apellido
            nomb = cajaNombre.getText().toString();
            apell = cajaApellido.getText().toString();
            apell1 = cajaApellido1.getText().toString();
            apell2 = cajaApellido2.getText().toString();
            edad = cajaEdad.getText().toString();
            sexo = cajaEdad.getText().toString();

           //Encapsulo los valores previamente tomados
            b.putString("Nombre", nomb);
            b.putString("Apellido", apell);
            b.putString("Apellido1", apell1);
            b.putString("Apellido2", apell2);
            b.putString("Edad", edad);
            b.putString("Sexo", sexo);
            //Le paso al intent todos los datos en forma encapsulada con el bundle
            i.putExtras(b);
            //Arranco la actividad que le intent me diga
            startActivity(i);
        }
    }
    public void borrar (View b){
        cajaNombre.setText("");
        cajaNombre.requestFocus();
        cajaApellido.setText( "");
        cajaApellido1.setText("");
        cajaApellido2.setText("");
        cajaEdad.setText("");
        cajaSexo.setText("");
    }

    public boolean validar(){
        if(cajaNombre.getText().toString().isEmpty()){
           cajaNombre.setError(getResources().getString(R.string.error_1));
            // Toast.makeText(this,"Digite por favor el nombre",Toast.LENGTH_SHORT).show();
            return false;
        }
       if (cajaApellido.getText().toString().isEmpty()){
           cajaApellido.setError(getResources().getString(R.string.error_2));

           //Toast.makeText(this,"Digite por favor el Apellido",Toast.LENGTH_SHORT).show();
          return false;
        }
        if(cajaApellido1.getText().toString().isEmpty()){
            cajaApellido1.setError(getResources().getString(R.string.error_3));
            return false;
        }
        if (cajaApellido2.getText().toString().isEmpty()){
            cajaApellido2.setError(getResources().getString(R.string.error_4));
            return false;
        }
        if(cajaEdad.getText().toString().isEmpty()){
            cajaEdad.setError(getResources().getString(R.string.error_5));
            return false;
        }
        if(cajaSexo.getText().toString().isEmpty()){
            cajaEdad.setError(getResources().getString(R.string.error_6));
            return false;
        }
        return true;
    }
}















