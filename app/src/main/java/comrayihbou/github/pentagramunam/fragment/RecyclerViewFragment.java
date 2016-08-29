package comrayihbou.github.pentagramunam.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import comrayihbou.github.pentagramunam.R;
import comrayihbou.github.pentagramunam.adapter.MascotasAdaptador;
import comrayihbou.github.pentagramunam.pojo.Mascotas;

/**
 * Created by Diego on 22/08/2016.
 */
public class RecyclerViewFragment extends Fragment {


    ArrayList<Mascotas> mascotas;
    private RecyclerView ListaMascotas;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        ListaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        ListaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicializarAdaptador();

        return v;
    }

    public MascotasAdaptador adaptador;

    public void inicializarAdaptador(){

        adaptador = new MascotasAdaptador(mascotas, getActivity());
        ListaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){

        //Constructor para indentificar el Arraylist como la variable contactos, utilizando todas las variables de la Clase Mascotas.java .
        mascotas = new ArrayList<Mascotas>();

        //Creando Contactos
        mascotas.add(new Mascotas(R.drawable.perro, "Perro", 0));
        mascotas.add(new Mascotas(R.drawable.gato, "Gato", 0));
        mascotas.add(new Mascotas(R.drawable.conejo, "Conejo", 0));
        mascotas.add(new Mascotas(R.drawable.hamster, "Hamster", 0));
        mascotas.add(new Mascotas(R.drawable.pez, "Pez", 0));
    }
}
