package mx.itson.sistemadeasistencias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class Alumno extends AppCompatActivity {

    ListView lista;

    String [][] datos = {
            {"Optativa V","Norma Adriano","113","7:00 AM - 8:00 AM"},
            {"Computo Movil","Arturo Saiza","901","7:00 AM - 8:30 AM"},
            {"Evaluacion de Software","Ricardo Carrasco","Virtual","Virtual"},
            {"Practica Profesional III","Marco Tellechea","Virtual","Virtual"},
            {"Practica Profesional IV","Marco Tellechea","Virtual","Virtual"},
            {"Practica Profesional V","Roberto Limon","Virtual","Virtual"}
    };

    int [] imgs = {R.drawable.opt, R.drawable.comp_mov, R.drawable.eva_soft, R.drawable.prac, R.drawable.prac, R.drawable.prac};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alumno);
        getSupportActionBar().hide();

        lista = findViewById(R.id.lista);

        lista.setAdapter(new Adaptador(this, datos, imgs));
    }

    public void camara (View vista){
        Intent camara = new Intent(this, Camara.class);
        startActivity(camara);
    }


}
