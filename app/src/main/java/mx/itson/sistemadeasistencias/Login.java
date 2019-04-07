package mx.itson.sistemadeasistencias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        getSupportActionBar().hide();
    }

    public void alumno (View vista){
        Intent alumno = new Intent(this, Alumno.class);
        startActivity(alumno);
    }

    public void maestro (View vista){
        Intent maestro = new Intent(this, Maestro.class);
        startActivity(maestro);
    }
}
