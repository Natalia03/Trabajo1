package com.example.soporte.holamundo;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Saludo extends AppCompatActivity {

    private TextView saludo;
    private Bundle b;
    private String nomb, apell, apell1, apell2, edad, sexo,aux;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        saludo = (TextView)findViewById(R.id.txtSaludo);
        b = getIntent().getExtras();
        nomb = b.getString("Nombre");
        apell = b.getString("Apellido");
        apell1 = b.getString("Apellido1");
        apell2 = b.getString("Apellido2");
        edad = b.getString("Edad");
        sexo = b.getString("Sexo");

        res = this.getResources();

        aux = res.getString(R.string.parte_saludo)+" "+nomb+" "+apell+" "+apell1+" "+apell2+" "+res.getString(R.string.parte_saludo2)+" "+edad+" "+res.getString(R.string.parte_saludo3)+" "+sexo;
        saludo.setText(aux);

    }
}
