package mx.itson.sistemadeasistencias;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Camara extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.camara);
        getSupportActionBar().hide();
    }

    public void inicio (View vista){
        Intent inicio = new Intent(this, Login.class);
        startActivity(inicio);
    }


}
