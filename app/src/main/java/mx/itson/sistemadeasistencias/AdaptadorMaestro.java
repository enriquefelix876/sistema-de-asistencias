package mx.itson.sistemadeasistencias;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AdaptadorMaestro extends BaseAdapter {

    private static LayoutInflater inflaterMaestro = null;

    Context contextoMaestro;
    String [][] datosMaestro;
    int [] imgsMaestro;

    public AdaptadorMaestro (Context conMaestro, String[][] datosMaestro, int[] imgsMaestro){
        this.contextoMaestro = conMaestro;
        this.datosMaestro = datosMaestro;
        this.imgsMaestro = imgsMaestro;
        inflaterMaestro = (LayoutInflater)conMaestro.getSystemService(conMaestro.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        final View vistaMaestro = inflaterMaestro.inflate(R.layout.contenido_listamaestro, null);

        TextView nombreMateriaMaestro = (TextView) vistaMaestro.findViewById(R.id.nombreMateriaMaestro);
        TextView aulaMaestro = (TextView) vistaMaestro.findViewById(R.id.aulaMaestro);
        TextView horarioMaestro = (TextView) vistaMaestro.findViewById(R.id.horarioMaestro);
        ImageView imgClaseMaestro = (ImageView) vistaMaestro.findViewById(R.id.imgClaseMaestro);
        Button btnQR = (Button) vistaMaestro.findViewById(R.id.btnQR);

        nombreMateriaMaestro.setText(datosMaestro[i][0]);
        aulaMaestro.setText(datosMaestro[i][1]);
        horarioMaestro.setText(datosMaestro[i][2]);
        imgClaseMaestro.setImageResource(imgsMaestro[i]);

        return vistaMaestro;
    }

    @Override
    public int getCount() {
        return imgsMaestro.length;
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
