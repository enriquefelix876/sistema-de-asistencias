package mx.itson.sistemadeasistencias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class Maestro extends AppCompatActivity {

    ListView listaMaestro;

    String [][] datosMaestro = {
            {"Optativa V","113","7:00 AM - 8:00 AM"},
            {"Programacion","921","10:00 AM - 11:00 AM"},
            {"Diseño de Software","Virtual","Virtual"},
            {"Sistemas Distribuidos","414","12:00 PM - 1:00 PM"}

    };

    int [] imgsMaestro = {R.drawable.opt, R.drawable.programacion, R.drawable.dis_soft, R.drawable.sis_dist};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maestro);
        getSupportActionBar().hide();

        listaMaestro = findViewById(R.id.listaMaestro);

        listaMaestro.setAdapter(new AdaptadorMaestro(this, datosMaestro, imgsMaestro));
    }

    public void qr (View vista){
        Intent qr = new Intent(this, CodigoQR.class);
        startActivity(qr);
    }
}
