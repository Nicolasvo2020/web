package com.example.web;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etWeb;
    Button btnNavegar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        //enlazar la parte de logica del diseño
        etWeb = (EditText)findViewById(R.id.etWed);
    }
    //metodo boton ir
    public void navegar (View view) {
        Intent i = new Intent( this, WebVisor.class);
        i.putExtra("SitioWeb" , etWeb.getText().toString());
        startActivity(i);
    }

}