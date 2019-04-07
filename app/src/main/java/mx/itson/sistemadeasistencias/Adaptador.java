package mx.itson.sistemadeasistencias;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptador extends BaseAdapter {

    private static LayoutInflater inflater = null;

    Context contexto;
    String [][] datos;
    int [] imgs;

    public Adaptador (Context con, String[][] datos, int[] imagenes){
        this.contexto = con;
        this.datos = datos;
        this.imgs = imagenes;
        inflater = (LayoutInflater)con.getSystemService(con.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        final View vista = inflater.inflate(R.layout.contenido_lista, null);

        TextView nombreMateria = (TextView) vista.findViewById(R.id.nombreMateria);
        TextView nombreMaestro = (TextView) vista.findViewById(R.id.nombreMaestro);
        TextView aula = (TextView) vista.findViewById(R.id.aula);
        TextView horario = (TextView) vista.findViewById(R.id.horario);
        ImageView imgClase = (ImageView) vista.findViewById(R.id.imgClase);
        Button btnCam = (Button) vista.findViewById(R.id.btnCam);

        nombreMateria.setText(datos[i][0]);
        nombreMaestro.setText(datos[i][1]);
        aula.setText(datos[i][2]);
        horario.setText(datos[i][3]);
        imgClase.setImageResource(imgs[i]);

        return vista;
    }

    @Override
    public int getCount() {
        return imgs.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


}
