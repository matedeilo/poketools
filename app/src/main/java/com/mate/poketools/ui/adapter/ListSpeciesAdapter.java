package com.mate.poketools.ui.adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;
import com.mate.poketools.R;
import com.mate.poketools.domain.models.Pokemon;

/**
 * Created by mtejeda on 15/08/2016.
 */
public class ListSpeciesAdapter extends BaseAdapter {

    Context context;
    Pokemon[] pokemons;
    LayoutInflater inflater;

    public ListSpeciesAdapter(Context context, Pokemon[] pokemons) {
        this.context = context;
        this.pokemons = pokemons;
        inflater = LayoutInflater.from(context);
    }

    static class ViewHolder {
        TextView text;
        ImageView icon;
        GlideDrawableImageViewTarget glideDrawable;
        int position;
    }

    @Override
    public int getCount() {
        return pokemons.length;
    }

    @Override
    public Object getItem(int position) {
        return pokemons[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (null == convertView) {
            convertView = inflater.inflate(R.layout.listview_item_specie, parent, false);
            holder = new ViewHolder();
            ImageView imageView = (ImageView) convertView.findViewById(R.id.img_poke);
            holder.icon = imageView;
            holder.glideDrawable = new GlideDrawableImageViewTarget(imageView);
            holder.text = (TextView) convertView.findViewById(R.id.txt_pokename);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Glide
                .with(context)
                .load(pokemons[position].getSpriteURL())
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .crossFade()
                .into(holder.glideDrawable);
        holder.text.setText(pokemons[position].getName());

        return convertView;
    }
}
