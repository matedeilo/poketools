package com.mate.poketools.ui.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.mate.poketools.R;
import com.mate.poketools.domain.models.Pokemon;
import com.mate.poketools.ui.adapter.ListSpeciesAdapter;

/**
 * Created by mtejeda on 15/08/2016.
 */
public class ListFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list_species, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        GridView gridView = (GridView) view.findViewById(R.id.gridview);

        Pokemon pikachu = new Pokemon();
        pikachu.setName("pikachu");
        pikachu.setSpriteURL(R.drawable.pikachu);

        Pokemon[] pokemons = {pikachu, pikachu, pikachu};

        ListSpeciesAdapter listSpeciesAdapter = new ListSpeciesAdapter(getActivity(), pokemons);
        gridView.setAdapter(listSpeciesAdapter);
    }
}
