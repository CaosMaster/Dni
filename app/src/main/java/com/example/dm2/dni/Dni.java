package com.example.dm2.dni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Dni extends AppCompatActivity {

    private EditText numero;
    private EditText letra;
    private TextView mensaje;
    private String letraCorrecta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dni);

        numero=(EditText) findViewById(R.id.editnumero);
        letra=(EditText) findViewById(R.id.editletra);
        mensaje=(TextView) findViewById(R.id.txtmensaje);
    }

    public String letradni(int dninum){

        String letras[]={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        int resto=dninum%23;
        return letras[resto];

    }

    public void validar(View v) {

        int numdni;
        if (numero.getText().length() < 8 || numero.getText().length() > 8) {
            mensaje.setText("numero de caracteres del DNI erroneo \n");
        } else {
                numdni = Integer.parseInt(numero.getText().toString());
                if (!letra.getText().toString().toUpperCase().equals(letradni(numdni))) {
                    mensaje.setText("para el DNI " + numero.getText() + " corresponde la letra " + letradni(numdni));
                }else{
                    mensaje.setText("DNI validado correctamente!!!!!");

            }

        }
    }


}
