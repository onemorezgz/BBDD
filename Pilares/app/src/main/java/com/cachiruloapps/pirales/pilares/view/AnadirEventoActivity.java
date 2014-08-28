package com.cachiruloapps.pirales.pilares.view;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.cachiruloapps.pirales.pilares.R;

/**
 * Created by javierjavier on 27/08/14.
 */
public class AnadirEventoActivity extends Activity{

    EditText etTipo,etTitulo,etDescripcion,etFecha,etHora,etLugarNombre,etLugarLatitud,etLugarLonguitud;
    Button bAnadir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anadir_evento);

        etTipo = (EditText) findViewById(R.id.etTipo);
        etTitulo = (EditText) findViewById(R.id.etTitulo);
        etDescripcion = (EditText) findViewById(R.id.etDescripcion);
        etFecha = (EditText) findViewById(R.id.etFecha);
        etHora = (EditText) findViewById(R.id.etHora);
        etLugarNombre = (EditText) findViewById(R.id.etLugarNombre);
        etLugarLatitud = (EditText) findViewById(R.id.etLugarLatitud);
        etLugarLonguitud = (EditText) findViewById(R.id.etLugarLonguitud);
        bAnadir = (Button) findViewById(R.id.bAnadir);

    }

}
